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
import java.util.ArrayList;
import java.util.List;

/**
 * TriggerSwitch describes condition which must be satisfied in order to execute a trigger. Depending upon condition type, status of dependency groups is used to evaluate the result. DEPRECATED
 */
@ApiModel(description = "TriggerSwitch describes condition which must be satisfied in order to execute a trigger. Depending upon condition type, status of dependency groups is used to evaluate the result. DEPRECATED")

public class TriggerSwitch {
  public static final String SERIALIZED_NAME_ALL = "all";
  @SerializedName(SERIALIZED_NAME_ALL)
  private List<String> all = null;

  public static final String SERIALIZED_NAME_ANY = "any";
  @SerializedName(SERIALIZED_NAME_ANY)
  private List<String> any = null;


  public TriggerSwitch all(List<String> all) {
    
    this.all = all;
    return this;
  }

  public TriggerSwitch addAllItem(String allItem) {
    if (this.all == null) {
      this.all = new ArrayList<String>();
    }
    this.all.add(allItem);
    return this;
  }

   /**
   * All acts as a AND operator between dependencies
   * @return all
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All acts as a AND operator between dependencies")

  public List<String> getAll() {
    return all;
  }


  public void setAll(List<String> all) {
    this.all = all;
  }


  public TriggerSwitch any(List<String> any) {
    
    this.any = any;
    return this;
  }

  public TriggerSwitch addAnyItem(String anyItem) {
    if (this.any == null) {
      this.any = new ArrayList<String>();
    }
    this.any.add(anyItem);
    return this;
  }

   /**
   * Any acts as a OR operator between dependencies
   * @return any
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any acts as a OR operator between dependencies")

  public List<String> getAny() {
    return any;
  }


  public void setAny(List<String> any) {
    this.any = any;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerSwitch triggerSwitch = (TriggerSwitch) o;
    return Objects.equals(this.all, triggerSwitch.all) &&
        Objects.equals(this.any, triggerSwitch.any);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, any);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerSwitch {\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    any: ").append(toIndentedString(any)).append("\n");
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

