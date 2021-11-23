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
 * SlackTrigger refers to the specification of the slack notification trigger.
 */
@ApiModel(description = "SlackTrigger refers to the specification of the slack notification trigger.")

public class SlackTrigger {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_SLACK_TOKEN = "slackToken";
  @SerializedName(SERIALIZED_NAME_SLACK_TOKEN)
  private V1SecretKeySelector slackToken = null;


  public SlackTrigger message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message refers to the message to send to the Slack channel.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message refers to the message to send to the Slack channel.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SlackTrigger parameters(List<TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public SlackTrigger addParametersItem(TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Parameters is the list of key-value extracted from event&#39;s payload that are applied to the trigger resource.
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameters is the list of key-value extracted from event's payload that are applied to the trigger resource.")

  public List<TriggerParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<TriggerParameter> parameters) {
    this.parameters = parameters;
  }


  public SlackTrigger channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Channel refers to which Slack channel to send slack message.
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Channel refers to which Slack channel to send slack message.")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public SlackTrigger slackToken(V1SecretKeySelector slackToken) {
    
    this.slackToken = slackToken;
    return this;
  }

   /**
   * Get slackToken
   * @return slackToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getSlackToken() {
    return slackToken;
  }


  public void setSlackToken(V1SecretKeySelector slackToken) {
    this.slackToken = slackToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackTrigger slackTrigger = (SlackTrigger) o;
    return Objects.equals(this.message, slackTrigger.message) &&
        Objects.equals(this.parameters, slackTrigger.parameters) &&
        Objects.equals(this.channel, slackTrigger.channel) &&
        Objects.equals(this.slackToken, slackTrigger.slackToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, parameters, channel, slackToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackTrigger {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    slackToken: ").append(toIndentedString(slackToken)).append("\n");
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

