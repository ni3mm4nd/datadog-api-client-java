/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * Search filters for listing security signals.
 */
@ApiModel(description = "Search filters for listing security signals.")
@JsonPropertyOrder({
  SecurityMonitoringSignalListRequestFilter.JSON_PROPERTY_FROM,
  SecurityMonitoringSignalListRequestFilter.JSON_PROPERTY_QUERY,
  SecurityMonitoringSignalListRequestFilter.JSON_PROPERTY_TO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityMonitoringSignalListRequestFilter {
  public static final String JSON_PROPERTY_FROM = "from";
  private OffsetDateTime from;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TO = "to";
  private OffsetDateTime to;


  public SecurityMonitoringSignalListRequestFilter from(OffsetDateTime from) {
    this.from = from;
    return this;
  }

   /**
   * The minimum timestamp for requested security signals.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-02T09:42:36.320Z", value = "The minimum timestamp for requested security signals.")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFrom() {
    return from;
  }


  public void setFrom(OffsetDateTime from) {
    this.from = from;
  }


  public SecurityMonitoringSignalListRequestFilter query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Search query for listing security signals.
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "security:attack status:high", value = "Search query for listing security signals.")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public SecurityMonitoringSignalListRequestFilter to(OffsetDateTime to) {
    this.to = to;
    return this;
  }

   /**
   * The maximum timestamp for requested security signals.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-03T09:42:36.320Z", value = "The maximum timestamp for requested security signals.")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTo() {
    return to;
  }


  public void setTo(OffsetDateTime to) {
    this.to = to;
  }


  /**
   * Return true if this SecurityMonitoringSignalListRequest_filter object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalListRequestFilter securityMonitoringSignalListRequestFilter = (SecurityMonitoringSignalListRequestFilter) o;
    return Objects.equals(this.from, securityMonitoringSignalListRequestFilter.from) &&
        Objects.equals(this.query, securityMonitoringSignalListRequestFilter.query) &&
        Objects.equals(this.to, securityMonitoringSignalListRequestFilter.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, query, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalListRequestFilter {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

