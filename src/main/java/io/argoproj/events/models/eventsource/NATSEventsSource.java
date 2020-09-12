/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.0.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * NATSEventsSource refers to event-source for NATS related events
 */
@ApiModel(description = "NATSEventsSource refers to event-source for NATS related events")

public class NATSEventsSource {
  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private io.argoproj.events.models.common.TLSConfig tls = null;

  public static final String SERIALIZED_NAME_CONNECTION_BACKOFF = "connectionBackoff";
  @SerializedName(SERIALIZED_NAME_CONNECTION_BACKOFF)
  private io.argoproj.events.models.common.Backoff connectionBackoff = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_JSON_BODY = "jsonBody";
  @SerializedName(SERIALIZED_NAME_JSON_BODY)
  private Boolean jsonBody;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;


  public NATSEventsSource tls(io.argoproj.events.models.common.TLSConfig tls) {
    
    this.tls = tls;
    return this;
  }

   /**
   * Get tls
   * @return tls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.argoproj.events.models.common.TLSConfig getTls() {
    return tls;
  }


  public void setTls(io.argoproj.events.models.common.TLSConfig tls) {
    this.tls = tls;
  }


  public NATSEventsSource connectionBackoff(io.argoproj.events.models.common.Backoff connectionBackoff) {
    
    this.connectionBackoff = connectionBackoff;
    return this;
  }

   /**
   * Get connectionBackoff
   * @return connectionBackoff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.argoproj.events.models.common.Backoff getConnectionBackoff() {
    return connectionBackoff;
  }


  public void setConnectionBackoff(io.argoproj.events.models.common.Backoff connectionBackoff) {
    this.connectionBackoff = connectionBackoff;
  }


  public NATSEventsSource url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL to connect to NATS cluster
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL to connect to NATS cluster")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public NATSEventsSource jsonBody(Boolean jsonBody) {
    
    this.jsonBody = jsonBody;
    return this;
  }

   /**
   * JSONBody specifies that all event body payload coming from this source will be JSON
   * @return jsonBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JSONBody specifies that all event body payload coming from this source will be JSON")

  public Boolean getJsonBody() {
    return jsonBody;
  }


  public void setJsonBody(Boolean jsonBody) {
    this.jsonBody = jsonBody;
  }


  public NATSEventsSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public NATSEventsSource putMetadataItem(String key, String metadataItem) {
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


  public NATSEventsSource subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject holds the name of the subject onto which messages are published
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "Subject holds the name of the subject onto which messages are published")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NATSEventsSource naTSEventsSource = (NATSEventsSource) o;
    return Objects.equals(this.tls, naTSEventsSource.tls) &&
        Objects.equals(this.connectionBackoff, naTSEventsSource.connectionBackoff) &&
        Objects.equals(this.url, naTSEventsSource.url) &&
        Objects.equals(this.jsonBody, naTSEventsSource.jsonBody) &&
        Objects.equals(this.metadata, naTSEventsSource.metadata) &&
        Objects.equals(this.subject, naTSEventsSource.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tls, connectionBackoff, url, jsonBody, metadata, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NATSEventsSource {\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

