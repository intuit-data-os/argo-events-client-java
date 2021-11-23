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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Selector represents conditional operation to select K8s objects.
 */
@ApiModel(description = "Selector represents conditional operation to select K8s objects.")

public class Selector {
  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;


  public Selector operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Supported operations like &#x3D;&#x3D;, !&#x3D;, &lt;&#x3D;, &gt;&#x3D; etc. Defaults to &#x3D;&#x3D;. Refer https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors for more info.
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Supported operations like ==, !=, <=, >= etc. Defaults to ==. Refer https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors for more info.")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public Selector value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Value")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public Selector key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Key name
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Key name")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Selector selector = (Selector) o;
    return Objects.equals(this.operation, selector.operation) &&
        Objects.equals(this.value, selector.value) &&
        Objects.equals(this.key, selector.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, value, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Selector {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

