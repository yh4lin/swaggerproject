/*
 * API ServiceOrder
 * Request the instantiation of a service  A Service Order is a type of order which can be used to describe a group of operations on service – one service order item per service. An action at the level of the service order item describe the operation to be done on a service (add, terminate for example). The service order is triggered from the BSS system in charge of the product order management to ONAP that will manage the service fulfillment.  List of available subscription for serviceOrdering notifications, see /hub resources for more information:  - ServiceOrderCreationNotification - ServiceOrderStateChangeNotification - ServiceOrderItemStateChangeNotification  
 *
 * OpenAPI spec version: 4.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.RelationshipType;
import io.swagger.client.model.Service;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Linked Services to the one instantiate nbi component used this relationship to sort request to ONAP.
 */
@Schema(description = "Linked Services to the one instantiate nbi component used this relationship to sort request to ONAP.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-22T18:40:19.698152-04:00[America/Toronto]")
public class ServiceRelationship {
  @SerializedName("type")
  private RelationshipType type = null;

  @SerializedName("service")
  private Service service = null;

  public ServiceRelationship type(RelationshipType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public RelationshipType getType() {
    return type;
  }

  public void setType(RelationshipType type) {
    this.type = type;
  }

  public ServiceRelationship service(Service service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @Schema(required = true, description = "")
  public Service getService() {
    return service;
  }

  public void setService(Service service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRelationship serviceRelationship = (ServiceRelationship) o;
    return Objects.equals(this.type, serviceRelationship.type) &&
        Objects.equals(this.service, serviceRelationship.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, service);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRelationship {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
