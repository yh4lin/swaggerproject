# swagger-java-client

API ServiceOrder
- API version: 4.0.1
  - Build date: 2020-09-22T18:40:19.698152-04:00[America/Toronto]

Request the instantiation of a service  A Service Order is a type of order which can be used to describe a group of operations on service – one service order item per service. An action at the level of the service order item describe the operation to be done on a service (add, terminate for example). The service order is triggered from the BSS system in charge of the product order management to ONAP that will manage the service fulfillment.  List of available subscription for serviceOrdering notifications, see /hub resources for more information:  - ServiceOrderCreationNotification - ServiceOrderStateChangeNotification - ServiceOrderItemStateChangeNotification  


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.NotificationApi;

import java.io.File;
import java.util.*;

public class NotificationApiExample {

    public static void main(String[] args) {
        
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080/nbi/api/v4*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*NotificationApi* | [**notificationCreate**](docs/NotificationApi.md#notificationCreate) | **POST** /notification | NBI will send notification to this operation provided by subscribers
*ServiceOrderApi* | [**serviceOrderCreate**](docs/ServiceOrderApi.md#serviceOrderCreate) | **POST** /serviceOrder | Create a service order
*ServiceOrderApi* | [**serviceOrderFind**](docs/ServiceOrderApi.md#serviceOrderFind) | **GET** /serviceOrder | List service orders
*ServiceOrderApi* | [**serviceOrderGet**](docs/ServiceOrderApi.md#serviceOrderGet) | **GET** /serviceOrder/{id} | Retrieve a service order

## Documentation for Models

 - [ActionType](docs/ActionType.md)
 - [CreateServiceOrder](docs/CreateServiceOrder.md)
 - [CreateServiceOrderItem](docs/CreateServiceOrderItem.md)
 - [Error](docs/Error.md)
 - [EventType](docs/EventType.md)
 - [Notification](docs/Notification.md)
 - [OrderItemRelationship](docs/OrderItemRelationship.md)
 - [OrderMessage](docs/OrderMessage.md)
 - [OrderRelationship](docs/OrderRelationship.md)
 - [RelatedParty](docs/RelatedParty.md)
 - [RelationshipType](docs/RelationshipType.md)
 - [Service](docs/Service.md)
 - [ServiceCharacteristic](docs/ServiceCharacteristic.md)
 - [ServiceOrder](docs/ServiceOrder.md)
 - [ServiceOrderItem](docs/ServiceOrderItem.md)
 - [ServiceOrderItemSummary](docs/ServiceOrderItemSummary.md)
 - [ServiceOrderSummary](docs/ServiceOrderSummary.md)
 - [ServiceOrderSummaryWithItem](docs/ServiceOrderSummaryWithItem.md)
 - [ServiceRef](docs/ServiceRef.md)
 - [ServiceRelationship](docs/ServiceRelationship.md)
 - [ServiceSpecificationRef](docs/ServiceSpecificationRef.md)
 - [SeverityMessage](docs/SeverityMessage.md)
 - [StateType](docs/StateType.md)
 - [TargetServiceSchema](docs/TargetServiceSchema.md)
 - [Value](docs/Value.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


