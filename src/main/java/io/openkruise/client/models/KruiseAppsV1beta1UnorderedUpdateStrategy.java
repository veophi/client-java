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
import io.openkruise.client.models.KruiseAppsPubUpdatePriorityStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UnorderedUpdateStrategy defines strategies for non-ordered update.
 */
@ApiModel(description = "UnorderedUpdateStrategy defines strategies for non-ordered update.")

public class KruiseAppsV1beta1UnorderedUpdateStrategy {
  @SerializedName("priorityStrategy")
  private KruiseAppsPubUpdatePriorityStrategy priorityStrategy = null;

  public KruiseAppsV1beta1UnorderedUpdateStrategy priorityStrategy(KruiseAppsPubUpdatePriorityStrategy priorityStrategy) {
    this.priorityStrategy = priorityStrategy;
    return this;
  }

   /**
   * Priorities are the rules for calculating the priority of updating pods. Each pod to be updated, will pass through these terms and get a sum of weights.
   * @return priorityStrategy
  **/
  @ApiModelProperty(value = "Priorities are the rules for calculating the priority of updating pods. Each pod to be updated, will pass through these terms and get a sum of weights.")
  public KruiseAppsPubUpdatePriorityStrategy getPriorityStrategy() {
    return priorityStrategy;
  }

  public void setPriorityStrategy(KruiseAppsPubUpdatePriorityStrategy priorityStrategy) {
    this.priorityStrategy = priorityStrategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1beta1UnorderedUpdateStrategy kruiseAppsV1beta1UnorderedUpdateStrategy = (KruiseAppsV1beta1UnorderedUpdateStrategy) o;
    return Objects.equals(this.priorityStrategy, kruiseAppsV1beta1UnorderedUpdateStrategy.priorityStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorityStrategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1beta1UnorderedUpdateStrategy {\n");
    
    sb.append("    priorityStrategy: ").append(toIndentedString(priorityStrategy)).append("\n");
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
