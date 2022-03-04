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
import io.argoproj.events.models.sensor.ConditionsResetByTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ConditionsResetCriteria
 */

public class ConditionsResetCriteria {
  public static final String SERIALIZED_NAME_BY_TIME = "byTime";
  @SerializedName(SERIALIZED_NAME_BY_TIME)
  private ConditionsResetByTime byTime;


  public ConditionsResetCriteria byTime(ConditionsResetByTime byTime) {
    
    this.byTime = byTime;
    return this;
  }

   /**
   * Get byTime
   * @return byTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConditionsResetByTime getByTime() {
    return byTime;
  }


  public void setByTime(ConditionsResetByTime byTime) {
    this.byTime = byTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionsResetCriteria conditionsResetCriteria = (ConditionsResetCriteria) o;
    return Objects.equals(this.byTime, conditionsResetCriteria.byTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionsResetCriteria {\n");
    sb.append("    byTime: ").append(toIndentedString(byTime)).append("\n");
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

