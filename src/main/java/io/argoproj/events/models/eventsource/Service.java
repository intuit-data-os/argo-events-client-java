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
import io.kubernetes.client.openapi.models.V1ServicePort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Service holds the service information eventsource exposes
 */
@ApiModel(description = "Service holds the service information eventsource exposes")

public class Service {
  public static final String SERIALIZED_NAME_CLUSTER_I_P = "clusterIP";
  @SerializedName(SERIALIZED_NAME_CLUSTER_I_P)
  private String clusterIP;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1ServicePort> ports = null;


  public Service clusterIP(String clusterIP) {
    
    this.clusterIP = clusterIP;
    return this;
  }

   /**
   * clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are \&quot;None\&quot;, empty string (\&quot;\&quot;), or a valid IP address. \&quot;None\&quot; can be specified for headless services when proxying is not required. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   * @return clusterIP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are \"None\", empty string (\"\"), or a valid IP address. \"None\" can be specified for headless services when proxying is not required. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")

  public String getClusterIP() {
    return clusterIP;
  }


  public void setClusterIP(String clusterIP) {
    this.clusterIP = clusterIP;
  }


  public Service ports(List<V1ServicePort> ports) {
    
    this.ports = ports;
    return this;
  }

  public Service addPortsItem(V1ServicePort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<V1ServicePort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * The list of ports that are exposed by this ClusterIP service.
   * @return ports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of ports that are exposed by this ClusterIP service.")

  public List<V1ServicePort> getPorts() {
    return ports;
  }


  public void setPorts(List<V1ServicePort> ports) {
    this.ports = ports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.clusterIP, service.clusterIP) &&
        Objects.equals(this.ports, service.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterIP, ports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    sb.append("    clusterIP: ").append(toIndentedString(clusterIP)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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

