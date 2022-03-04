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


package io.argoproj.events.models.sensor;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.events.models.sensor.TriggerParameter;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PulsarTrigger refers to the specification of the Pulsar trigger.
 */
@ApiModel(description = "PulsarTrigger refers to the specification of the Pulsar trigger.")

public class PulsarTrigger {
  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private io.argoproj.events.models.common.TLSConfig tls = null;

  public static final String SERIALIZED_NAME_CONNECTION_BACKOFF = "connectionBackoff";
  @SerializedName(SERIALIZED_NAME_CONNECTION_BACKOFF)
  private io.argoproj.events.models.common.Backoff connectionBackoff = null;

  public static final String SERIALIZED_NAME_AUTH_TOKEN_SECRET = "authTokenSecret";
  @SerializedName(SERIALIZED_NAME_AUTH_TOKEN_SECRET)
  private V1SecretKeySelector authTokenSecret = null;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TLS_VALIDATE_HOSTNAME = "tlsValidateHostname";
  @SerializedName(SERIALIZED_NAME_TLS_VALIDATE_HOSTNAME)
  private Boolean tlsValidateHostname;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_TLS_TRUST_CERTS_SECRET = "tlsTrustCertsSecret";
  @SerializedName(SERIALIZED_NAME_TLS_TRUST_CERTS_SECRET)
  private V1SecretKeySelector tlsTrustCertsSecret = null;

  public static final String SERIALIZED_NAME_TLS_ALLOW_INSECURE_CONNECTION = "tlsAllowInsecureConnection";
  @SerializedName(SERIALIZED_NAME_TLS_ALLOW_INSECURE_CONNECTION)
  private Boolean tlsAllowInsecureConnection;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private List<TriggerParameter> payload = new ArrayList<TriggerParameter>();


  public PulsarTrigger tls(io.argoproj.events.models.common.TLSConfig tls) {
    
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


  public PulsarTrigger connectionBackoff(io.argoproj.events.models.common.Backoff connectionBackoff) {
    
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


  public PulsarTrigger authTokenSecret(V1SecretKeySelector authTokenSecret) {
    
    this.authTokenSecret = authTokenSecret;
    return this;
  }

   /**
   * Get authTokenSecret
   * @return authTokenSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getAuthTokenSecret() {
    return authTokenSecret;
  }


  public void setAuthTokenSecret(V1SecretKeySelector authTokenSecret) {
    this.authTokenSecret = authTokenSecret;
  }


  public PulsarTrigger parameters(List<TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public PulsarTrigger addParametersItem(TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Parameters is the list of parameters that is applied to resolved Kafka trigger object.
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameters is the list of parameters that is applied to resolved Kafka trigger object.")

  public List<TriggerParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<TriggerParameter> parameters) {
    this.parameters = parameters;
  }


  public PulsarTrigger url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Configure the service URL for the Pulsar service.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "Configure the service URL for the Pulsar service.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public PulsarTrigger tlsValidateHostname(Boolean tlsValidateHostname) {
    
    this.tlsValidateHostname = tlsValidateHostname;
    return this;
  }

   /**
   * Whether the Pulsar client verify the validity of the host name from broker.
   * @return tlsValidateHostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the Pulsar client verify the validity of the host name from broker.")

  public Boolean getTlsValidateHostname() {
    return tlsValidateHostname;
  }


  public void setTlsValidateHostname(Boolean tlsValidateHostname) {
    this.tlsValidateHostname = tlsValidateHostname;
  }


  public PulsarTrigger topic(String topic) {
    
    this.topic = topic;
    return this;
  }

   /**
   * Name of the topic. See https://pulsar.apache.org/docs/en/concepts-messaging/
   * @return topic
  **/
  @ApiModelProperty(required = true, value = "Name of the topic. See https://pulsar.apache.org/docs/en/concepts-messaging/")

  public String getTopic() {
    return topic;
  }


  public void setTopic(String topic) {
    this.topic = topic;
  }


  public PulsarTrigger tlsTrustCertsSecret(V1SecretKeySelector tlsTrustCertsSecret) {
    
    this.tlsTrustCertsSecret = tlsTrustCertsSecret;
    return this;
  }

   /**
   * Get tlsTrustCertsSecret
   * @return tlsTrustCertsSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getTlsTrustCertsSecret() {
    return tlsTrustCertsSecret;
  }


  public void setTlsTrustCertsSecret(V1SecretKeySelector tlsTrustCertsSecret) {
    this.tlsTrustCertsSecret = tlsTrustCertsSecret;
  }


  public PulsarTrigger tlsAllowInsecureConnection(Boolean tlsAllowInsecureConnection) {
    
    this.tlsAllowInsecureConnection = tlsAllowInsecureConnection;
    return this;
  }

   /**
   * Whether the Pulsar client accept untrusted TLS certificate from broker.
   * @return tlsAllowInsecureConnection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the Pulsar client accept untrusted TLS certificate from broker.")

  public Boolean getTlsAllowInsecureConnection() {
    return tlsAllowInsecureConnection;
  }


  public void setTlsAllowInsecureConnection(Boolean tlsAllowInsecureConnection) {
    this.tlsAllowInsecureConnection = tlsAllowInsecureConnection;
  }


  public PulsarTrigger payload(List<TriggerParameter> payload) {
    
    this.payload = payload;
    return this;
  }

  public PulsarTrigger addPayloadItem(TriggerParameter payloadItem) {
    this.payload.add(payloadItem);
    return this;
  }

   /**
   * Payload is the list of key-value extracted from an event payload to construct the request payload.
   * @return payload
  **/
  @ApiModelProperty(required = true, value = "Payload is the list of key-value extracted from an event payload to construct the request payload.")

  public List<TriggerParameter> getPayload() {
    return payload;
  }


  public void setPayload(List<TriggerParameter> payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PulsarTrigger pulsarTrigger = (PulsarTrigger) o;
    return Objects.equals(this.tls, pulsarTrigger.tls) &&
        Objects.equals(this.connectionBackoff, pulsarTrigger.connectionBackoff) &&
        Objects.equals(this.authTokenSecret, pulsarTrigger.authTokenSecret) &&
        Objects.equals(this.parameters, pulsarTrigger.parameters) &&
        Objects.equals(this.url, pulsarTrigger.url) &&
        Objects.equals(this.tlsValidateHostname, pulsarTrigger.tlsValidateHostname) &&
        Objects.equals(this.topic, pulsarTrigger.topic) &&
        Objects.equals(this.tlsTrustCertsSecret, pulsarTrigger.tlsTrustCertsSecret) &&
        Objects.equals(this.tlsAllowInsecureConnection, pulsarTrigger.tlsAllowInsecureConnection) &&
        Objects.equals(this.payload, pulsarTrigger.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tls, connectionBackoff, authTokenSecret, parameters, url, tlsValidateHostname, topic, tlsTrustCertsSecret, tlsAllowInsecureConnection, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PulsarTrigger {\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
    sb.append("    authTokenSecret: ").append(toIndentedString(authTokenSecret)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    tlsValidateHostname: ").append(toIndentedString(tlsValidateHostname)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    tlsTrustCertsSecret: ").append(toIndentedString(tlsTrustCertsSecret)).append("\n");
    sb.append("    tlsAllowInsecureConnection: ").append(toIndentedString(tlsAllowInsecureConnection)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

