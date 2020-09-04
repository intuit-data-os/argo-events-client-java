/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.17.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.events.models.eventbus;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.events.models.eventbus.ContainerTemplate;
import io.argoproj.events.models.eventbus.PersistenceStrategy;
import io.kubernetes.client.openapi.models.V1Toleration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * NativeStrategy indicates to install a native NATS service
 */
@ApiModel(description = "NativeStrategy indicates to install a native NATS service")

public class NativeStrategy {
  public static final String SERIALIZED_NAME_ANTI_AFFINITY = "antiAffinity";
  @SerializedName(SERIALIZED_NAME_ANTI_AFFINITY)
  private Boolean antiAffinity;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_AUTH = "auth";
  @SerializedName(SERIALIZED_NAME_AUTH)
  private String auth;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_METRICS_CONTAINER_TEMPLATE = "metricsContainerTemplate";
  @SerializedName(SERIALIZED_NAME_METRICS_CONTAINER_TEMPLATE)
  private ContainerTemplate metricsContainerTemplate;

  public static final String SERIALIZED_NAME_CONTAINER_TEMPLATE = "containerTemplate";
  @SerializedName(SERIALIZED_NAME_CONTAINER_TEMPLATE)
  private ContainerTemplate containerTemplate;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1Toleration> tolerations = null;

  public static final String SERIALIZED_NAME_PERSISTENCE = "persistence";
  @SerializedName(SERIALIZED_NAME_PERSISTENCE)
  private PersistenceStrategy persistence;


  public NativeStrategy antiAffinity(Boolean antiAffinity) {
    
    this.antiAffinity = antiAffinity;
    return this;
  }

   /**
   * Get antiAffinity
   * @return antiAffinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAntiAffinity() {
    return antiAffinity;
  }


  public void setAntiAffinity(Boolean antiAffinity) {
    this.antiAffinity = antiAffinity;
  }


  public NativeStrategy replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Size is the NATS StatefulSet size
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size is the NATS StatefulSet size")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public NativeStrategy auth(String auth) {
    
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuth() {
    return auth;
  }


  public void setAuth(String auth) {
    this.auth = auth;
  }


  public NativeStrategy nodeSelector(Map<String, String> nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

  public NativeStrategy putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")

  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public NativeStrategy metricsContainerTemplate(ContainerTemplate metricsContainerTemplate) {
    
    this.metricsContainerTemplate = metricsContainerTemplate;
    return this;
  }

   /**
   * Get metricsContainerTemplate
   * @return metricsContainerTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContainerTemplate getMetricsContainerTemplate() {
    return metricsContainerTemplate;
  }


  public void setMetricsContainerTemplate(ContainerTemplate metricsContainerTemplate) {
    this.metricsContainerTemplate = metricsContainerTemplate;
  }


  public NativeStrategy containerTemplate(ContainerTemplate containerTemplate) {
    
    this.containerTemplate = containerTemplate;
    return this;
  }

   /**
   * Get containerTemplate
   * @return containerTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContainerTemplate getContainerTemplate() {
    return containerTemplate;
  }


  public void setContainerTemplate(ContainerTemplate containerTemplate) {
    this.containerTemplate = containerTemplate;
  }


  public NativeStrategy tolerations(List<V1Toleration> tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

  public NativeStrategy addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<V1Toleration>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * If specified, the pod&#39;s tolerations.
   * @return tolerations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the pod's tolerations.")

  public List<V1Toleration> getTolerations() {
    return tolerations;
  }


  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }


  public NativeStrategy persistence(PersistenceStrategy persistence) {
    
    this.persistence = persistence;
    return this;
  }

   /**
   * Get persistence
   * @return persistence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersistenceStrategy getPersistence() {
    return persistence;
  }


  public void setPersistence(PersistenceStrategy persistence) {
    this.persistence = persistence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeStrategy nativeStrategy = (NativeStrategy) o;
    return Objects.equals(this.antiAffinity, nativeStrategy.antiAffinity) &&
        Objects.equals(this.replicas, nativeStrategy.replicas) &&
        Objects.equals(this.auth, nativeStrategy.auth) &&
        Objects.equals(this.nodeSelector, nativeStrategy.nodeSelector) &&
        Objects.equals(this.metricsContainerTemplate, nativeStrategy.metricsContainerTemplate) &&
        Objects.equals(this.containerTemplate, nativeStrategy.containerTemplate) &&
        Objects.equals(this.tolerations, nativeStrategy.tolerations) &&
        Objects.equals(this.persistence, nativeStrategy.persistence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antiAffinity, replicas, auth, nodeSelector, metricsContainerTemplate, containerTemplate, tolerations, persistence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeStrategy {\n");
    sb.append("    antiAffinity: ").append(toIndentedString(antiAffinity)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    metricsContainerTemplate: ").append(toIndentedString(metricsContainerTemplate)).append("\n");
    sb.append("    containerTemplate: ").append(toIndentedString(containerTemplate)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    persistence: ").append(toIndentedString(persistence)).append("\n");
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

