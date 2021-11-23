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
 * ConfigMapPersistence
 */

public class ConfigMapPersistence {
  public static final String SERIALIZED_NAME_CREATE_IF_NOT_EXIST = "createIfNotExist";
  @SerializedName(SERIALIZED_NAME_CREATE_IF_NOT_EXIST)
  private Boolean createIfNotExist;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public ConfigMapPersistence createIfNotExist(Boolean createIfNotExist) {
    
    this.createIfNotExist = createIfNotExist;
    return this;
  }

   /**
   * CreateIfNotExist will create configmap if it doesn&#39;t exists
   * @return createIfNotExist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CreateIfNotExist will create configmap if it doesn't exists")

  public Boolean getCreateIfNotExist() {
    return createIfNotExist;
  }


  public void setCreateIfNotExist(Boolean createIfNotExist) {
    this.createIfNotExist = createIfNotExist;
  }


  public ConfigMapPersistence name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the configmap
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the configmap")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigMapPersistence configMapPersistence = (ConfigMapPersistence) o;
    return Objects.equals(this.createIfNotExist, configMapPersistence.createIfNotExist) &&
        Objects.equals(this.name, configMapPersistence.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createIfNotExist, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigMapPersistence {\n");
    sb.append("    createIfNotExist: ").append(toIndentedString(createIfNotExist)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

