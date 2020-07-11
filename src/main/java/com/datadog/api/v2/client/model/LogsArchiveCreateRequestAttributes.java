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
import com.datadog.api.v2.client.model.LogsArchiveCreateRequestDestination;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * The attributes associated with the archive.
 */
@ApiModel(description = "The attributes associated with the archive.")
@JsonPropertyOrder({
  LogsArchiveCreateRequestAttributes.JSON_PROPERTY_DESTINATION,
  LogsArchiveCreateRequestAttributes.JSON_PROPERTY_NAME,
  LogsArchiveCreateRequestAttributes.JSON_PROPERTY_QUERY
})

public class LogsArchiveCreateRequestAttributes {
  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private LogsArchiveCreateRequestDestination destination;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;


  public LogsArchiveCreateRequestAttributes destination(LogsArchiveCreateRequestDestination destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LogsArchiveCreateRequestDestination getDestination() {
    return destination;
  }


  public void setDestination(LogsArchiveCreateRequestDestination destination) {
    this.destination = destination;
  }


  public LogsArchiveCreateRequestAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The archive name.
   * @return name
  **/
  @ApiModelProperty(example = "Nginx Archive", required = true, value = "The archive name.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LogsArchiveCreateRequestAttributes query(String query) {
    this.query = query;
    return this;
  }

   /**
   * The archive query/filter. Logs matching this query are included in the archive.
   * @return query
  **/
  @ApiModelProperty(example = "source:nginx", required = true, value = "The archive query/filter. Logs matching this query are included in the archive.")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveCreateRequestAttributes logsArchiveCreateRequestAttributes = (LogsArchiveCreateRequestAttributes) o;
    return Objects.equals(this.destination, logsArchiveCreateRequestAttributes.destination) &&
        Objects.equals(this.name, logsArchiveCreateRequestAttributes.name) &&
        Objects.equals(this.query, logsArchiveCreateRequestAttributes.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, name, query);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveCreateRequestAttributes {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
