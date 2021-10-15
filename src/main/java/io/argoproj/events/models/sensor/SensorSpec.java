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


package io.argoproj.events.models.sensor;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.events.models.sensor.DependencyGroup;
import io.argoproj.events.models.sensor.EventDependency;
import io.argoproj.events.models.sensor.Template;
import io.argoproj.events.models.sensor.Trigger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SensorSpec represents desired sensor state
 */
@ApiModel(description = "SensorSpec represents desired sensor state")

public class SensorSpec {
  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Template template;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_EVENT_BUS_NAME = "eventBusName";
  @SerializedName(SERIALIZED_NAME_EVENT_BUS_NAME)
  private String eventBusName;

  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  private List<EventDependency> dependencies = new ArrayList<EventDependency>();

  public static final String SERIALIZED_NAME_CIRCUIT = "circuit";
  @SerializedName(SERIALIZED_NAME_CIRCUIT)
  private String circuit;

  public static final String SERIALIZED_NAME_DEPENDENCY_GROUPS = "dependencyGroups";
  @SerializedName(SERIALIZED_NAME_DEPENDENCY_GROUPS)
  private List<DependencyGroup> dependencyGroups = null;

  public static final String SERIALIZED_NAME_ERROR_ON_FAILED_ROUND = "errorOnFailedRound";
  @SerializedName(SERIALIZED_NAME_ERROR_ON_FAILED_ROUND)
  private Boolean errorOnFailedRound;

  public static final String SERIALIZED_NAME_TRIGGERS = "triggers";
  @SerializedName(SERIALIZED_NAME_TRIGGERS)
  private List<Trigger> triggers = new ArrayList<Trigger>();


  public SensorSpec template(Template template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Template getTemplate() {
    return template;
  }


  public void setTemplate(Template template) {
    this.template = template;
  }


  public SensorSpec replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the sensor deployment replicas
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Replicas is the sensor deployment replicas")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public SensorSpec eventBusName(String eventBusName) {
    
    this.eventBusName = eventBusName;
    return this;
  }

   /**
   * EventBusName references to a EventBus name. By default the value is \&quot;default\&quot;
   * @return eventBusName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EventBusName references to a EventBus name. By default the value is \"default\"")

  public String getEventBusName() {
    return eventBusName;
  }


  public void setEventBusName(String eventBusName) {
    this.eventBusName = eventBusName;
  }


  public SensorSpec dependencies(List<EventDependency> dependencies) {
    
    this.dependencies = dependencies;
    return this;
  }

  public SensorSpec addDependenciesItem(EventDependency dependenciesItem) {
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Dependencies is a list of the events that this sensor is dependent on.
   * @return dependencies
  **/
  @ApiModelProperty(required = true, value = "Dependencies is a list of the events that this sensor is dependent on.")

  public List<EventDependency> getDependencies() {
    return dependencies;
  }


  public void setDependencies(List<EventDependency> dependencies) {
    this.dependencies = dependencies;
  }


  public SensorSpec circuit(String circuit) {
    
    this.circuit = circuit;
    return this;
  }

   /**
   * Circuit is a boolean expression of dependency groups Deprecated: will be removed in v1.5, use Switch in triggers instead.
   * @return circuit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Circuit is a boolean expression of dependency groups Deprecated: will be removed in v1.5, use Switch in triggers instead.")

  public String getCircuit() {
    return circuit;
  }


  public void setCircuit(String circuit) {
    this.circuit = circuit;
  }


  public SensorSpec dependencyGroups(List<DependencyGroup> dependencyGroups) {
    
    this.dependencyGroups = dependencyGroups;
    return this;
  }

  public SensorSpec addDependencyGroupsItem(DependencyGroup dependencyGroupsItem) {
    if (this.dependencyGroups == null) {
      this.dependencyGroups = new ArrayList<DependencyGroup>();
    }
    this.dependencyGroups.add(dependencyGroupsItem);
    return this;
  }

   /**
   * DependencyGroups is a list of the groups of events.
   * @return dependencyGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DependencyGroups is a list of the groups of events.")

  public List<DependencyGroup> getDependencyGroups() {
    return dependencyGroups;
  }


  public void setDependencyGroups(List<DependencyGroup> dependencyGroups) {
    this.dependencyGroups = dependencyGroups;
  }


  public SensorSpec errorOnFailedRound(Boolean errorOnFailedRound) {
    
    this.errorOnFailedRound = errorOnFailedRound;
    return this;
  }

   /**
   * ErrorOnFailedRound if set to true, marks sensor state as &#x60;error&#x60; if the previous trigger round fails. Once sensor state is set to &#x60;error&#x60;, no further triggers will be processed.
   * @return errorOnFailedRound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ErrorOnFailedRound if set to true, marks sensor state as `error` if the previous trigger round fails. Once sensor state is set to `error`, no further triggers will be processed.")

  public Boolean getErrorOnFailedRound() {
    return errorOnFailedRound;
  }


  public void setErrorOnFailedRound(Boolean errorOnFailedRound) {
    this.errorOnFailedRound = errorOnFailedRound;
  }


  public SensorSpec triggers(List<Trigger> triggers) {
    
    this.triggers = triggers;
    return this;
  }

  public SensorSpec addTriggersItem(Trigger triggersItem) {
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * Triggers is a list of the things that this sensor evokes. These are the outputs from this sensor.
   * @return triggers
  **/
  @ApiModelProperty(required = true, value = "Triggers is a list of the things that this sensor evokes. These are the outputs from this sensor.")

  public List<Trigger> getTriggers() {
    return triggers;
  }


  public void setTriggers(List<Trigger> triggers) {
    this.triggers = triggers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensorSpec sensorSpec = (SensorSpec) o;
    return Objects.equals(this.template, sensorSpec.template) &&
        Objects.equals(this.replicas, sensorSpec.replicas) &&
        Objects.equals(this.eventBusName, sensorSpec.eventBusName) &&
        Objects.equals(this.dependencies, sensorSpec.dependencies) &&
        Objects.equals(this.circuit, sensorSpec.circuit) &&
        Objects.equals(this.dependencyGroups, sensorSpec.dependencyGroups) &&
        Objects.equals(this.errorOnFailedRound, sensorSpec.errorOnFailedRound) &&
        Objects.equals(this.triggers, sensorSpec.triggers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(template, replicas, eventBusName, dependencies, circuit, dependencyGroups, errorOnFailedRound, triggers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensorSpec {\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    eventBusName: ").append(toIndentedString(eventBusName)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    circuit: ").append(toIndentedString(circuit)).append("\n");
    sb.append("    dependencyGroups: ").append(toIndentedString(dependencyGroups)).append("\n");
    sb.append("    errorOnFailedRound: ").append(toIndentedString(errorOnFailedRound)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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

