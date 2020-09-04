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
import io.argoproj.events.models.eventbus.NATSConfig;
import io.argoproj.events.models.eventbus.NativeStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NATSBus holds the NATS eventbus information
 */
@ApiModel(description = "NATSBus holds the NATS eventbus information")

public class NATSBus {
  public static final String SERIALIZED_NAME_EXOTIC = "exotic";
  @SerializedName(SERIALIZED_NAME_EXOTIC)
  private NATSConfig exotic;

  public static final String SERIALIZED_NAME_NATIVE = "native";
  @SerializedName(SERIALIZED_NAME_NATIVE)
  private NativeStrategy _native;


  public NATSBus exotic(NATSConfig exotic) {
    
    this.exotic = exotic;
    return this;
  }

   /**
   * Get exotic
   * @return exotic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NATSConfig getExotic() {
    return exotic;
  }


  public void setExotic(NATSConfig exotic) {
    this.exotic = exotic;
  }


  public NATSBus _native(NativeStrategy _native) {
    
    this._native = _native;
    return this;
  }

   /**
   * Get _native
   * @return _native
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NativeStrategy getNative() {
    return _native;
  }


  public void setNative(NativeStrategy _native) {
    this._native = _native;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NATSBus naTSBus = (NATSBus) o;
    return Objects.equals(this.exotic, naTSBus.exotic) &&
        Objects.equals(this._native, naTSBus._native);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exotic, _native);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NATSBus {\n");
    sb.append("    exotic: ").append(toIndentedString(exotic)).append("\n");
    sb.append("    _native: ").append(toIndentedString(_native)).append("\n");
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

