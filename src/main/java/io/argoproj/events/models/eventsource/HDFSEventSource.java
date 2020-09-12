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
import io.kubernetes.client.openapi.models.V1ConfigMapKeySelector;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * HDFSEventSource refers to event-source for HDFS related events
 */
@ApiModel(description = "HDFSEventSource refers to event-source for HDFS related events")

public class HDFSEventSource {
  public static final String SERIALIZED_NAME_KRB_USERNAME = "krbUsername";
  @SerializedName(SERIALIZED_NAME_KRB_USERNAME)
  private String krbUsername;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<String>();

  public static final String SERIALIZED_NAME_CHECK_INTERVAL = "checkInterval";
  @SerializedName(SERIALIZED_NAME_CHECK_INTERVAL)
  private String checkInterval;

  public static final String SERIALIZED_NAME_KRB_C_CACHE_SECRET = "krbCCacheSecret";
  @SerializedName(SERIALIZED_NAME_KRB_C_CACHE_SECRET)
  private V1SecretKeySelector krbCCacheSecret = null;

  public static final String SERIALIZED_NAME_KRB_REALM = "krbRealm";
  @SerializedName(SERIALIZED_NAME_KRB_REALM)
  private String krbRealm;

  public static final String SERIALIZED_NAME_HDFS_USER = "hdfsUser";
  @SerializedName(SERIALIZED_NAME_HDFS_USER)
  private String hdfsUser;

  public static final String SERIALIZED_NAME_PATH_REGEXP = "pathRegexp";
  @SerializedName(SERIALIZED_NAME_PATH_REGEXP)
  private String pathRegexp;

  public static final String SERIALIZED_NAME_KRB_SERVICE_PRINCIPAL_NAME = "krbServicePrincipalName";
  @SerializedName(SERIALIZED_NAME_KRB_SERVICE_PRINCIPAL_NAME)
  private String krbServicePrincipalName;

  public static final String SERIALIZED_NAME_DIRECTORY = "directory";
  @SerializedName(SERIALIZED_NAME_DIRECTORY)
  private String directory;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_KRB_KEYTAB_SECRET = "krbKeytabSecret";
  @SerializedName(SERIALIZED_NAME_KRB_KEYTAB_SECRET)
  private V1SecretKeySelector krbKeytabSecret = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_KRB_CONFIG_CONFIG_MAP = "krbConfigConfigMap";
  @SerializedName(SERIALIZED_NAME_KRB_CONFIG_CONFIG_MAP)
  private V1ConfigMapKeySelector krbConfigConfigMap = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public HDFSEventSource krbUsername(String krbUsername) {
    
    this.krbUsername = krbUsername;
    return this;
  }

   /**
   * KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used.
   * @return krbUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used.")

  public String getKrbUsername() {
    return krbUsername;
  }


  public void setKrbUsername(String krbUsername) {
    this.krbUsername = krbUsername;
  }


  public HDFSEventSource addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public HDFSEventSource addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public HDFSEventSource checkInterval(String checkInterval) {
    
    this.checkInterval = checkInterval;
    return this;
  }

   /**
   * CheckInterval is a string that describes an interval duration to check the directory state, e.g. 1s, 30m, 2h... (defaults to 1m)
   * @return checkInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CheckInterval is a string that describes an interval duration to check the directory state, e.g. 1s, 30m, 2h... (defaults to 1m)")

  public String getCheckInterval() {
    return checkInterval;
  }


  public void setCheckInterval(String checkInterval) {
    this.checkInterval = checkInterval;
  }


  public HDFSEventSource krbCCacheSecret(V1SecretKeySelector krbCCacheSecret) {
    
    this.krbCCacheSecret = krbCCacheSecret;
    return this;
  }

   /**
   * Get krbCCacheSecret
   * @return krbCCacheSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getKrbCCacheSecret() {
    return krbCCacheSecret;
  }


  public void setKrbCCacheSecret(V1SecretKeySelector krbCCacheSecret) {
    this.krbCCacheSecret = krbCCacheSecret;
  }


  public HDFSEventSource krbRealm(String krbRealm) {
    
    this.krbRealm = krbRealm;
    return this;
  }

   /**
   * KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used.
   * @return krbRealm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used.")

  public String getKrbRealm() {
    return krbRealm;
  }


  public void setKrbRealm(String krbRealm) {
    this.krbRealm = krbRealm;
  }


  public HDFSEventSource hdfsUser(String hdfsUser) {
    
    this.hdfsUser = hdfsUser;
    return this;
  }

   /**
   * HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used.
   * @return hdfsUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used.")

  public String getHdfsUser() {
    return hdfsUser;
  }


  public void setHdfsUser(String hdfsUser) {
    this.hdfsUser = hdfsUser;
  }


  public HDFSEventSource pathRegexp(String pathRegexp) {
    
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


  public HDFSEventSource krbServicePrincipalName(String krbServicePrincipalName) {
    
    this.krbServicePrincipalName = krbServicePrincipalName;
    return this;
  }

   /**
   * KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used.
   * @return krbServicePrincipalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used.")

  public String getKrbServicePrincipalName() {
    return krbServicePrincipalName;
  }


  public void setKrbServicePrincipalName(String krbServicePrincipalName) {
    this.krbServicePrincipalName = krbServicePrincipalName;
  }


  public HDFSEventSource directory(String directory) {
    
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


  public HDFSEventSource path(String path) {
    
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


  public HDFSEventSource krbKeytabSecret(V1SecretKeySelector krbKeytabSecret) {
    
    this.krbKeytabSecret = krbKeytabSecret;
    return this;
  }

   /**
   * Get krbKeytabSecret
   * @return krbKeytabSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getKrbKeytabSecret() {
    return krbKeytabSecret;
  }


  public void setKrbKeytabSecret(V1SecretKeySelector krbKeytabSecret) {
    this.krbKeytabSecret = krbKeytabSecret;
  }


  public HDFSEventSource type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of file operations to watch
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of file operations to watch")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public HDFSEventSource krbConfigConfigMap(V1ConfigMapKeySelector krbConfigConfigMap) {
    
    this.krbConfigConfigMap = krbConfigConfigMap;
    return this;
  }

   /**
   * Get krbConfigConfigMap
   * @return krbConfigConfigMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ConfigMapKeySelector getKrbConfigConfigMap() {
    return krbConfigConfigMap;
  }


  public void setKrbConfigConfigMap(V1ConfigMapKeySelector krbConfigConfigMap) {
    this.krbConfigConfigMap = krbConfigConfigMap;
  }


  public HDFSEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public HDFSEventSource putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata holds the user defined metadata which will passed along the event payload.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata holds the user defined metadata which will passed along the event payload.")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HDFSEventSource hdFSEventSource = (HDFSEventSource) o;
    return Objects.equals(this.krbUsername, hdFSEventSource.krbUsername) &&
        Objects.equals(this.addresses, hdFSEventSource.addresses) &&
        Objects.equals(this.checkInterval, hdFSEventSource.checkInterval) &&
        Objects.equals(this.krbCCacheSecret, hdFSEventSource.krbCCacheSecret) &&
        Objects.equals(this.krbRealm, hdFSEventSource.krbRealm) &&
        Objects.equals(this.hdfsUser, hdFSEventSource.hdfsUser) &&
        Objects.equals(this.pathRegexp, hdFSEventSource.pathRegexp) &&
        Objects.equals(this.krbServicePrincipalName, hdFSEventSource.krbServicePrincipalName) &&
        Objects.equals(this.directory, hdFSEventSource.directory) &&
        Objects.equals(this.path, hdFSEventSource.path) &&
        Objects.equals(this.krbKeytabSecret, hdFSEventSource.krbKeytabSecret) &&
        Objects.equals(this.type, hdFSEventSource.type) &&
        Objects.equals(this.krbConfigConfigMap, hdFSEventSource.krbConfigConfigMap) &&
        Objects.equals(this.metadata, hdFSEventSource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(krbUsername, addresses, checkInterval, krbCCacheSecret, krbRealm, hdfsUser, pathRegexp, krbServicePrincipalName, directory, path, krbKeytabSecret, type, krbConfigConfigMap, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HDFSEventSource {\n");
    sb.append("    krbUsername: ").append(toIndentedString(krbUsername)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    checkInterval: ").append(toIndentedString(checkInterval)).append("\n");
    sb.append("    krbCCacheSecret: ").append(toIndentedString(krbCCacheSecret)).append("\n");
    sb.append("    krbRealm: ").append(toIndentedString(krbRealm)).append("\n");
    sb.append("    hdfsUser: ").append(toIndentedString(hdfsUser)).append("\n");
    sb.append("    pathRegexp: ").append(toIndentedString(pathRegexp)).append("\n");
    sb.append("    krbServicePrincipalName: ").append(toIndentedString(krbServicePrincipalName)).append("\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    krbKeytabSecret: ").append(toIndentedString(krbKeytabSecret)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    krbConfigConfigMap: ").append(toIndentedString(krbConfigConfigMap)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

