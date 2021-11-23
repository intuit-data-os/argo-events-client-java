/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.5.1
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
import io.argoproj.events.models.eventsource.AMQPConsumeConfig;
import io.argoproj.events.models.eventsource.AMQPExchangeDeclareConfig;
import io.argoproj.events.models.eventsource.AMQPQueueBindConfig;
import io.argoproj.events.models.eventsource.AMQPQueueDeclareConfig;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AMQPEventSource refers to an event-source for AMQP stream events
 */
@ApiModel(description = "AMQPEventSource refers to an event-source for AMQP stream events")

public class AMQPEventSource {
  public static final String SERIALIZED_NAME_EXCHANGE_DECLARE = "exchangeDeclare";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_DECLARE)
  private AMQPExchangeDeclareConfig exchangeDeclare;

  public static final String SERIALIZED_NAME_CONNECTION_BACKOFF = "connectionBackoff";
  @SerializedName(SERIALIZED_NAME_CONNECTION_BACKOFF)
  private io.argoproj.events.models.common.Backoff connectionBackoff = null;

  public static final String SERIALIZED_NAME_CONSUME = "consume";
  @SerializedName(SERIALIZED_NAME_CONSUME)
  private AMQPConsumeConfig consume;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_JSON_BODY = "jsonBody";
  @SerializedName(SERIALIZED_NAME_JSON_BODY)
  private Boolean jsonBody;

  public static final String SERIALIZED_NAME_ROUTING_KEY = "routingKey";
  @SerializedName(SERIALIZED_NAME_ROUTING_KEY)
  private String routingKey;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private io.argoproj.events.models.common.TLSConfig tls = null;

  public static final String SERIALIZED_NAME_AUTH = "auth";
  @SerializedName(SERIALIZED_NAME_AUTH)
  private io.argoproj.events.models.common.BasicAuth auth = null;

  public static final String SERIALIZED_NAME_QUEUE_BIND = "queueBind";
  @SerializedName(SERIALIZED_NAME_QUEUE_BIND)
  private AMQPQueueBindConfig queueBind;

  public static final String SERIALIZED_NAME_URL_SECRET = "urlSecret";
  @SerializedName(SERIALIZED_NAME_URL_SECRET)
  private V1SecretKeySelector urlSecret = null;

  public static final String SERIALIZED_NAME_EXCHANGE_NAME = "exchangeName";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_NAME)
  private String exchangeName;

  public static final String SERIALIZED_NAME_QUEUE_DECLARE = "queueDeclare";
  @SerializedName(SERIALIZED_NAME_QUEUE_DECLARE)
  private AMQPQueueDeclareConfig queueDeclare;

  public static final String SERIALIZED_NAME_EXCHANGE_TYPE = "exchangeType";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_TYPE)
  private String exchangeType;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public AMQPEventSource exchangeDeclare(AMQPExchangeDeclareConfig exchangeDeclare) {
    
    this.exchangeDeclare = exchangeDeclare;
    return this;
  }

   /**
   * Get exchangeDeclare
   * @return exchangeDeclare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AMQPExchangeDeclareConfig getExchangeDeclare() {
    return exchangeDeclare;
  }


  public void setExchangeDeclare(AMQPExchangeDeclareConfig exchangeDeclare) {
    this.exchangeDeclare = exchangeDeclare;
  }


  public AMQPEventSource connectionBackoff(io.argoproj.events.models.common.Backoff connectionBackoff) {
    
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


  public AMQPEventSource consume(AMQPConsumeConfig consume) {
    
    this.consume = consume;
    return this;
  }

   /**
   * Get consume
   * @return consume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AMQPConsumeConfig getConsume() {
    return consume;
  }


  public void setConsume(AMQPConsumeConfig consume) {
    this.consume = consume;
  }


  public AMQPEventSource url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL for rabbitmq service
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL for rabbitmq service")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public AMQPEventSource jsonBody(Boolean jsonBody) {
    
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


  public AMQPEventSource routingKey(String routingKey) {
    
    this.routingKey = routingKey;
    return this;
  }

   /**
   * Routing key for bindings
   * @return routingKey
  **/
  @ApiModelProperty(required = true, value = "Routing key for bindings")

  public String getRoutingKey() {
    return routingKey;
  }


  public void setRoutingKey(String routingKey) {
    this.routingKey = routingKey;
  }


  public AMQPEventSource tls(io.argoproj.events.models.common.TLSConfig tls) {
    
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


  public AMQPEventSource auth(io.argoproj.events.models.common.BasicAuth auth) {
    
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.argoproj.events.models.common.BasicAuth getAuth() {
    return auth;
  }


  public void setAuth(io.argoproj.events.models.common.BasicAuth auth) {
    this.auth = auth;
  }


  public AMQPEventSource queueBind(AMQPQueueBindConfig queueBind) {
    
    this.queueBind = queueBind;
    return this;
  }

   /**
   * Get queueBind
   * @return queueBind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AMQPQueueBindConfig getQueueBind() {
    return queueBind;
  }


  public void setQueueBind(AMQPQueueBindConfig queueBind) {
    this.queueBind = queueBind;
  }


  public AMQPEventSource urlSecret(V1SecretKeySelector urlSecret) {
    
    this.urlSecret = urlSecret;
    return this;
  }

   /**
   * Get urlSecret
   * @return urlSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getUrlSecret() {
    return urlSecret;
  }


  public void setUrlSecret(V1SecretKeySelector urlSecret) {
    this.urlSecret = urlSecret;
  }


  public AMQPEventSource exchangeName(String exchangeName) {
    
    this.exchangeName = exchangeName;
    return this;
  }

   /**
   * ExchangeName is the exchange name For more information, visit https://www.rabbitmq.com/tutorials/amqp-concepts.html
   * @return exchangeName
  **/
  @ApiModelProperty(required = true, value = "ExchangeName is the exchange name For more information, visit https://www.rabbitmq.com/tutorials/amqp-concepts.html")

  public String getExchangeName() {
    return exchangeName;
  }


  public void setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
  }


  public AMQPEventSource queueDeclare(AMQPQueueDeclareConfig queueDeclare) {
    
    this.queueDeclare = queueDeclare;
    return this;
  }

   /**
   * Get queueDeclare
   * @return queueDeclare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AMQPQueueDeclareConfig getQueueDeclare() {
    return queueDeclare;
  }


  public void setQueueDeclare(AMQPQueueDeclareConfig queueDeclare) {
    this.queueDeclare = queueDeclare;
  }


  public AMQPEventSource exchangeType(String exchangeType) {
    
    this.exchangeType = exchangeType;
    return this;
  }

   /**
   * ExchangeType is rabbitmq exchange type
   * @return exchangeType
  **/
  @ApiModelProperty(required = true, value = "ExchangeType is rabbitmq exchange type")

  public String getExchangeType() {
    return exchangeType;
  }


  public void setExchangeType(String exchangeType) {
    this.exchangeType = exchangeType;
  }


  public AMQPEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public AMQPEventSource putMetadataItem(String key, String metadataItem) {
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
    AMQPEventSource amQPEventSource = (AMQPEventSource) o;
    return Objects.equals(this.exchangeDeclare, amQPEventSource.exchangeDeclare) &&
        Objects.equals(this.connectionBackoff, amQPEventSource.connectionBackoff) &&
        Objects.equals(this.consume, amQPEventSource.consume) &&
        Objects.equals(this.url, amQPEventSource.url) &&
        Objects.equals(this.jsonBody, amQPEventSource.jsonBody) &&
        Objects.equals(this.routingKey, amQPEventSource.routingKey) &&
        Objects.equals(this.tls, amQPEventSource.tls) &&
        Objects.equals(this.auth, amQPEventSource.auth) &&
        Objects.equals(this.queueBind, amQPEventSource.queueBind) &&
        Objects.equals(this.urlSecret, amQPEventSource.urlSecret) &&
        Objects.equals(this.exchangeName, amQPEventSource.exchangeName) &&
        Objects.equals(this.queueDeclare, amQPEventSource.queueDeclare) &&
        Objects.equals(this.exchangeType, amQPEventSource.exchangeType) &&
        Objects.equals(this.metadata, amQPEventSource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeDeclare, connectionBackoff, consume, url, jsonBody, routingKey, tls, auth, queueBind, urlSecret, exchangeName, queueDeclare, exchangeType, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AMQPEventSource {\n");
    sb.append("    exchangeDeclare: ").append(toIndentedString(exchangeDeclare)).append("\n");
    sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
    sb.append("    consume: ").append(toIndentedString(consume)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
    sb.append("    routingKey: ").append(toIndentedString(routingKey)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    queueBind: ").append(toIndentedString(queueBind)).append("\n");
    sb.append("    urlSecret: ").append(toIndentedString(urlSecret)).append("\n");
    sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
    sb.append("    queueDeclare: ").append(toIndentedString(queueDeclare)).append("\n");
    sb.append("    exchangeType: ").append(toIndentedString(exchangeType)).append("\n");
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

