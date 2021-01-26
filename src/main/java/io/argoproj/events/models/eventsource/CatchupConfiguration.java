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
 * CatchupConfiguration
 */

public class CatchupConfiguration {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_MAX_DURATION = "maxDuration";
  @SerializedName(SERIALIZED_NAME_MAX_DURATION)
  private String maxDuration;


  public CatchupConfiguration enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Enabled enables to triggered the missed schedule when eventsource restarts
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enabled enables to triggered the missed schedule when eventsource restarts")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public CatchupConfiguration maxDuration(String maxDuration) {
    
    this.maxDuration = maxDuration;
    return this;
  }

   /**
   * MaxDuration holds max catchup duration
   * @return maxDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MaxDuration holds max catchup duration")

  public String getMaxDuration() {
    return maxDuration;
  }


  public void setMaxDuration(String maxDuration) {
    this.maxDuration = maxDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatchupConfiguration catchupConfiguration = (CatchupConfiguration) o;
    return Objects.equals(this.enabled, catchupConfiguration.enabled) &&
        Objects.equals(this.maxDuration, catchupConfiguration.maxDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, maxDuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatchupConfiguration {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    maxDuration: ").append(toIndentedString(maxDuration)).append("\n");
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

