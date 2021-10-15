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
import io.argoproj.events.models.eventsource.WebhookContext;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SlackEventSource refers to event-source for Slack related events
 */
@ApiModel(description = "SlackEventSource refers to event-source for Slack related events")

public class SlackEventSource {
  public static final String SERIALIZED_NAME_SIGNING_SECRET = "signingSecret";
  @SerializedName(SERIALIZED_NAME_SIGNING_SECRET)
  private V1SecretKeySelector signingSecret = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private V1SecretKeySelector token = null;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private WebhookContext webhook;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public SlackEventSource signingSecret(V1SecretKeySelector signingSecret) {
    
    this.signingSecret = signingSecret;
    return this;
  }

   /**
   * Get signingSecret
   * @return signingSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getSigningSecret() {
    return signingSecret;
  }


  public void setSigningSecret(V1SecretKeySelector signingSecret) {
    this.signingSecret = signingSecret;
  }


  public SlackEventSource token(V1SecretKeySelector token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getToken() {
    return token;
  }


  public void setToken(V1SecretKeySelector token) {
    this.token = token;
  }


  public SlackEventSource webhook(WebhookContext webhook) {
    
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


  public SlackEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public SlackEventSource putMetadataItem(String key, String metadataItem) {
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
    SlackEventSource slackEventSource = (SlackEventSource) o;
    return Objects.equals(this.signingSecret, slackEventSource.signingSecret) &&
        Objects.equals(this.token, slackEventSource.token) &&
        Objects.equals(this.webhook, slackEventSource.webhook) &&
        Objects.equals(this.metadata, slackEventSource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signingSecret, token, webhook, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackEventSource {\n");
    sb.append("    signingSecret: ").append(toIndentedString(signingSecret)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

