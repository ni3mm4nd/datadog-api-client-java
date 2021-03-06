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
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.ImageWidgetDefinitionType;
import com.datadog.api.v1.client.model.WidgetImageSizing;
import com.datadog.api.v1.client.model.WidgetMargin;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * The image widget allows you to embed an image on your dashboard. An image can be a PNG, JPG, or animated GIF. Only available on FREE layout dashboards.
 */
@ApiModel(description = "The image widget allows you to embed an image on your dashboard. An image can be a PNG, JPG, or animated GIF. Only available on FREE layout dashboards.")
@JsonPropertyOrder({
  ImageWidgetDefinition.JSON_PROPERTY_MARGIN,
  ImageWidgetDefinition.JSON_PROPERTY_SIZING,
  ImageWidgetDefinition.JSON_PROPERTY_TYPE,
  ImageWidgetDefinition.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ImageWidgetDefinition {
  public static final String JSON_PROPERTY_MARGIN = "margin";
  private WidgetMargin margin;

  public static final String JSON_PROPERTY_SIZING = "sizing";
  private WidgetImageSizing sizing;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ImageWidgetDefinitionType type = ImageWidgetDefinitionType.IMAGE;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;


  public ImageWidgetDefinition margin(WidgetMargin margin) {
    this.margin = margin;
    return this;
  }

   /**
   * Get margin
   * @return margin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetMargin getMargin() {
    return margin;
  }


  public void setMargin(WidgetMargin margin) {
    this.margin = margin;
  }


  public ImageWidgetDefinition sizing(WidgetImageSizing sizing) {
    this.sizing = sizing;
    return this;
  }

   /**
   * Get sizing
   * @return sizing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIZING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetImageSizing getSizing() {
    return sizing;
  }


  public void setSizing(WidgetImageSizing sizing) {
    this.sizing = sizing;
  }


  public ImageWidgetDefinition type(ImageWidgetDefinitionType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ImageWidgetDefinitionType getType() {
    return type;
  }


  public void setType(ImageWidgetDefinitionType type) {
    this.type = type;
  }


  public ImageWidgetDefinition url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of the image.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL of the image.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this ImageWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageWidgetDefinition imageWidgetDefinition = (ImageWidgetDefinition) o;
    return Objects.equals(this.margin, imageWidgetDefinition.margin) &&
        Objects.equals(this.sizing, imageWidgetDefinition.sizing) &&
        Objects.equals(this.type, imageWidgetDefinition.type) &&
        Objects.equals(this.url, imageWidgetDefinition.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(margin, sizing, type, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageWidgetDefinition {\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    sizing: ").append(toIndentedString(sizing)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

