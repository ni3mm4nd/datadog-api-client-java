/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.ApiKey;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ApiKeyListResponse
 */
@JsonPropertyOrder({
  ApiKeyListResponse.JSON_PROPERTY_API_KEYS
})

public class ApiKeyListResponse {
  public static final String JSON_PROPERTY_API_KEYS = "api_keys";
  private List<ApiKey> apiKeys = null;


  public ApiKeyListResponse apiKeys(List<ApiKey> apiKeys) {
    
    this.apiKeys = apiKeys;
    return this;
  }

  public ApiKeyListResponse addApiKeysItem(ApiKey apiKeysItem) {
    if (this.apiKeys == null) {
      this.apiKeys = new ArrayList<ApiKey>();
    }
    this.apiKeys.add(apiKeysItem);
    return this;
  }

   /**
   * Get apiKeys
   * @return apiKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_API_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiKey> getApiKeys() {
    return apiKeys;
  }


  public void setApiKeys(List<ApiKey> apiKeys) {
    this.apiKeys = apiKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyListResponse apiKeyListResponse = (ApiKeyListResponse) o;
    return Objects.equals(this.apiKeys, apiKeyListResponse.apiKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyListResponse {\n");
    sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
