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


package io.argoproj.events.models.sensor;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.events.models.sensor.AWSLambdaTrigger;
import io.argoproj.events.models.sensor.ArgoWorkflowTrigger;
import io.argoproj.events.models.sensor.CustomTrigger;
import io.argoproj.events.models.sensor.HTTPTrigger;
import io.argoproj.events.models.sensor.KafkaTrigger;
import io.argoproj.events.models.sensor.LogTrigger;
import io.argoproj.events.models.sensor.NATSTrigger;
import io.argoproj.events.models.sensor.OpenWhiskTrigger;
import io.argoproj.events.models.sensor.SlackTrigger;
import io.argoproj.events.models.sensor.StandardK8STrigger;
import io.argoproj.events.models.sensor.TriggerSwitch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TriggerTemplate is the template that describes trigger specification.
 */
@ApiModel(description = "TriggerTemplate is the template that describes trigger specification.")

public class TriggerTemplate {
  public static final String SERIALIZED_NAME_KAFKA = "kafka";
  @SerializedName(SERIALIZED_NAME_KAFKA)
  private KafkaTrigger kafka;

  public static final String SERIALIZED_NAME_HTTP = "http";
  @SerializedName(SERIALIZED_NAME_HTTP)
  private HTTPTrigger http;

  public static final String SERIALIZED_NAME_LOG = "log";
  @SerializedName(SERIALIZED_NAME_LOG)
  private LogTrigger log;

  public static final String SERIALIZED_NAME_NATS = "nats";
  @SerializedName(SERIALIZED_NAME_NATS)
  private NATSTrigger nats;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private CustomTrigger custom;

  public static final String SERIALIZED_NAME_AWS_LAMBDA = "awsLambda";
  @SerializedName(SERIALIZED_NAME_AWS_LAMBDA)
  private AWSLambdaTrigger awsLambda;

  public static final String SERIALIZED_NAME_OPEN_WHISK = "openWhisk";
  @SerializedName(SERIALIZED_NAME_OPEN_WHISK)
  private OpenWhiskTrigger openWhisk;

  public static final String SERIALIZED_NAME_SWITCH = "switch";
  @SerializedName(SERIALIZED_NAME_SWITCH)
  private TriggerSwitch _switch;

  public static final String SERIALIZED_NAME_SLACK = "slack";
  @SerializedName(SERIALIZED_NAME_SLACK)
  private SlackTrigger slack;

  public static final String SERIALIZED_NAME_ARGO_WORKFLOW = "argoWorkflow";
  @SerializedName(SERIALIZED_NAME_ARGO_WORKFLOW)
  private ArgoWorkflowTrigger argoWorkflow;

  public static final String SERIALIZED_NAME_K8S = "k8s";
  @SerializedName(SERIALIZED_NAME_K8S)
  private StandardK8STrigger k8s;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private String conditions;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public TriggerTemplate kafka(KafkaTrigger kafka) {
    
    this.kafka = kafka;
    return this;
  }

   /**
   * Get kafka
   * @return kafka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KafkaTrigger getKafka() {
    return kafka;
  }


  public void setKafka(KafkaTrigger kafka) {
    this.kafka = kafka;
  }


  public TriggerTemplate http(HTTPTrigger http) {
    
    this.http = http;
    return this;
  }

   /**
   * Get http
   * @return http
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HTTPTrigger getHttp() {
    return http;
  }


  public void setHttp(HTTPTrigger http) {
    this.http = http;
  }


  public TriggerTemplate log(LogTrigger log) {
    
    this.log = log;
    return this;
  }

   /**
   * Get log
   * @return log
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LogTrigger getLog() {
    return log;
  }


  public void setLog(LogTrigger log) {
    this.log = log;
  }


  public TriggerTemplate nats(NATSTrigger nats) {
    
    this.nats = nats;
    return this;
  }

   /**
   * Get nats
   * @return nats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NATSTrigger getNats() {
    return nats;
  }


  public void setNats(NATSTrigger nats) {
    this.nats = nats;
  }


  public TriggerTemplate custom(CustomTrigger custom) {
    
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomTrigger getCustom() {
    return custom;
  }


  public void setCustom(CustomTrigger custom) {
    this.custom = custom;
  }


  public TriggerTemplate awsLambda(AWSLambdaTrigger awsLambda) {
    
    this.awsLambda = awsLambda;
    return this;
  }

   /**
   * Get awsLambda
   * @return awsLambda
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AWSLambdaTrigger getAwsLambda() {
    return awsLambda;
  }


  public void setAwsLambda(AWSLambdaTrigger awsLambda) {
    this.awsLambda = awsLambda;
  }


  public TriggerTemplate openWhisk(OpenWhiskTrigger openWhisk) {
    
    this.openWhisk = openWhisk;
    return this;
  }

   /**
   * Get openWhisk
   * @return openWhisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpenWhiskTrigger getOpenWhisk() {
    return openWhisk;
  }


  public void setOpenWhisk(OpenWhiskTrigger openWhisk) {
    this.openWhisk = openWhisk;
  }


  public TriggerTemplate _switch(TriggerSwitch _switch) {
    
    this._switch = _switch;
    return this;
  }

   /**
   * Get _switch
   * @return _switch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TriggerSwitch getSwitch() {
    return _switch;
  }


  public void setSwitch(TriggerSwitch _switch) {
    this._switch = _switch;
  }


  public TriggerTemplate slack(SlackTrigger slack) {
    
    this.slack = slack;
    return this;
  }

   /**
   * Get slack
   * @return slack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SlackTrigger getSlack() {
    return slack;
  }


  public void setSlack(SlackTrigger slack) {
    this.slack = slack;
  }


  public TriggerTemplate argoWorkflow(ArgoWorkflowTrigger argoWorkflow) {
    
    this.argoWorkflow = argoWorkflow;
    return this;
  }

   /**
   * Get argoWorkflow
   * @return argoWorkflow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArgoWorkflowTrigger getArgoWorkflow() {
    return argoWorkflow;
  }


  public void setArgoWorkflow(ArgoWorkflowTrigger argoWorkflow) {
    this.argoWorkflow = argoWorkflow;
  }


  public TriggerTemplate k8s(StandardK8STrigger k8s) {
    
    this.k8s = k8s;
    return this;
  }

   /**
   * Get k8s
   * @return k8s
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StandardK8STrigger getK8s() {
    return k8s;
  }


  public void setK8s(StandardK8STrigger k8s) {
    this.k8s = k8s;
  }


  public TriggerTemplate conditions(String conditions) {
    
    this.conditions = conditions;
    return this;
  }

   /**
   * Conditions is the conditions to execute the trigger. For example: \&quot;(dep01 || dep02) &amp;&amp; dep04\&quot;
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Conditions is the conditions to execute the trigger. For example: \"(dep01 || dep02) && dep04\"")

  public String getConditions() {
    return conditions;
  }


  public void setConditions(String conditions) {
    this.conditions = conditions;
  }


  public TriggerTemplate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is a unique name of the action to take.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is a unique name of the action to take.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerTemplate triggerTemplate = (TriggerTemplate) o;
    return Objects.equals(this.kafka, triggerTemplate.kafka) &&
        Objects.equals(this.http, triggerTemplate.http) &&
        Objects.equals(this.log, triggerTemplate.log) &&
        Objects.equals(this.nats, triggerTemplate.nats) &&
        Objects.equals(this.custom, triggerTemplate.custom) &&
        Objects.equals(this.awsLambda, triggerTemplate.awsLambda) &&
        Objects.equals(this.openWhisk, triggerTemplate.openWhisk) &&
        Objects.equals(this._switch, triggerTemplate._switch) &&
        Objects.equals(this.slack, triggerTemplate.slack) &&
        Objects.equals(this.argoWorkflow, triggerTemplate.argoWorkflow) &&
        Objects.equals(this.k8s, triggerTemplate.k8s) &&
        Objects.equals(this.conditions, triggerTemplate.conditions) &&
        Objects.equals(this.name, triggerTemplate.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kafka, http, log, nats, custom, awsLambda, openWhisk, _switch, slack, argoWorkflow, k8s, conditions, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerTemplate {\n");
    sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    nats: ").append(toIndentedString(nats)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    awsLambda: ").append(toIndentedString(awsLambda)).append("\n");
    sb.append("    openWhisk: ").append(toIndentedString(openWhisk)).append("\n");
    sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
    sb.append("    slack: ").append(toIndentedString(slack)).append("\n");
    sb.append("    argoWorkflow: ").append(toIndentedString(argoWorkflow)).append("\n");
    sb.append("    k8s: ").append(toIndentedString(k8s)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

