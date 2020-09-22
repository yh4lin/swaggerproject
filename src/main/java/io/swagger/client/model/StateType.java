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
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * List of possible state for the order and the orderItem.
 */
@JsonAdapter(StateType.Adapter.class)
public enum StateType {
  ACKNOWLEDGED("acknowledged"),
  REJECTED("rejected"),
  PENDING("pending"),
  HELD("held"),
  INPROGRESS("inProgress"),
  CANCELLED("cancelled"),
  COMPLETED("completed"),
  FAILED("failed"),
  PARTIAL("partial");

  private String value;

  StateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StateType fromValue(String text) {
    for (StateType b : StateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StateType.fromValue(String.valueOf(value));
    }
  }
}
