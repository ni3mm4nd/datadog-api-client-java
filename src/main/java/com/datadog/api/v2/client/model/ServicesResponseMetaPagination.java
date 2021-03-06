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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * Pagination properties.
 */
@ApiModel(description = "Pagination properties.")
@JsonPropertyOrder({
  ServicesResponseMetaPagination.JSON_PROPERTY_NEXT_OFFSET,
  ServicesResponseMetaPagination.JSON_PROPERTY_OFFSET,
  ServicesResponseMetaPagination.JSON_PROPERTY_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServicesResponseMetaPagination {
  public static final String JSON_PROPERTY_NEXT_OFFSET = "next_offset";
  private Long nextOffset;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Long offset;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;


  public ServicesResponseMetaPagination nextOffset(Long nextOffset) {
    this.nextOffset = nextOffset;
    return this;
  }

   /**
   * The index of the first element in the next page of results. Equal to page size added to the current offset.
   * @return nextOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "The index of the first element in the next page of results. Equal to page size added to the current offset.")
  @JsonProperty(JSON_PROPERTY_NEXT_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNextOffset() {
    return nextOffset;
  }


  public void setNextOffset(Long nextOffset) {
    this.nextOffset = nextOffset;
  }


  public ServicesResponseMetaPagination offset(Long offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The index of the first element in the results.
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "The index of the first element in the results.")
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOffset() {
    return offset;
  }


  public void setOffset(Long offset) {
    this.offset = offset;
  }


  public ServicesResponseMetaPagination size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Maximum size of pages to return.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Maximum size of pages to return.")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  /**
   * Return true if this ServicesResponse_meta_pagination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesResponseMetaPagination servicesResponseMetaPagination = (ServicesResponseMetaPagination) o;
    return Objects.equals(this.nextOffset, servicesResponseMetaPagination.nextOffset) &&
        Objects.equals(this.offset, servicesResponseMetaPagination.offset) &&
        Objects.equals(this.size, servicesResponseMetaPagination.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextOffset, offset, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesResponseMetaPagination {\n");
    sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

