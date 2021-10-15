/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.4.0
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
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PersistenceStrategy defines the strategy of persistence
 */
@ApiModel(description = "PersistenceStrategy defines the strategy of persistence")

public class PersistenceStrategy {
  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME = "storageClassName";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME)
  private String storageClassName;

  public static final String SERIALIZED_NAME_ACCESS_MODE = "accessMode";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODE)
  private String accessMode;

  public static final String SERIALIZED_NAME_VOLUME_SIZE = "volumeSize";
  @SerializedName(SERIALIZED_NAME_VOLUME_SIZE)
  private io.kubernetes.client.custom.Quantity volumeSize = null;


  public PersistenceStrategy storageClassName(String storageClassName) {
    
    this.storageClassName = storageClassName;
    return this;
  }

   /**
   * Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
   * @return storageClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1")

  public String getStorageClassName() {
    return storageClassName;
  }


  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }


  public PersistenceStrategy accessMode(String accessMode) {
    
    this.accessMode = accessMode;
    return this;
  }

   /**
   * Available access modes such as ReadWriteOnce, ReadWriteMany https://kubernetes.io/docs/concepts/storage/persistent-volumes/#access-modes
   * @return accessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Available access modes such as ReadWriteOnce, ReadWriteMany https://kubernetes.io/docs/concepts/storage/persistent-volumes/#access-modes")

  public String getAccessMode() {
    return accessMode;
  }


  public void setAccessMode(String accessMode) {
    this.accessMode = accessMode;
  }


  public PersistenceStrategy volumeSize(io.kubernetes.client.custom.Quantity volumeSize) {
    
    this.volumeSize = volumeSize;
    return this;
  }

   /**
   * Get volumeSize
   * @return volumeSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.custom.Quantity getVolumeSize() {
    return volumeSize;
  }


  public void setVolumeSize(io.kubernetes.client.custom.Quantity volumeSize) {
    this.volumeSize = volumeSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersistenceStrategy persistenceStrategy = (PersistenceStrategy) o;
    return Objects.equals(this.storageClassName, persistenceStrategy.storageClassName) &&
        Objects.equals(this.accessMode, persistenceStrategy.accessMode) &&
        Objects.equals(this.volumeSize, persistenceStrategy.volumeSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageClassName, accessMode, volumeSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistenceStrategy {\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
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

