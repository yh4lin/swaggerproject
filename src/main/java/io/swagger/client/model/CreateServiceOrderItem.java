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
import io.swagger.client.model.ActionType;
import io.swagger.client.model.OrderItemRelationship;
import io.swagger.client.model.Service;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This structure is used in the operation POST for a serviceOrder request to describe an item. Attribute description is not accurate and should be find in the serviceOrderItem class.
 */
@Schema(description = "This structure is used in the operation POST for a serviceOrder request to describe an item. Attribute description is not accurate and should be find in the serviceOrderItem class.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-22T18:40:19.698152-04:00[America/Toronto]")
public class CreateServiceOrderItem {
  @SerializedName("id")
  private String id = null;

  @SerializedName("action")
  private ActionType action = null;

  @SerializedName("orderItemRelationship")
  private List<OrderItemRelationship> orderItemRelationship = null;

  @SerializedName("service")
  private Service service = null;

  public CreateServiceOrderItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the line item (generally it is a sequence number 01, 02, 03, …)
   * @return id
  **/
  @Schema(required = true, description = "Identifier of the line item (generally it is a sequence number 01, 02, 03, …)")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateServiceOrderItem action(ActionType action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public ActionType getAction() {
    return action;
  }

  public void setAction(ActionType action) {
    this.action = action;
  }

  public CreateServiceOrderItem orderItemRelationship(List<OrderItemRelationship> orderItemRelationship) {
    this.orderItemRelationship = orderItemRelationship;
    return this;
  }

  public CreateServiceOrderItem addOrderItemRelationshipItem(OrderItemRelationship orderItemRelationshipItem) {
    if (this.orderItemRelationship == null) {
      this.orderItemRelationship = new ArrayList<OrderItemRelationship>();
    }
    this.orderItemRelationship.add(orderItemRelationshipItem);
    return this;
  }

   /**
   * Get orderItemRelationship
   * @return orderItemRelationship
  **/
  @Schema(description = "")
  public List<OrderItemRelationship> getOrderItemRelationship() {
    return orderItemRelationship;
  }

  public void setOrderItemRelationship(List<OrderItemRelationship> orderItemRelationship) {
    this.orderItemRelationship = orderItemRelationship;
  }

  public CreateServiceOrderItem service(Service service) {
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
    CreateServiceOrderItem createServiceOrderItem = (CreateServiceOrderItem) o;
    return Objects.equals(this.id, createServiceOrderItem.id) &&
        Objects.equals(this.action, createServiceOrderItem.action) &&
        Objects.equals(this.orderItemRelationship, createServiceOrderItem.orderItemRelationship) &&
        Objects.equals(this.service, createServiceOrderItem.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, action, orderItemRelationship, service);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateServiceOrderItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    orderItemRelationship: ").append(toIndentedString(orderItemRelationship)).append("\n");
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
