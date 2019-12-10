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
 * CanDeleteMonitorResponseData
 */
@JsonPropertyOrder({
  CanDeleteMonitorResponseData.JSON_PROPERTY_OK
})

public class CanDeleteMonitorResponseData {
  public static final String JSON_PROPERTY_OK = "ok";
  private List<Long> ok = null;


  public CanDeleteMonitorResponseData ok(List<Long> ok) {
    
    this.ok = ok;
    return this;
  }

  public CanDeleteMonitorResponseData addOkItem(Long okItem) {
    if (this.ok == null) {
      this.ok = new ArrayList<Long>();
    }
    this.ok.add(okItem);
    return this;
  }

   /**
   * An array of of Monitor IDs that can be safely deleted.
   * @return ok
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of of Monitor IDs that can be safely deleted.")
  @JsonProperty(JSON_PROPERTY_OK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getOk() {
    return ok;
  }


  public void setOk(List<Long> ok) {
    this.ok = ok;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CanDeleteMonitorResponseData canDeleteMonitorResponseData = (CanDeleteMonitorResponseData) o;
    return Objects.equals(this.ok, canDeleteMonitorResponseData.ok);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CanDeleteMonitorResponseData {\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
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
