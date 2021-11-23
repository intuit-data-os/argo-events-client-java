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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LogTrigger
 */

public class LogTrigger {
  public static final String SERIALIZED_NAME_INTERVAL_SECONDS = "intervalSeconds";
  @SerializedName(SERIALIZED_NAME_INTERVAL_SECONDS)
  private Long intervalSeconds;


  public LogTrigger intervalSeconds(Long intervalSeconds) {
    
    this.intervalSeconds = intervalSeconds;
    return this;
  }

   /**
   * Only print messages every interval. Useful to prevent logging too much data for busy events.
   * @return intervalSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only print messages every interval. Useful to prevent logging too much data for busy events.")

  public Long getIntervalSeconds() {
    return intervalSeconds;
  }


  public void setIntervalSeconds(Long intervalSeconds) {
    this.intervalSeconds = intervalSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogTrigger logTrigger = (LogTrigger) o;
    return Objects.equals(this.intervalSeconds, logTrigger.intervalSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervalSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogTrigger {\n");
    sb.append("    intervalSeconds: ").append(toIndentedString(intervalSeconds)).append("\n");
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

