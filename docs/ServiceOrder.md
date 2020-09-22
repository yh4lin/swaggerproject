# ServiceOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID created on repository side | 
**href** | **String** | Hyperlink to access the order |  [optional]
**externalId** | **String** | ID given by the consumer and only understandable by him (to facilitate his searches) |  [optional]
**priority** | **String** | A way that can be used by consumers to prioritize orders in Service Order Management system (from 0 to 4 : 0 is the highest priority, and 4 the lowest) |  [optional]
**description** | **String** | A free-text description of the service order |  [optional]
**category** | **String** | Used to categorize the order that can be useful for the OM system (e.g. “broadband”, “TVOption”, ...) |  [optional]
**state** | [**StateType**](StateType.md) |  |  [optional]
**orderDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**completionDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the order was completed |  [optional]
**requestedStartDate** | [**OffsetDateTime**](OffsetDateTime.md) | Order start date wished by the requestor |  [optional]
**requestedCompletionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Requested delivery date from the requestor perspective |  [optional]
**expectedCompletionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the order was started for processing |  [optional]
**_atBaseType** | **String** |  |  [optional]
**_atType** | **String** |  |  [optional]
**_atSchemaLocation** | **String** |  |  [optional]
**relatedParty** | [**List&lt;RelatedParty&gt;**](RelatedParty.md) |  |  [optional]
**orderRelationship** | [**List&lt;OrderRelationship&gt;**](OrderRelationship.md) |  |  [optional]
**orderItem** | [**List&lt;ServiceOrderItem&gt;**](ServiceOrderItem.md) |  |  [optional]
**orderMessage** | [**List&lt;OrderMessage&gt;**](OrderMessage.md) |  |  [optional]
