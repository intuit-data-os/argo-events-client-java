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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RateLimit
 */

public class RateLimit {
  public static final String SERIALIZED_NAME_REQUESTS_PER_UNIT = "requestsPerUnit";
  @SerializedName(SERIALIZED_NAME_REQUESTS_PER_UNIT)
  private Integer requestsPerUnit;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;


  public RateLimit requestsPerUnit(Integer requestsPerUnit) {
    
    this.requestsPerUnit = requestsPerUnit;
    return this;
  }

   /**
   * Get requestsPerUnit
   * @return requestsPerUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRequestsPerUnit() {
    return requestsPerUnit;
  }


  public void setRequestsPerUnit(Integer requestsPerUnit) {
    this.requestsPerUnit = requestsPerUnit;
  }


  public RateLimit unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Defaults to Second
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defaults to Second")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimit rateLimit = (RateLimit) o;
    return Objects.equals(this.requestsPerUnit, rateLimit.requestsPerUnit) &&
        Objects.equals(this.unit, rateLimit.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestsPerUnit, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimit {\n");
    sb.append("    requestsPerUnit: ").append(toIndentedString(requestsPerUnit)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

