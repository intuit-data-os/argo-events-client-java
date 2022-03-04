/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.6.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.events.models.eventsource;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.events.models.eventsource.ResourceFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ResourceEventSource refers to a event-source for K8s resource related events.
 */
@ApiModel(description = "ResourceEventSource refers to a event-source for K8s resource related events.")

public class ResourceEventSource {
  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private ResourceFilter filter;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_EVENT_TYPES = "eventTypes";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  private List<String> eventTypes = new ArrayList<String>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public ResourceEventSource resource(String resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @ApiModelProperty(required = true, value = "")

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  public ResourceEventSource namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace where resource is deployed
   * @return namespace
  **/
  @ApiModelProperty(required = true, value = "Namespace where resource is deployed")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public ResourceEventSource group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(required = true, value = "")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public ResourceEventSource filter(ResourceFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceFilter getFilter() {
    return filter;
  }


  public void setFilter(ResourceFilter filter) {
    this.filter = filter;
  }


  public ResourceEventSource version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ResourceEventSource eventTypes(List<String> eventTypes) {
    
    this.eventTypes = eventTypes;
    return this;
  }

  public ResourceEventSource addEventTypesItem(String eventTypesItem) {
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * EventTypes is the list of event type to watch. Possible values are - ADD, UPDATE and DELETE.
   * @return eventTypes
  **/
  @ApiModelProperty(required = true, value = "EventTypes is the list of event type to watch. Possible values are - ADD, UPDATE and DELETE.")

  public List<String> getEventTypes() {
    return eventTypes;
  }


  public void setEventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public ResourceEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public ResourceEventSource putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata holds the user defined metadata which will passed along the event payload.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata holds the user defined metadata which will passed along the event payload.")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceEventSource resourceEventSource = (ResourceEventSource) o;
    return Objects.equals(this.resource, resourceEventSource.resource) &&
        Objects.equals(this.namespace, resourceEventSource.namespace) &&
        Objects.equals(this.group, resourceEventSource.group) &&
        Objects.equals(this.filter, resourceEventSource.filter) &&
        Objects.equals(this.version, resourceEventSource.version) &&
        Objects.equals(this.eventTypes, resourceEventSource.eventTypes) &&
        Objects.equals(this.metadata, resourceEventSource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, namespace, group, filter, version, eventTypes, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceEventSource {\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

