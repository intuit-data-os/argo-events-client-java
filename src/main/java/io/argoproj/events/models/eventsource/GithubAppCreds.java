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


package io.argoproj.events.models.eventsource;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GithubAppCreds
 */

public class GithubAppCreds {
  public static final String SERIALIZED_NAME_INSTALLATION_I_D = "installationID";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_I_D)
  private Long installationID;

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "privateKey";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private V1SecretKeySelector privateKey = null;

  public static final String SERIALIZED_NAME_APP_I_D = "appID";
  @SerializedName(SERIALIZED_NAME_APP_I_D)
  private Long appID;


  public GithubAppCreds installationID(Long installationID) {
    
    this.installationID = installationID;
    return this;
  }

   /**
   * InstallationID refers to the Installation ID of the GitHub app you created and installed
   * @return installationID
  **/
  @ApiModelProperty(required = true, value = "InstallationID refers to the Installation ID of the GitHub app you created and installed")

  public Long getInstallationID() {
    return installationID;
  }


  public void setInstallationID(Long installationID) {
    this.installationID = installationID;
  }


  public GithubAppCreds privateKey(V1SecretKeySelector privateKey) {
    
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Get privateKey
   * @return privateKey
  **/
  @ApiModelProperty(required = true, value = "")

  public V1SecretKeySelector getPrivateKey() {
    return privateKey;
  }


  public void setPrivateKey(V1SecretKeySelector privateKey) {
    this.privateKey = privateKey;
  }


  public GithubAppCreds appID(Long appID) {
    
    this.appID = appID;
    return this;
  }

   /**
   * AppID refers to the GitHub App ID for the application you created
   * @return appID
  **/
  @ApiModelProperty(required = true, value = "AppID refers to the GitHub App ID for the application you created")

  public Long getAppID() {
    return appID;
  }


  public void setAppID(Long appID) {
    this.appID = appID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubAppCreds githubAppCreds = (GithubAppCreds) o;
    return Objects.equals(this.installationID, githubAppCreds.installationID) &&
        Objects.equals(this.privateKey, githubAppCreds.privateKey) &&
        Objects.equals(this.appID, githubAppCreds.appID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installationID, privateKey, appID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubAppCreds {\n");
    sb.append("    installationID: ").append(toIndentedString(installationID)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    appID: ").append(toIndentedString(appID)).append("\n");
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

