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
 * GitRemoteConfig contains the configuration of a Git remote
 */
@ApiModel(description = "GitRemoteConfig contains the configuration of a Git remote")

public class GitRemoteConfig {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private List<String> urls = new ArrayList<String>();


  public GitRemoteConfig name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the remote to fetch from.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the remote to fetch from.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GitRemoteConfig urls(List<String> urls) {
    
    this.urls = urls;
    return this;
  }

  public GitRemoteConfig addUrlsItem(String urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * URLs the URLs of a remote repository. It must be non-empty. Fetch will always use the first URL, while push will use all of them.
   * @return urls
  **/
  @ApiModelProperty(required = true, value = "URLs the URLs of a remote repository. It must be non-empty. Fetch will always use the first URL, while push will use all of them.")

  public List<String> getUrls() {
    return urls;
  }


  public void setUrls(List<String> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitRemoteConfig gitRemoteConfig = (GitRemoteConfig) o;
    return Objects.equals(this.name, gitRemoteConfig.name) &&
        Objects.equals(this.urls, gitRemoteConfig.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitRemoteConfig {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

