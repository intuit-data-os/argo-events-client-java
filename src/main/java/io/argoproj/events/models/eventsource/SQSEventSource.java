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
import io.argoproj.events.models.eventsource.EventSourceFilter;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SQSEventSource refers to event-source for AWS SQS related events
 */
@ApiModel(description = "SQSEventSource refers to event-source for AWS SQS related events")

public class SQSEventSource {
  public static final String SERIALIZED_NAME_QUEUE = "queue";
  @SerializedName(SERIALIZED_NAME_QUEUE)
  private String queue;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_JSON_BODY = "jsonBody";
  @SerializedName(SERIALIZED_NAME_JSON_BODY)
  private Boolean jsonBody;

  public static final String SERIALIZED_NAME_ROLE_A_R_N = "roleARN";
  @SerializedName(SERIALIZED_NAME_ROLE_A_R_N)
  private String roleARN;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private EventSourceFilter filter;

  public static final String SERIALIZED_NAME_DLQ = "dlq";
  @SerializedName(SERIALIZED_NAME_DLQ)
  private Boolean dlq;

  public static final String SERIALIZED_NAME_QUEUE_ACCOUNT_ID = "queueAccountId";
  @SerializedName(SERIALIZED_NAME_QUEUE_ACCOUNT_ID)
  private String queueAccountId;

  public static final String SERIALIZED_NAME_SECRET_KEY = "secretKey";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY)
  private V1SecretKeySelector secretKey = null;

  public static final String SERIALIZED_NAME_WAIT_TIME_SECONDS = "waitTimeSeconds";
  @SerializedName(SERIALIZED_NAME_WAIT_TIME_SECONDS)
  private Long waitTimeSeconds;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_ACCESS_KEY = "accessKey";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
  private V1SecretKeySelector accessKey = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public SQSEventSource queue(String queue) {
    
    this.queue = queue;
    return this;
  }

   /**
   * Queue is AWS SQS queue to listen to for messages
   * @return queue
  **/
  @ApiModelProperty(required = true, value = "Queue is AWS SQS queue to listen to for messages")

  public String getQueue() {
    return queue;
  }


  public void setQueue(String queue) {
    this.queue = queue;
  }


  public SQSEventSource endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Endpoint configures connection to a specific SQS endpoint instead of Amazons servers
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Endpoint configures connection to a specific SQS endpoint instead of Amazons servers")

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public SQSEventSource jsonBody(Boolean jsonBody) {
    
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


  public SQSEventSource roleARN(String roleARN) {
    
    this.roleARN = roleARN;
    return this;
  }

   /**
   * RoleARN is the Amazon Resource Name (ARN) of the role to assume.
   * @return roleARN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RoleARN is the Amazon Resource Name (ARN) of the role to assume.")

  public String getRoleARN() {
    return roleARN;
  }


  public void setRoleARN(String roleARN) {
    this.roleARN = roleARN;
  }


  public SQSEventSource filter(EventSourceFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventSourceFilter getFilter() {
    return filter;
  }


  public void setFilter(EventSourceFilter filter) {
    this.filter = filter;
  }


  public SQSEventSource dlq(Boolean dlq) {
    
    this.dlq = dlq;
    return this;
  }

   /**
   * DLQ specifies if a dead-letter queue is configured for messages that can&#39;t be processed successfully. If set to true, messages with invalid payload won&#39;t be acknowledged to allow to forward them farther to the dead-letter queue. The default value is false.
   * @return dlq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DLQ specifies if a dead-letter queue is configured for messages that can't be processed successfully. If set to true, messages with invalid payload won't be acknowledged to allow to forward them farther to the dead-letter queue. The default value is false.")

  public Boolean getDlq() {
    return dlq;
  }


  public void setDlq(Boolean dlq) {
    this.dlq = dlq;
  }


  public SQSEventSource queueAccountId(String queueAccountId) {
    
    this.queueAccountId = queueAccountId;
    return this;
  }

   /**
   * QueueAccountID is the ID of the account that created the queue to monitor
   * @return queueAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "QueueAccountID is the ID of the account that created the queue to monitor")

  public String getQueueAccountId() {
    return queueAccountId;
  }


  public void setQueueAccountId(String queueAccountId) {
    this.queueAccountId = queueAccountId;
  }


  public SQSEventSource secretKey(V1SecretKeySelector secretKey) {
    
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getSecretKey() {
    return secretKey;
  }


  public void setSecretKey(V1SecretKeySelector secretKey) {
    this.secretKey = secretKey;
  }


  public SQSEventSource waitTimeSeconds(Long waitTimeSeconds) {
    
    this.waitTimeSeconds = waitTimeSeconds;
    return this;
  }

   /**
   * WaitTimeSeconds is The duration (in seconds) for which the call waits for a message to arrive in the queue before returning.
   * @return waitTimeSeconds
  **/
  @ApiModelProperty(required = true, value = "WaitTimeSeconds is The duration (in seconds) for which the call waits for a message to arrive in the queue before returning.")

  public Long getWaitTimeSeconds() {
    return waitTimeSeconds;
  }


  public void setWaitTimeSeconds(Long waitTimeSeconds) {
    this.waitTimeSeconds = waitTimeSeconds;
  }


  public SQSEventSource region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region is AWS region
   * @return region
  **/
  @ApiModelProperty(required = true, value = "Region is AWS region")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public SQSEventSource accessKey(V1SecretKeySelector accessKey) {
    
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getAccessKey() {
    return accessKey;
  }


  public void setAccessKey(V1SecretKeySelector accessKey) {
    this.accessKey = accessKey;
  }


  public SQSEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public SQSEventSource putMetadataItem(String key, String metadataItem) {
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
    SQSEventSource sqSEventSource = (SQSEventSource) o;
    return Objects.equals(this.queue, sqSEventSource.queue) &&
        Objects.equals(this.endpoint, sqSEventSource.endpoint) &&
        Objects.equals(this.jsonBody, sqSEventSource.jsonBody) &&
        Objects.equals(this.roleARN, sqSEventSource.roleARN) &&
        Objects.equals(this.filter, sqSEventSource.filter) &&
        Objects.equals(this.dlq, sqSEventSource.dlq) &&
        Objects.equals(this.queueAccountId, sqSEventSource.queueAccountId) &&
        Objects.equals(this.secretKey, sqSEventSource.secretKey) &&
        Objects.equals(this.waitTimeSeconds, sqSEventSource.waitTimeSeconds) &&
        Objects.equals(this.region, sqSEventSource.region) &&
        Objects.equals(this.accessKey, sqSEventSource.accessKey) &&
        Objects.equals(this.metadata, sqSEventSource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, endpoint, jsonBody, roleARN, filter, dlq, queueAccountId, secretKey, waitTimeSeconds, region, accessKey, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SQSEventSource {\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
    sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    dlq: ").append(toIndentedString(dlq)).append("\n");
    sb.append("    queueAccountId: ").append(toIndentedString(queueAccountId)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    waitTimeSeconds: ").append(toIndentedString(waitTimeSeconds)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
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

