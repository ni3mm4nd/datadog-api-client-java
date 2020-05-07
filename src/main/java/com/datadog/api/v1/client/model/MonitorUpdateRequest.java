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
import com.datadog.api.v1.client.model.Creator;
import com.datadog.api.v1.client.model.MonitorOptions;
import com.datadog.api.v1.client.model.MonitorOverallStates;
import com.datadog.api.v1.client.model.MonitorState;
import com.datadog.api.v1.client.model.MonitorType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object describing a monitor.
 */
@ApiModel(description = "Object describing a monitor.")
@JsonPropertyOrder({
  MonitorUpdateRequest.JSON_PROPERTY_CREATED,
  MonitorUpdateRequest.JSON_PROPERTY_CREATOR,
  MonitorUpdateRequest.JSON_PROPERTY_DELETED,
  MonitorUpdateRequest.JSON_PROPERTY_ID,
  MonitorUpdateRequest.JSON_PROPERTY_MESSAGE,
  MonitorUpdateRequest.JSON_PROPERTY_MODIFIED,
  MonitorUpdateRequest.JSON_PROPERTY_MULTI,
  MonitorUpdateRequest.JSON_PROPERTY_NAME,
  MonitorUpdateRequest.JSON_PROPERTY_OPTIONS,
  MonitorUpdateRequest.JSON_PROPERTY_OVERALL_STATE,
  MonitorUpdateRequest.JSON_PROPERTY_QUERY,
  MonitorUpdateRequest.JSON_PROPERTY_STATE,
  MonitorUpdateRequest.JSON_PROPERTY_TAGS,
  MonitorUpdateRequest.JSON_PROPERTY_TYPE
})

public class MonitorUpdateRequest {
  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private Creator creator;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private JsonNullable<OffsetDateTime> deleted = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_MULTI = "multi";
  private Boolean multi;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private MonitorOptions options;

  public static final String JSON_PROPERTY_OVERALL_STATE = "overall_state";
  private MonitorOverallStates overallState;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_STATE = "state";
  private MonitorState state;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MonitorType type;


   /**
   * Timestamp of the monitor creation.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of the monitor creation.")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreated() {
    return created;
  }




  public MonitorUpdateRequest creator(Creator creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Creator getCreator() {
    return creator;
  }


  public void setCreator(Creator creator) {
    this.creator = creator;
  }


   /**
   * Whether or not the monitor is deleted. (Always &#x60;null&#x60;)
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the monitor is deleted. (Always `null`)")
  @JsonIgnore

  public OffsetDateTime getDeleted() {
    
    if (deleted == null) {
      deleted = JsonNullable.<OffsetDateTime>undefined();
    }
    return deleted.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getDeleted_JsonNullable() {
    return deleted;
  }
  
  @JsonProperty(JSON_PROPERTY_DELETED)
  private void setDeleted_JsonNullable(JsonNullable<OffsetDateTime> deleted) {
    this.deleted = deleted;
  }



   /**
   * ID of this monitor.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of this monitor.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }




  public MonitorUpdateRequest message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A message to include with notifications for this monitor.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A message to include with notifications for this monitor.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


   /**
   * Last timestamp when the monitor was edited.
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last timestamp when the monitor was edited.")
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModified() {
    return modified;
  }




   /**
   * Whether or not the monitor is broken down on different groups.
   * @return multi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the monitor is broken down on different groups.")
  @JsonProperty(JSON_PROPERTY_MULTI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMulti() {
    return multi;
  }




  public MonitorUpdateRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The monitor name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The monitor name.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MonitorUpdateRequest options(MonitorOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitorOptions getOptions() {
    return options;
  }


  public void setOptions(MonitorOptions options) {
    this.options = options;
  }


  public MonitorUpdateRequest overallState(MonitorOverallStates overallState) {
    
    this.overallState = overallState;
    return this;
  }

   /**
   * Get overallState
   * @return overallState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERALL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitorOverallStates getOverallState() {
    return overallState;
  }


  public void setOverallState(MonitorOverallStates overallState) {
    this.overallState = overallState;
  }


  public MonitorUpdateRequest query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * The monitor query.
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The monitor query.")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public MonitorUpdateRequest state(MonitorState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitorState getState() {
    return state;
  }


  public void setState(MonitorState state) {
    this.state = state;
  }


  public MonitorUpdateRequest tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public MonitorUpdateRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags associated to your monitor.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags associated to your monitor.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public MonitorUpdateRequest type(MonitorType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitorType getType() {
    return type;
  }


  public void setType(MonitorType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorUpdateRequest monitorUpdateRequest = (MonitorUpdateRequest) o;
    return Objects.equals(this.created, monitorUpdateRequest.created) &&
        Objects.equals(this.creator, monitorUpdateRequest.creator) &&
        Objects.equals(this.deleted, monitorUpdateRequest.deleted) &&
        Objects.equals(this.id, monitorUpdateRequest.id) &&
        Objects.equals(this.message, monitorUpdateRequest.message) &&
        Objects.equals(this.modified, monitorUpdateRequest.modified) &&
        Objects.equals(this.multi, monitorUpdateRequest.multi) &&
        Objects.equals(this.name, monitorUpdateRequest.name) &&
        Objects.equals(this.options, monitorUpdateRequest.options) &&
        Objects.equals(this.overallState, monitorUpdateRequest.overallState) &&
        Objects.equals(this.query, monitorUpdateRequest.query) &&
        Objects.equals(this.state, monitorUpdateRequest.state) &&
        Objects.equals(this.tags, monitorUpdateRequest.tags) &&
        Objects.equals(this.type, monitorUpdateRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, creator, deleted, id, message, modified, multi, name, options, overallState, query, state, tags, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorUpdateRequest {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    multi: ").append(toIndentedString(multi)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    overallState: ").append(toIndentedString(overallState)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
