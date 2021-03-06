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
import io.swagger.client.model.Value;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ServiceCharacteristic
 */
@Schema(description = "ServiceCharacteristic")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-22T18:40:19.698152-04:00[America/Toronto]")
public class ServiceCharacteristic {
  @SerializedName("name")
  private String name = null;

  @SerializedName("valueType")
  private String valueType = null;

  @SerializedName("value")
  private Value value = null;

  public ServiceCharacteristic name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of characteristic
   * @return name
  **/
  @Schema(required = true, description = "Name of characteristic")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceCharacteristic valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @Schema(description = "")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public ServiceCharacteristic value(Value value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public Value getValue() {
    return value;
  }

  public void setValue(Value value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceCharacteristic serviceCharacteristic = (ServiceCharacteristic) o;
    return Objects.equals(this.name, serviceCharacteristic.name) &&
        Objects.equals(this.valueType, serviceCharacteristic.valueType) &&
        Objects.equals(this.value, serviceCharacteristic.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, valueType, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCharacteristic {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
