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
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaim;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.openkruise.client.models.KruiseAppsPubLifecycle;
import io.openkruise.client.models.KruiseAppsV1alpha1CloneSetScaleStrategy;
import io.openkruise.client.models.KruiseAppsV1alpha1CloneSetUpdateStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CloneSetSpec defines the desired state of CloneSet
 */
@ApiModel(description = "CloneSetSpec defines the desired state of CloneSet")

public class KruiseAppsV1alpha1CloneSetSpec {
  @SerializedName("lifecycle")
  private KruiseAppsPubLifecycle lifecycle = null;

  @SerializedName("minReadySeconds")
  private Integer minReadySeconds = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("revisionHistoryLimit")
  private Integer revisionHistoryLimit = null;

  @SerializedName("scaleStrategy")
  private KruiseAppsV1alpha1CloneSetScaleStrategy scaleStrategy = null;

  @SerializedName("selector")
  private V1LabelSelector selector = null;

  @SerializedName("template")
  private V1PodTemplateSpec template = null;

  @SerializedName("updateStrategy")
  private KruiseAppsV1alpha1CloneSetUpdateStrategy updateStrategy = null;

  @SerializedName("volumeClaimTemplates")
  private List<V1PersistentVolumeClaim> volumeClaimTemplates = null;

  public KruiseAppsV1alpha1CloneSetSpec lifecycle(KruiseAppsPubLifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

   /**
   * Lifecycle defines the lifecycle hooks for Pods pre-delete, in-place update.
   * @return lifecycle
  **/
  @ApiModelProperty(value = "Lifecycle defines the lifecycle hooks for Pods pre-delete, in-place update.")
  public KruiseAppsPubLifecycle getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(KruiseAppsPubLifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }

  public KruiseAppsV1alpha1CloneSetSpec minReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

   /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   * @return minReadySeconds
  **/
  @ApiModelProperty(value = "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }

  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }

  public KruiseAppsV1alpha1CloneSetSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template. If unspecified, defaults to 1.
   * @return replicas
  **/
  @ApiModelProperty(value = "Replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template. If unspecified, defaults to 1.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public KruiseAppsV1alpha1CloneSetSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

   /**
   * RevisionHistoryLimit is the maximum number of revisions that will be maintained in the CloneSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied CloneSetSpec version. The default value is 10.
   * @return revisionHistoryLimit
  **/
  @ApiModelProperty(value = "RevisionHistoryLimit is the maximum number of revisions that will be maintained in the CloneSet's revision history. The revision history consists of all revisions not represented by a currently applied CloneSetSpec version. The default value is 10.")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public KruiseAppsV1alpha1CloneSetSpec scaleStrategy(KruiseAppsV1alpha1CloneSetScaleStrategy scaleStrategy) {
    this.scaleStrategy = scaleStrategy;
    return this;
  }

   /**
   * ScaleStrategy indicates the ScaleStrategy that will be employed to create and delete Pods in the CloneSet.
   * @return scaleStrategy
  **/
  @ApiModelProperty(value = "ScaleStrategy indicates the ScaleStrategy that will be employed to create and delete Pods in the CloneSet.")
  public KruiseAppsV1alpha1CloneSetScaleStrategy getScaleStrategy() {
    return scaleStrategy;
  }

  public void setScaleStrategy(KruiseAppsV1alpha1CloneSetScaleStrategy scaleStrategy) {
    this.scaleStrategy = scaleStrategy;
  }

  public KruiseAppsV1alpha1CloneSetSpec selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Selector is a label query over pods that should match the replica count. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
   * @return selector
  **/
  @ApiModelProperty(required = true, value = "Selector is a label query over pods that should match the replica count. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public KruiseAppsV1alpha1CloneSetSpec template(V1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

   /**
   * Template describes the pods that will be created.
   * @return template
  **/
  @ApiModelProperty(required = true, value = "Template describes the pods that will be created.")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }

  public KruiseAppsV1alpha1CloneSetSpec updateStrategy(KruiseAppsV1alpha1CloneSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
    return this;
  }

   /**
   * UpdateStrategy indicates the UpdateStrategy that will be employed to update Pods in the CloneSet when a revision is made to Template.
   * @return updateStrategy
  **/
  @ApiModelProperty(value = "UpdateStrategy indicates the UpdateStrategy that will be employed to update Pods in the CloneSet when a revision is made to Template.")
  public KruiseAppsV1alpha1CloneSetUpdateStrategy getUpdateStrategy() {
    return updateStrategy;
  }

  public void setUpdateStrategy(KruiseAppsV1alpha1CloneSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
  }

  public KruiseAppsV1alpha1CloneSetSpec volumeClaimTemplates(List<V1PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
    return this;
  }

  public KruiseAppsV1alpha1CloneSetSpec addVolumeClaimTemplatesItem(V1PersistentVolumeClaim volumeClaimTemplatesItem) {
    if (this.volumeClaimTemplates == null) {
      this.volumeClaimTemplates = new ArrayList<V1PersistentVolumeClaim>();
    }
    this.volumeClaimTemplates.add(volumeClaimTemplatesItem);
    return this;
  }

   /**
   * VolumeClaimTemplates is a list of claims that pods are allowed to reference. Note that PVC will be deleted when its pod has been deleted.
   * @return volumeClaimTemplates
  **/
  @ApiModelProperty(value = "VolumeClaimTemplates is a list of claims that pods are allowed to reference. Note that PVC will be deleted when its pod has been deleted.")
  public List<V1PersistentVolumeClaim> getVolumeClaimTemplates() {
    return volumeClaimTemplates;
  }

  public void setVolumeClaimTemplates(List<V1PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1CloneSetSpec kruiseAppsV1alpha1CloneSetSpec = (KruiseAppsV1alpha1CloneSetSpec) o;
    return Objects.equals(this.lifecycle, kruiseAppsV1alpha1CloneSetSpec.lifecycle) &&
        Objects.equals(this.minReadySeconds, kruiseAppsV1alpha1CloneSetSpec.minReadySeconds) &&
        Objects.equals(this.replicas, kruiseAppsV1alpha1CloneSetSpec.replicas) &&
        Objects.equals(this.revisionHistoryLimit, kruiseAppsV1alpha1CloneSetSpec.revisionHistoryLimit) &&
        Objects.equals(this.scaleStrategy, kruiseAppsV1alpha1CloneSetSpec.scaleStrategy) &&
        Objects.equals(this.selector, kruiseAppsV1alpha1CloneSetSpec.selector) &&
        Objects.equals(this.template, kruiseAppsV1alpha1CloneSetSpec.template) &&
        Objects.equals(this.updateStrategy, kruiseAppsV1alpha1CloneSetSpec.updateStrategy) &&
        Objects.equals(this.volumeClaimTemplates, kruiseAppsV1alpha1CloneSetSpec.volumeClaimTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycle, minReadySeconds, replicas, revisionHistoryLimit, scaleStrategy, selector, template, updateStrategy, volumeClaimTemplates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1CloneSetSpec {\n");
    
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    scaleStrategy: ").append(toIndentedString(scaleStrategy)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
    sb.append("    volumeClaimTemplates: ").append(toIndentedString(volumeClaimTemplates)).append("\n");
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

