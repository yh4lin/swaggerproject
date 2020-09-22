# NotificationApi

All URIs are relative to *http://localhost:8080/nbi/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationCreate**](NotificationApi.md#notificationCreate) | **POST** /notification | NBI will send notification to this operation provided by subscribers

<a name="notificationCreate"></a>
# **notificationCreate**
> Notification notificationCreate(body, target)

NBI will send notification to this operation provided by subscribers

Notification structure depends of the eventType:  - ServiceOrderCreationNotification - ServiceOrderStateChangeNotification  &#x60;&#x60;&#x60; {   \&quot;eventId\&quot;: \&quot;string\&quot;,   \&quot;eventDate\&quot;: \&quot;2019-03-12T16:21:27.530Z\&quot;,   \&quot;eventType\&quot;: \&quot;string\&quot;,   \&quot;event\&quot;: {     \&quot;id\&quot;: \&quot;string\&quot;,     \&quot;href\&quot;: \&quot;string\&quot;,     \&quot;externalId\&quot;: \&quot;string\&quot;,     \&quot;state\&quot;: \&quot;acknowledged\&quot;,     \&quot;orderDate\&quot;: \&quot;2019-03-12T16:21:27.530Z\&quot;,     \&quot;completionDateTime\&quot;: \&quot;2019-03-12T16:21:27.530Z\&quot;   } } &#x60;&#x60;&#x60;  - ServiceOrderItemStateChangeNotification  &#x60;&#x60;&#x60; {   \&quot;eventId\&quot;: \&quot;string\&quot;,   \&quot;eventDate\&quot;: \&quot;2019-03-12T16:21:44.066Z\&quot;,   \&quot;eventType\&quot;: \&quot;string\&quot;,   \&quot;event\&quot;: {     \&quot;id\&quot;: \&quot;string\&quot;,     \&quot;href\&quot;: \&quot;string\&quot;,     \&quot;externalId\&quot;: \&quot;string\&quot;,     \&quot;state\&quot;: \&quot;acknowledged\&quot;,     \&quot;orderDate\&quot;: \&quot;2019-03-12T16:21:44.066Z\&quot;,     \&quot;completionDateTime\&quot;: \&quot;2019-03-12T16:21:44.066Z\&quot;,     \&quot;orderItem\&quot;: [       {         \&quot;id\&quot;: \&quot;string\&quot;,         \&quot;action\&quot;: \&quot;add\&quot;,         \&quot;state\&quot;: \&quot;acknowledged\&quot;,         \&quot;service\&quot;: {           \&quot;id\&quot;: \&quot;string\&quot;,           \&quot;href\&quot;: \&quot;string\&quot;,           \&quot;name\&quot;: \&quot;string\&quot;,           \&quot;serviceState\&quot;: \&quot;string\&quot;,           \&quot;serviceCharacteristic\&quot;: [             {               \&quot;name\&quot;: \&quot;string\&quot;,               \&quot;valueType\&quot;: \&quot;string\&quot;,               \&quot;value\&quot;: {                 \&quot;serviceCharacteristicValue\&quot;: \&quot;string\&quot;               }             }           ],           \&quot;serviceRelationship\&quot;: [             {               \&quot;type\&quot;: \&quot;reliesOn\&quot;             }           ],           \&quot;relatedParty\&quot;: [             {               \&quot;id\&quot;: \&quot;string\&quot;,               \&quot;href\&quot;: \&quot;string\&quot;,               \&quot;role\&quot;: \&quot;string\&quot;,               \&quot;name\&quot;: \&quot;string\&quot;,               \&quot;@referredType\&quot;: \&quot;string\&quot;             }           ],           \&quot;serviceSpecification\&quot;: {             \&quot;id\&quot;: \&quot;string\&quot;,             \&quot;href\&quot;: \&quot;string\&quot;,             \&quot;name\&quot;: \&quot;string\&quot;,             \&quot;version\&quot;: \&quot;string\&quot;,           }         }       }     ]   } } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
Notification body = new Notification(); // Notification | 
String target = "target_example"; // String | 
try {
    Notification result = apiInstance.notificationCreate(body, target);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Notification**](Notification.md)|  |
 **target** | **String**|  | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

