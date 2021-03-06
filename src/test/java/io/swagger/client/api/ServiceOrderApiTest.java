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

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CreateServiceOrder;
import io.swagger.client.model.ServiceOrder;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServiceOrderApi
 */
@Ignore
public class ServiceOrderApiTest {

    private final ServiceOrderApi api = new ServiceOrderApi();

    /**
     * Create a service order
     *
     * This operation creates a service order entity. The TMF Open API specification document provides the list of mandatory and non mandatory attributes when creating a ServiceOrder, including any possible rule conditions and applicable default values. POST should be used without specifying the id and the href, the Service Order Management system is in charge of generating the id + href for the ServiceOrder.  In Beijing Release, NBI will use only POST {{url}}/ecomp/mso/infra/serviceInstances/v4 SO API. This mean that only the &#x27;service-instance&#x27; level will be created in AAI. Additional resource like VNF and/OR VF are not created.  In Casablanca release, NBI has been improved to also be able to use POST {{url}}/e2eServiceInstances/v3 SO API. This API is able to instantiate in ONAP E2E service; This is useful for CCVPN and VoLTE UC. Depending on the service category defined in SDC, NBI will use one or the other SO API. If category starts with e2e, NBI will use  {url}}/e2eServiceInstances/v3 SO API - else it will use {{url}}/ecomp/mso/infra/serviceInstances/v4 SO API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void serviceOrderCreateTest() throws ApiException {
        CreateServiceOrder body = null;
        String target = null;
        ServiceOrder response = api.serviceOrderCreate(body, target);

        // TODO: test validations
    }
    /**
     * List service orders
     *
     * Retrieve and list service order entities according to given criteria. Only a predefined set of attribute is proposed. Attribute selection could be described in the fields attribute.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void serviceOrderFindTest() throws ApiException {
        String externalId = null;
        String state = null;
        String description = null;
        String orderDateGt = null;
        String orderDateLt = null;
        String fields = null;
        Integer offset = null;
        Integer limit = null;
        List<ServiceOrder> response = api.serviceOrderFind(externalId, state, description, orderDateGt, orderDateLt, fields, offset, limit);

        // TODO: test validations
    }
    /**
     * Retrieve a service order
     *
     * This operation retrieves a service order entity.  Attribute selection is enabled for all first level attributes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void serviceOrderGetTest() throws ApiException {
        String id = null;
        String fields = null;
        String target = null;
        ServiceOrder response = api.serviceOrderGet(id, fields, target);

        // TODO: test validations
    }
}
