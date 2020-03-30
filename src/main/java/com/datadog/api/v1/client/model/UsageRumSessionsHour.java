/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Number of RUM Sessions recorded for each hour for a given organization.
 */
@ApiModel(description = "Number of RUM Sessions recorded for each hour for a given organization.")
@JsonPropertyOrder({
  UsageRumSessionsHour.JSON_PROPERTY_HOUR,
  UsageRumSessionsHour.JSON_PROPERTY_SESSION_COUNT
})

public class UsageRumSessionsHour {
  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_SESSION_COUNT = "session_count";
  private Long sessionCount;


  public UsageRumSessionsHour hour(OffsetDateTime hour) {
    
    this.hour = hour;
    return this;
  }

   /**
   * The hour for the usage.
   * @return hour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hour for the usage.")
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getHour() {
    return hour;
  }


  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }


  public UsageRumSessionsHour sessionCount(Long sessionCount) {
    
    this.sessionCount = sessionCount;
    return this;
  }

   /**
   * Contains the number of RUM Sessions.
   * @return sessionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of RUM Sessions.")
  @JsonProperty(JSON_PROPERTY_SESSION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSessionCount() {
    return sessionCount;
  }


  public void setSessionCount(Long sessionCount) {
    this.sessionCount = sessionCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageRumSessionsHour usageRumSessionsHour = (UsageRumSessionsHour) o;
    return Objects.equals(this.hour, usageRumSessionsHour.hour) &&
        Objects.equals(this.sessionCount, usageRumSessionsHour.sessionCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, sessionCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageRumSessionsHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
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
