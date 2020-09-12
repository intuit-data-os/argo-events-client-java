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
 * WatchPathConfig
 */

public class WatchPathConfig {
  public static final String SERIALIZED_NAME_DIRECTORY = "directory";
  @SerializedName(SERIALIZED_NAME_DIRECTORY)
  private String directory;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PATH_REGEXP = "pathRegexp";
  @SerializedName(SERIALIZED_NAME_PATH_REGEXP)
  private String pathRegexp;


  public WatchPathConfig directory(String directory) {
    
    this.directory = directory;
    return this;
  }

   /**
   * Directory to watch for events
   * @return directory
  **/
  @ApiModelProperty(required = true, value = "Directory to watch for events")

  public String getDirectory() {
    return directory;
  }


  public void setDirectory(String directory) {
    this.directory = directory;
  }


  public WatchPathConfig path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path is relative path of object to watch with respect to the directory
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path is relative path of object to watch with respect to the directory")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public WatchPathConfig pathRegexp(String pathRegexp) {
    
    this.pathRegexp = pathRegexp;
    return this;
  }

   /**
   * PathRegexp is regexp of relative path of object to watch with respect to the directory
   * @return pathRegexp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PathRegexp is regexp of relative path of object to watch with respect to the directory")

  public String getPathRegexp() {
    return pathRegexp;
  }


  public void setPathRegexp(String pathRegexp) {
    this.pathRegexp = pathRegexp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchPathConfig watchPathConfig = (WatchPathConfig) o;
    return Objects.equals(this.directory, watchPathConfig.directory) &&
        Objects.equals(this.path, watchPathConfig.path) &&
        Objects.equals(this.pathRegexp, watchPathConfig.pathRegexp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directory, path, pathRegexp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchPathConfig {\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathRegexp: ").append(toIndentedString(pathRegexp)).append("\n");
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

