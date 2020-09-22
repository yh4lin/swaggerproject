# ServiceOrderApi

All URIs are relative to *http://localhost:8080/nbi/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serviceOrderCreate**](ServiceOrderApi.md#serviceOrderCreate) | **POST** /serviceOrder | Create a service order
[**serviceOrderFind**](ServiceOrderApi.md#serviceOrderFind) | **GET** /serviceOrder | List service orders
[**serviceOrderGet**](ServiceOrderApi.md#serviceOrderGet) | **GET** /serviceOrder/{id} | Retrieve a service order

<a name="serviceOrderCreate"></a>
# **serviceOrderCreate**
> ServiceOrder serviceOrderCreate(body, target)

Create a service order

This operation creates a service order entity. The TMF Open API specification document provides the list of mandatory and non mandatory attributes when creating a ServiceOrder, including any possible rule conditions and applicable default values. POST should be used without specifying the id and the href, the Service Order Management system is in charge of generating the id + href for the ServiceOrder.  In Beijing Release, NBI will use only POST {{url}}/ecomp/mso/infra/serviceInstances/v4 SO API. This mean that only the &#x27;service-instance&#x27; level will be created in AAI. Additional resource like VNF and/OR VF are not created.  In Casablanca release, NBI has been improved to also be able to use POST {{url}}/e2eServiceInstances/v3 SO API. This API is able to instantiate in ONAP E2E service; This is useful for CCVPN and VoLTE UC. Depending on the service category defined in SDC, NBI will use one or the other SO API. If category starts with e2e, NBI will use  {url}}/e2eServiceInstances/v3 SO API - else it will use {{url}}/ecomp/mso/infra/serviceInstances/v4 SO API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceOrderApi;


ServiceOrderApi apiInstance = new ServiceOrderApi();
CreateServiceOrder body = new CreateServiceOrder(); // CreateServiceOrder | 
String target = "target_example"; // String | 
try {
    ServiceOrder result = apiInstance.serviceOrderCreate(body, target);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceOrderApi#serviceOrderCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateServiceOrder**](CreateServiceOrder.md)|  |
 **target** | **String**|  | [optional]

### Return type

[**ServiceOrder**](ServiceOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="serviceOrderFind"></a>
# **serviceOrderFind**
> List&lt;ServiceOrder&gt; serviceOrderFind(externalId, state, description, orderDateGt, orderDateLt, fields, offset, limit)

List service orders

Retrieve and list service order entities according to given criteria. Only a predefined set of attribute is proposed. Attribute selection could be described in the fields attribute.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceOrderApi;


ServiceOrderApi apiInstance = new ServiceOrderApi();
String externalId = "externalId_example"; // String | 
String state = "state_example"; // String | state of the order(s) to be retrieved
String description = "description_example"; // String | 
String orderDateGt = "orderDateGt_example"; // String | order date greather than
String orderDateLt = "orderDateLt_example"; // String | order date lower than
String fields = "fields_example"; // String | this attribute could be used to filter retrieved attribute(s) and/or sort SO.
Integer offset = 56; // Integer | The index of the first element to retrieve. Zero is the first element of the collection.
Integer limit = 56; // Integer | The maximum number of elements to retrieve (it can be greater than the actual available number of items).
try {
    List<ServiceOrder> result = apiInstance.serviceOrderFind(externalId, state, description, orderDateGt, orderDateLt, fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceOrderApi#serviceOrderFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**|  | [optional]
 **state** | **String**| state of the order(s) to be retrieved | [optional]
 **description** | **String**|  | [optional]
 **orderDateGt** | **String**| order date greather than | [optional]
 **orderDateLt** | **String**| order date lower than | [optional]
 **fields** | **String**| this attribute could be used to filter retrieved attribute(s) and/or sort SO. | [optional]
 **offset** | **Integer**| The index of the first element to retrieve. Zero is the first element of the collection. | [optional]
 **limit** | **Integer**| The maximum number of elements to retrieve (it can be greater than the actual available number of items). | [optional]

### Return type

[**List&lt;ServiceOrder&gt;**](ServiceOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="serviceOrderGet"></a>
# **serviceOrderGet**
> ServiceOrder serviceOrderGet(id, fields, target)

Retrieve a service order

This operation retrieves a service order entity.  Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceOrderApi;


ServiceOrderApi apiInstance = new ServiceOrderApi();
String id = "id_example"; // String | 
String fields = "fields_example"; // String | Attribute selection
String target = "target_example"; // String | 
try {
    ServiceOrder result = apiInstance.serviceOrderGet(id, fields, target);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceOrderApi#serviceOrderGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **fields** | **String**| Attribute selection | [optional]
 **target** | **String**|  | [optional]

### Return type

[**ServiceOrder**](ServiceOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

