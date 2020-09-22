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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * A related party defines party which are involved in this order and the role they are playing. for Beijing release: With the current version of APIs used from SO and AAI we need to manage a ‘customer’. This customer concept is confusing with Customer BSS concept. We took the following rules to manage the ‘customer’ information: o It could be provided through a serviceOrder in the service Order a relatedParty with role ‘ONAPcustomer’ should be provided in the serviceOrder header (we will not consider in this release the party at item level); External API component will check if this customer exists and create it in AAI if not. o If no relatedParty are provided the service will be affected to ‘generic’ customer (dummy customer) – we assume this ‘generic’ customer always exists.
 */
@Schema(description = "A related party defines party which are involved in this order and the role they are playing. for Beijing release: With the current version of APIs used from SO and AAI we need to manage a ‘customer’. This customer concept is confusing with Customer BSS concept. We took the following rules to manage the ‘customer’ information: o It could be provided through a serviceOrder in the service Order a relatedParty with role ‘ONAPcustomer’ should be provided in the serviceOrder header (we will not consider in this release the party at item level); External API component will check if this customer exists and create it in AAI if not. o If no relatedParty are provided the service will be affected to ‘generic’ customer (dummy customer) – we assume this ‘generic’ customer always exists.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-22T18:40:19.698152-04:00[America/Toronto]")
public class RelatedParty {
  @SerializedName("id")
  private String id = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("@referredType")
  private String _atReferredType = null;

  public RelatedParty id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of a related party
   * @return id
  **/
  @Schema(required = true, description = "Unique identifier of a related party")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedParty href(String href) {
    this.href = href;
    return this;
  }

   /**
   * An hyperlink to the party - not used in Beijnig release
   * @return href
  **/
  @Schema(description = "An hyperlink to the party - not used in Beijnig release")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public RelatedParty role(String role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the related party (e.g. Owner, requester, fullfiller etc). ONLY &#x27;ONAPcustomer&#x27; is considered
   * @return role
  **/
  @Schema(required = true, description = "The role of the related party (e.g. Owner, requester, fullfiller etc). ONLY 'ONAPcustomer' is considered")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedParty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the related party
   * @return name
  **/
  @Schema(description = "Name of the related party")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RelatedParty _atReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
    return this;
  }

   /**
   * Get _atReferredType
   * @return _atReferredType
  **/
  @Schema(description = "")
  public String getAtReferredType() {
    return _atReferredType;
  }

  public void setAtReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedParty relatedParty = (RelatedParty) o;
    return Objects.equals(this.id, relatedParty.id) &&
        Objects.equals(this.href, relatedParty.href) &&
        Objects.equals(this.role, relatedParty.role) &&
        Objects.equals(this.name, relatedParty.name) &&
        Objects.equals(this._atReferredType, relatedParty._atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, role, name, _atReferredType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedParty {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _atReferredType: ").append(toIndentedString(_atReferredType)).append("\n");
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
