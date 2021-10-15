/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.4.0
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
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AzureEventsHubEventSource describes the event source for azure events hub More info at https://docs.microsoft.com/en-us/azure/event-hubs/
 */
@ApiModel(description = "AzureEventsHubEventSource describes the event source for azure events hub More info at https://docs.microsoft.com/en-us/azure/event-hubs/")

public class AzureEventsHubEventSource {
  public static final String SERIALIZED_NAME_SHARED_ACCESS_KEY_NAME = "sharedAccessKeyName";
  @SerializedName(SERIALIZED_NAME_SHARED_ACCESS_KEY_NAME)
  private V1SecretKeySelector sharedAccessKeyName = null;

  public static final String SERIALIZED_NAME_SHARED_ACCESS_KEY = "sharedAccessKey";
  @SerializedName(SERIALIZED_NAME_SHARED_ACCESS_KEY)
  private V1SecretKeySelector sharedAccessKey = null;

  public static final String SERIALIZED_NAME_HUB_NAME = "hubName";
  @SerializedName(SERIALIZED_NAME_HUB_NAME)
  private String hubName;

  public static final String SERIALIZED_NAME_FQDN = "fqdn";
  @SerializedName(SERIALIZED_NAME_FQDN)
  private String fqdn;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public AzureEventsHubEventSource sharedAccessKeyName(V1SecretKeySelector sharedAccessKeyName) {
    
    this.sharedAccessKeyName = sharedAccessKeyName;
    return this;
  }

   /**
   * Get sharedAccessKeyName
   * @return sharedAccessKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getSharedAccessKeyName() {
    return sharedAccessKeyName;
  }


  public void setSharedAccessKeyName(V1SecretKeySelector sharedAccessKeyName) {
    this.sharedAccessKeyName = sharedAccessKeyName;
  }


  public AzureEventsHubEventSource sharedAccessKey(V1SecretKeySelector sharedAccessKey) {
    
    this.sharedAccessKey = sharedAccessKey;
    return this;
  }

   /**
   * Get sharedAccessKey
   * @return sharedAccessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getSharedAccessKey() {
    return sharedAccessKey;
  }


  public void setSharedAccessKey(V1SecretKeySelector sharedAccessKey) {
    this.sharedAccessKey = sharedAccessKey;
  }


  public AzureEventsHubEventSource hubName(String hubName) {
    
    this.hubName = hubName;
    return this;
  }

   /**
   * Event Hub path/name
   * @return hubName
  **/
  @ApiModelProperty(required = true, value = "Event Hub path/name")

  public String getHubName() {
    return hubName;
  }


  public void setHubName(String hubName) {
    this.hubName = hubName;
  }


  public AzureEventsHubEventSource fqdn(String fqdn) {
    
    this.fqdn = fqdn;
    return this;
  }

   /**
   * FQDN of the EventHubs namespace you created More info at https://docs.microsoft.com/en-us/azure/event-hubs/event-hubs-get-connection-string
   * @return fqdn
  **/
  @ApiModelProperty(required = true, value = "FQDN of the EventHubs namespace you created More info at https://docs.microsoft.com/en-us/azure/event-hubs/event-hubs-get-connection-string")

  public String getFqdn() {
    return fqdn;
  }


  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }


  public AzureEventsHubEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public AzureEventsHubEventSource putMetadataItem(String key, String metadataItem) {
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
    AzureEventsHubEventSource azureEventsHubEventSource = (AzureEventsHubEventSource) o;
    return Objects.equals(this.sharedAccessKeyName, azureEventsHubEventSource.sharedAccessKeyName) &&
        Objects.equals(this.sharedAccessKey, azureEventsHubEventSource.sharedAccessKey) &&
        Objects.equals(this.hubName, azureEventsHubEventSource.hubName) &&
        Objects.equals(this.fqdn, azureEventsHubEventSource.fqdn) &&
        Objects.equals(this.metadata, azureEventsHubEventSource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedAccessKeyName, sharedAccessKey, hubName, fqdn, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureEventsHubEventSource {\n");
    sb.append("    sharedAccessKeyName: ").append(toIndentedString(sharedAccessKeyName)).append("\n");
    sb.append("    sharedAccessKey: ").append(toIndentedString(sharedAccessKey)).append("\n");
    sb.append("    hubName: ").append(toIndentedString(hubName)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
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

