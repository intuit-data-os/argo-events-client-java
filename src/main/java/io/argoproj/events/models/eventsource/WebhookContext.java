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
 * WebhookContext holds a general purpose REST API context
 */
@ApiModel(description = "WebhookContext holds a general purpose REST API context")

public class WebhookContext {
  public static final String SERIALIZED_NAME_SERVER_CERT_PATH = "serverCertPath";
  @SerializedName(SERIALIZED_NAME_SERVER_CERT_PATH)
  private String serverCertPath;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_SERVER_KEY_PATH = "serverKeyPath";
  @SerializedName(SERIALIZED_NAME_SERVER_KEY_PATH)
  private String serverKeyPath;

  public static final String SERIALIZED_NAME_AUTH_SECRET = "authSecret";
  @SerializedName(SERIALIZED_NAME_AUTH_SECRET)
  private V1SecretKeySelector authSecret = null;

  public static final String SERIALIZED_NAME_SERVER_KEY_SECRET = "serverKeySecret";
  @SerializedName(SERIALIZED_NAME_SERVER_KEY_SECRET)
  private V1SecretKeySelector serverKeySecret = null;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_SERVER_CERT_SECRET = "serverCertSecret";
  @SerializedName(SERIALIZED_NAME_SERVER_CERT_SECRET)
  private V1SecretKeySelector serverCertSecret = null;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public WebhookContext serverCertPath(String serverCertPath) {
    
    this.serverCertPath = serverCertPath;
    return this;
  }

   /**
   * DeprecatedServerCertPath refers the file that contains the cert.
   * @return serverCertPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DeprecatedServerCertPath refers the file that contains the cert.")

  public String getServerCertPath() {
    return serverCertPath;
  }


  public void setServerCertPath(String serverCertPath) {
    this.serverCertPath = serverCertPath;
  }


  public WebhookContext endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * REST API endpoint
   * @return endpoint
  **/
  @ApiModelProperty(required = true, value = "REST API endpoint")

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public WebhookContext serverKeyPath(String serverKeyPath) {
    
    this.serverKeyPath = serverKeyPath;
    return this;
  }

   /**
   * DeprecatedServerKeyPath refers the file that contains private key
   * @return serverKeyPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DeprecatedServerKeyPath refers the file that contains private key")

  public String getServerKeyPath() {
    return serverKeyPath;
  }


  public void setServerKeyPath(String serverKeyPath) {
    this.serverKeyPath = serverKeyPath;
  }


  public WebhookContext authSecret(V1SecretKeySelector authSecret) {
    
    this.authSecret = authSecret;
    return this;
  }

   /**
   * Get authSecret
   * @return authSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getAuthSecret() {
    return authSecret;
  }


  public void setAuthSecret(V1SecretKeySelector authSecret) {
    this.authSecret = authSecret;
  }


  public WebhookContext serverKeySecret(V1SecretKeySelector serverKeySecret) {
    
    this.serverKeySecret = serverKeySecret;
    return this;
  }

   /**
   * Get serverKeySecret
   * @return serverKeySecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getServerKeySecret() {
    return serverKeySecret;
  }


  public void setServerKeySecret(V1SecretKeySelector serverKeySecret) {
    this.serverKeySecret = serverKeySecret;
  }


  public WebhookContext method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method is HTTP request method that indicates the desired action to be performed for a given resource. See RFC7231 Hypertext Transfer Protocol (HTTP/1.1): Semantics and Content
   * @return method
  **/
  @ApiModelProperty(required = true, value = "Method is HTTP request method that indicates the desired action to be performed for a given resource. See RFC7231 Hypertext Transfer Protocol (HTTP/1.1): Semantics and Content")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public WebhookContext url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL is the url of the server.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL is the url of the server.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public WebhookContext serverCertSecret(V1SecretKeySelector serverCertSecret) {
    
    this.serverCertSecret = serverCertSecret;
    return this;
  }

   /**
   * Get serverCertSecret
   * @return serverCertSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getServerCertSecret() {
    return serverCertSecret;
  }


  public void setServerCertSecret(V1SecretKeySelector serverCertSecret) {
    this.serverCertSecret = serverCertSecret;
  }


  public WebhookContext port(String port) {
    
    this.port = port;
    return this;
  }

   /**
   * Port on which HTTP server is listening for incoming events.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "Port on which HTTP server is listening for incoming events.")

  public String getPort() {
    return port;
  }


  public void setPort(String port) {
    this.port = port;
  }


  public WebhookContext metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public WebhookContext putMetadataItem(String key, String metadataItem) {
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
    WebhookContext webhookContext = (WebhookContext) o;
    return Objects.equals(this.serverCertPath, webhookContext.serverCertPath) &&
        Objects.equals(this.endpoint, webhookContext.endpoint) &&
        Objects.equals(this.serverKeyPath, webhookContext.serverKeyPath) &&
        Objects.equals(this.authSecret, webhookContext.authSecret) &&
        Objects.equals(this.serverKeySecret, webhookContext.serverKeySecret) &&
        Objects.equals(this.method, webhookContext.method) &&
        Objects.equals(this.url, webhookContext.url) &&
        Objects.equals(this.serverCertSecret, webhookContext.serverCertSecret) &&
        Objects.equals(this.port, webhookContext.port) &&
        Objects.equals(this.metadata, webhookContext.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverCertPath, endpoint, serverKeyPath, authSecret, serverKeySecret, method, url, serverCertSecret, port, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookContext {\n");
    sb.append("    serverCertPath: ").append(toIndentedString(serverCertPath)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    serverKeyPath: ").append(toIndentedString(serverKeyPath)).append("\n");
    sb.append("    authSecret: ").append(toIndentedString(authSecret)).append("\n");
    sb.append("    serverKeySecret: ").append(toIndentedString(serverKeySecret)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    serverCertSecret: ").append(toIndentedString(serverCertSecret)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

