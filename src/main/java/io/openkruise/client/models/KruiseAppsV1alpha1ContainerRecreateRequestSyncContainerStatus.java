/*
 * Kruise
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.openkruise.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ContainerRecreateRequestSyncContainerStatus only uses in the annotation &#x60;crr.apps.kruise.io/sync-container-statuses&#x60;.
 */
@ApiModel(description = "ContainerRecreateRequestSyncContainerStatus only uses in the annotation `crr.apps.kruise.io/sync-container-statuses`.")

public class KruiseAppsV1alpha1ContainerRecreateRequestSyncContainerStatus {
  @SerializedName("containerID")
  private String containerID = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ready")
  private Boolean ready = null;

  @SerializedName("restartCount")
  private Integer restartCount = null;

  public KruiseAppsV1alpha1ContainerRecreateRequestSyncContainerStatus containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

   /**
   * Container&#39;s ID in the format &#39;docker://&lt;container_id&gt;&#39;.
   * @return containerID
  **/
  @ApiModelProperty(value = "Container's ID in the format 'docker://<container_id>'.")
  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestSyncContainerStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestSyncContainerStatus ready(Boolean ready) {
    this.ready = ready;
    return this;
  }

   /**
   * Specifies whether the container has passed its readiness probe.
   * @return ready
  **/
  @ApiModelProperty(required = true, value = "Specifies whether the container has passed its readiness probe.")
  public Boolean isReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestSyncContainerStatus restartCount(Integer restartCount) {
    this.restartCount = restartCount;
    return this;
  }

   /**
   * The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed.
   * @return restartCount
  **/
  @ApiModelProperty(required = true, value = "The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed.")
  public Integer getRestartCount() {
    return restartCount;
  }

  public void setRestartCount(Integer restartCount) {
    this.restartCount = restartCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1ContainerRecreateRequestSyncContainerStatus kruiseAppsV1alpha1ContainerRecreateRequestSyncContainerStatus = (KruiseAppsV1alpha1ContainerRecreateRequestSyncContainerStatus) o;
    return Objects.equals(this.containerID, kruiseAppsV1alpha1ContainerRecreateRequestSyncContainerStatus.containerID) &&
        Objects.equals(this.name, kruiseAppsV1alpha1ContainerRecreateRequestSyncContainerStatus.name) &&
        Objects.equals(this.ready, kruiseAppsV1alpha1ContainerRecreateRequestSyncContainerStatus.ready) &&
        Objects.equals(this.restartCount, kruiseAppsV1alpha1ContainerRecreateRequestSyncContainerStatus.restartCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerID, name, ready, restartCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ContainerRecreateRequestSyncContainerStatus {\n");
    
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
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
