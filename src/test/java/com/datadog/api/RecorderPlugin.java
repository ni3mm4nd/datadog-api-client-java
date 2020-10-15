package com.datadog.api;

import static com.github.tomakehurst.wiremock.client.WireMock.recordSpec;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.recording.RecordSpec;

import io.cucumber.plugin.EventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.TestCaseFinished;
import io.cucumber.plugin.event.TestCaseStarted;
import io.cucumber.plugin.event.TestRunFinished;
import io.cucumber.plugin.event.TestRunStarted;

public class RecorderPlugin implements EventListener {

    protected static final String cassettesDir = "src/test/resources/scenarios/cassettes";

    public static String host = "localhost";
    public static int port = 18080 + Integer.parseInt(System.getProperty("surefireForkNumber"));

    public static String getUrl() {
        return "http://" + host + ":" + port;
    }

    private WireMockServer server;

    public RecorderPlugin() {
        System.out.println("RecorderPlugin.RecorderPlugin()");
        server = new WireMockServer(wireMockConfig().port(port).withRootDirectory(cassettesDir));
    }

    private void receiveTestRunStarted(TestRunStarted event) {
        server.start();
    }

    private void receiveTestRunFinished(TestRunFinished event) {
        server.stop();
    }

    private void receiveTestCaseStarted(TestCaseStarted event) {
        System.out.println(event.getTestCase().getName());
        server.startRecording(config());

    }

    private void receiveTestCaseFinished(TestCaseFinished event) {
        server.stopRecording();
        server.saveMappings();
        server.resetAll();
    }

    private RecordSpec config() {
        return recordSpec().forTarget("https://api.datadoghq.com").makeStubsPersistent(true).build();
    }

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestRunStarted.class, this::receiveTestRunStarted);
        publisher.registerHandlerFor(TestRunFinished.class, this::receiveTestRunFinished);
        publisher.registerHandlerFor(TestCaseStarted.class, this::receiveTestCaseStarted);
        publisher.registerHandlerFor(TestCaseFinished.class, this::receiveTestCaseFinished);
    }
}
