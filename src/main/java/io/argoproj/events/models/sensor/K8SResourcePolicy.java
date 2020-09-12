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


package io.argoproj.events.models.sensor;

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
 * K8SResourcePolicy refers to the policy used to check the state of K8s based triggers using labels
 */
@ApiModel(description = "K8SResourcePolicy refers to the policy used to check the state of K8s based triggers using labels")

public class K8SResourcePolicy {
  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_ERROR_ON_BACKOFF_TIMEOUT = "errorOnBackoffTimeout";
  @SerializedName(SERIALIZED_NAME_ERROR_ON_BACKOFF_TIMEOUT)
  private Boolean errorOnBackoffTimeout;

  public static final String SERIALIZED_NAME_BACKOFF = "backoff";
  @SerializedName(SERIALIZED_NAME_BACKOFF)
  private io.argoproj.events.models.common.Backoff backoff = null;


  public K8SResourcePolicy labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public K8SResourcePolicy putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Labels required to identify whether a resource is in success state
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Labels required to identify whether a resource is in success state")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public K8SResourcePolicy errorOnBackoffTimeout(Boolean errorOnBackoffTimeout) {
    
    this.errorOnBackoffTimeout = errorOnBackoffTimeout;
    return this;
  }

   /**
   * ErrorOnBackoffTimeout determines whether sensor should transition to error state if the trigger policy is unable to determine the state of the resource
   * @return errorOnBackoffTimeout
  **/
  @ApiModelProperty(required = true, value = "ErrorOnBackoffTimeout determines whether sensor should transition to error state if the trigger policy is unable to determine the state of the resource")

  public Boolean getErrorOnBackoffTimeout() {
    return errorOnBackoffTimeout;
  }


  public void setErrorOnBackoffTimeout(Boolean errorOnBackoffTimeout) {
    this.errorOnBackoffTimeout = errorOnBackoffTimeout;
  }


  public K8SResourcePolicy backoff(io.argoproj.events.models.common.Backoff backoff) {
    
    this.backoff = backoff;
    return this;
  }

   /**
   * Get backoff
   * @return backoff
  **/
  @ApiModelProperty(required = true, value = "")

  public io.argoproj.events.models.common.Backoff getBackoff() {
    return backoff;
  }


  public void setBackoff(io.argoproj.events.models.common.Backoff backoff) {
    this.backoff = backoff;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    K8SResourcePolicy k8SResourcePolicy = (K8SResourcePolicy) o;
    return Objects.equals(this.labels, k8SResourcePolicy.labels) &&
        Objects.equals(this.errorOnBackoffTimeout, k8SResourcePolicy.errorOnBackoffTimeout) &&
        Objects.equals(this.backoff, k8SResourcePolicy.backoff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, errorOnBackoffTimeout, backoff);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class K8SResourcePolicy {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    errorOnBackoffTimeout: ").append(toIndentedString(errorOnBackoffTimeout)).append("\n");
    sb.append("    backoff: ").append(toIndentedString(backoff)).append("\n");
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

