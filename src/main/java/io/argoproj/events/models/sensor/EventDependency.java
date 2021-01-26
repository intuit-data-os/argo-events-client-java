/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.2.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.events.models.sensor;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.events.models.sensor.EventDependencyFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EventDependency describes a dependency
 */
@ApiModel(description = "EventDependency describes a dependency")

public class EventDependency {
  public static final String SERIALIZED_NAME_EVENT_NAME = "eventName";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  public static final String SERIALIZED_NAME_EVENT_SOURCE_NAME = "eventSourceName";
  @SerializedName(SERIALIZED_NAME_EVENT_SOURCE_NAME)
  private String eventSourceName;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private EventDependencyFilter filters;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public EventDependency eventName(String eventName) {
    
    this.eventName = eventName;
    return this;
  }

   /**
   * EventName is the name of the event
   * @return eventName
  **/
  @ApiModelProperty(required = true, value = "EventName is the name of the event")

  public String getEventName() {
    return eventName;
  }


  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  public EventDependency eventSourceName(String eventSourceName) {
    
    this.eventSourceName = eventSourceName;
    return this;
  }

   /**
   * EventSourceName is the name of EventSource that Sensor depends on
   * @return eventSourceName
  **/
  @ApiModelProperty(required = true, value = "EventSourceName is the name of EventSource that Sensor depends on")

  public String getEventSourceName() {
    return eventSourceName;
  }


  public void setEventSourceName(String eventSourceName) {
    this.eventSourceName = eventSourceName;
  }


  public EventDependency filters(EventDependencyFilter filters) {
    
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventDependencyFilter getFilters() {
    return filters;
  }


  public void setFilters(EventDependencyFilter filters) {
    this.filters = filters;
  }


  public EventDependency name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is a unique name of this dependency
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is a unique name of this dependency")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDependency eventDependency = (EventDependency) o;
    return Objects.equals(this.eventName, eventDependency.eventName) &&
        Objects.equals(this.eventSourceName, eventDependency.eventSourceName) &&
        Objects.equals(this.filters, eventDependency.filters) &&
        Objects.equals(this.name, eventDependency.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, eventSourceName, filters, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDependency {\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventSourceName: ").append(toIndentedString(eventSourceName)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

