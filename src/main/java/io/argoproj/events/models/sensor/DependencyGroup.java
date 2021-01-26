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
 * DependencyGroup is the group of dependencies
 */
@ApiModel(description = "DependencyGroup is the group of dependencies")

public class DependencyGroup {
  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  private List<String> dependencies = new ArrayList<String>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public DependencyGroup dependencies(List<String> dependencies) {
    
    this.dependencies = dependencies;
    return this;
  }

  public DependencyGroup addDependenciesItem(String dependenciesItem) {
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Dependencies of events
   * @return dependencies
  **/
  @ApiModelProperty(required = true, value = "Dependencies of events")

  public List<String> getDependencies() {
    return dependencies;
  }


  public void setDependencies(List<String> dependencies) {
    this.dependencies = dependencies;
  }


  public DependencyGroup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the group
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the group")

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
    DependencyGroup dependencyGroup = (DependencyGroup) o;
    return Objects.equals(this.dependencies, dependencyGroup.dependencies) &&
        Objects.equals(this.name, dependencyGroup.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyGroup {\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
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

