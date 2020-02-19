/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.model.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * API tests for HostsApi
 */
public class HostsApiTest extends V1ApiTest {

    private static HostsApi api;
    private static HostsApi unitAPI;
    private static MetricsApi metricsAPI;
    private static TagsApi tagsAPI;

    @BeforeClass
    public static void initAPI() {
        api = new HostsApi(generalApiClient);
        unitAPI = new HostsApi(generalApiUnitTestClient);
        metricsAPI = new MetricsApi(generalApiClient);
        tagsAPI = new TagsApi(generalApiClient);
    }

    /**
     * Get all hosts for your organization
     *
     * ## Search Hosts This endpoint allows searching for hosts by name, alias, or tag. Hosts live within the past 3 hours are included. Results are paginated with a max of 1000 results at a time. ### Arguments: * **&#x60;filter&#x60;** [*optional*, *default* &#x3D; **None**]: Query string to filter search results. * **&#x60;sort_field&#x60;** [*optional*, *default* &#x3D; **cpu**]: Sort hosts by the given field. Options: **status, apps, cpu, iowait, load** * **&#x60;sort_dir&#x60;** [*optional*, *default* &#x3D; **desc**]: Direction of sort. Options: **asc, desc** * **&#x60;start&#x60;** [*optional*, *default* &#x3D; **0**]: Host result to start search from. * **&#x60;count&#x60;** [*optional*, *default* &#x3D; **100**]: Number of host results to return. Max 1000. * **&#x60;from&#x60;** [*optional*, *default* &#x3D; **now - 2 hours**]: Number of seconds since UNIX epoch from which you want to search your hosts.
     *
     * @throws ApiException
     *          if the Api call fails
     *
     * @throws TestUtils.RetryException
     *          if the specified resource couldn't be retrieved in a set timeframe
     */
    @Test
    public void hostsTest() throws ApiException, TestUtils.RetryException {
        long now = System.currentTimeMillis()/1000;
        String hostname = String.format("java-client-test-host-%d", now);
        List<Double> p1 = new ArrayList<>();
        p1.add((double) now);
        p1.add(0.);

        // create host by sending a metric
        MetricsPayload metricsPayload= new MetricsPayload()
                .addSeriesItem(new Series()
                        .addPointsItem(p1)
                        .host(hostname)
                        .metric("java.client.test.metric"));
        IntakePayloadAccepted response = metricsAPI.submitMetrics().body(metricsPayload).execute();
        assertEquals("ok", response.getStatus());

        // wait for host to appear
        TestUtils.retry(10, 10, () -> {
            MetricsListResponse metrics;
            try {
                HostTags hostTagsResp = tagsAPI.getHostTags(hostname).execute();
            } catch(ApiException e) {
                System.out.println(String.format("Error getting list of host tags: %s", e));
                return false;
            }
            return true;
        });

        // test methods
        HostMuteSettings muteSettings = new HostMuteSettings()
                .message("muting for java tests")
                .end(now + 60);
        HostMuteResponse hostMuteResp = api.muteHost(hostname).body(muteSettings).execute();
        assertEquals("muting for java tests", hostMuteResp.getMessage());
        assertEquals(hostname, hostMuteResp.getHostname());
        assertEquals(now+60, hostMuteResp.getEnd().longValue());
        assertEquals("Muted", hostMuteResp.getAction());

        // Update the mute settings for this host
        muteSettings = new HostMuteSettings()
                .message("muting for test - updating")
                .end(now + 120);

        // This should fail since the override flag isn't set to true
        boolean failedAsExpected = false;
        try {
            api.muteHost(hostname).body(muteSettings).execute();
        } catch (ApiException e) {
            failedAsExpected = true;
        } finally {
            assertEquals(true, failedAsExpected);
        }

        // Set the override bit and confirm we can update the mute settings for this host
        muteSettings.override(true);
        hostMuteResp = api.muteHost(hostname).body(muteSettings).execute();
        assertEquals("muting for test - updating", hostMuteResp.getMessage());
        assertEquals(hostname, hostMuteResp.getHostname());
        assertEquals( now + 120, hostMuteResp.getEnd().longValue());
        assertEquals("Muted", hostMuteResp.getAction());

        // Unmute the host
        hostMuteResp = api.unmuteHost(hostname).execute();
        assertEquals("Unmuted", hostMuteResp.getAction());
        assertEquals(hostname, hostMuteResp.getHostname());
    }
    
    /**
     * Get total number of active hosts in your Datadog Account
     *
     * ## Get Host totals This endpoint returns the total number of active and up hosts in your Datadog account. Active means the host has reported in the past hour, and up means it has reported in the past two hours. ### Arguments: * **&#x60;from&#x60;** [*optional*, *default*&#x3D; **now - 2 hours**]:  Number of seconds since UNIX epoch from which you want to get the total number of active and up hosts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hostTotalsMockedTest() throws ApiException, IOException {
        stubFor(get(urlPathEqualTo("/api/v1/hosts/totals"))
                .withQueryParam("api_key", equalTo(TEST_API_KEY_NAME))
                .withQueryParam("application_key", equalTo(TEST_APP_KEY_NAME))
                .withQueryParam("from", equalTo("123"))
                .willReturn(okJson(TestUtils.getFixture("v1/client/api/hosts_fixtures/host_totals.json")))
        );

        HostTotals actual = unitAPI.getHostTotals().from(123L).execute();
        assertEquals(20L, actual.getTotalActive().longValue());
        assertEquals(10L, actual.getTotalUp().longValue());
    }


    /**
     * Search hosts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hostsSearchMockedTest() throws ApiException, IOException {
        String fixtureData = TestUtils.getFixture("v1/client/api/hosts_fixtures/host_search.json");
        stubFor(get(urlPathEqualTo("/api/v1/hosts"))
                .withQueryParam("api_key", equalTo(TEST_API_KEY_NAME))
                .withQueryParam("application_key", equalTo(TEST_APP_KEY_NAME))
                .withQueryParam("filter", equalTo("filter string"))
                .withQueryParam("count", equalTo("4"))
                .withQueryParam("from", equalTo("123"))
                .withQueryParam("sort_dir", equalTo("asc"))
                .withQueryParam("sort_field", equalTo("status"))
                .withQueryParam("start", equalTo("3"))
                .willReturn(okJson(fixtureData))
        );

        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

        HostListResponse response = unitAPI.getAllHosts()
                .filter("filter string")
                .count(4L)
                .from(123L)
                .sortDir("asc")
                .sortField("status")
                .start(3L).execute();
        HostListResponse expected = mapper.readValue(fixtureData, HostListResponse.class);

        assertEquals(expected, response);
    }
    
}