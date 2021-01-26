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


package io.argoproj.events.models.eventsource;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.events.models.eventsource.WebhookContext;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * StripeEventSource describes the event source for stripe webhook notifications More info at https://stripe.com/docs/webhooks
 */
@ApiModel(description = "StripeEventSource describes the event source for stripe webhook notifications More info at https://stripe.com/docs/webhooks")

public class StripeEventSource {
  public static final String SERIALIZED_NAME_CREATE_WEBHOOK = "createWebhook";
  @SerializedName(SERIALIZED_NAME_CREATE_WEBHOOK)
  private Boolean createWebhook;

  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private V1SecretKeySelector apiKey = null;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private WebhookContext webhook;

  public static final String SERIALIZED_NAME_EVENT_FILTER = "eventFilter";
  @SerializedName(SERIALIZED_NAME_EVENT_FILTER)
  private List<String> eventFilter = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public StripeEventSource createWebhook(Boolean createWebhook) {
    
    this.createWebhook = createWebhook;
    return this;
  }

   /**
   * CreateWebhook if specified creates a new webhook programmatically.
   * @return createWebhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CreateWebhook if specified creates a new webhook programmatically.")

  public Boolean getCreateWebhook() {
    return createWebhook;
  }


  public void setCreateWebhook(Boolean createWebhook) {
    this.createWebhook = createWebhook;
  }


  public StripeEventSource apiKey(V1SecretKeySelector apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getApiKey() {
    return apiKey;
  }


  public void setApiKey(V1SecretKeySelector apiKey) {
    this.apiKey = apiKey;
  }


  public StripeEventSource webhook(WebhookContext webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookContext getWebhook() {
    return webhook;
  }


  public void setWebhook(WebhookContext webhook) {
    this.webhook = webhook;
  }


  public StripeEventSource eventFilter(List<String> eventFilter) {
    
    this.eventFilter = eventFilter;
    return this;
  }

  public StripeEventSource addEventFilterItem(String eventFilterItem) {
    if (this.eventFilter == null) {
      this.eventFilter = new ArrayList<String>();
    }
    this.eventFilter.add(eventFilterItem);
    return this;
  }

   /**
   * EventFilter describes the type of events to listen to. If not specified, all types of events will be processed. More info at https://stripe.com/docs/api/events/list
   * @return eventFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EventFilter describes the type of events to listen to. If not specified, all types of events will be processed. More info at https://stripe.com/docs/api/events/list")

  public List<String> getEventFilter() {
    return eventFilter;
  }


  public void setEventFilter(List<String> eventFilter) {
    this.eventFilter = eventFilter;
  }


  public StripeEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public StripeEventSource putMetadataItem(String key, String metadataItem) {
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
    StripeEventSource stripeEventSource = (StripeEventSource) o;
    return Objects.equals(this.createWebhook, stripeEventSource.createWebhook) &&
        Objects.equals(this.apiKey, stripeEventSource.apiKey) &&
        Objects.equals(this.webhook, stripeEventSource.webhook) &&
        Objects.equals(this.eventFilter, stripeEventSource.eventFilter) &&
        Objects.equals(this.metadata, stripeEventSource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createWebhook, apiKey, webhook, eventFilter, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StripeEventSource {\n");
    sb.append("    createWebhook: ").append(toIndentedString(createWebhook)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
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

