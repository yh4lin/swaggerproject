# CreateServiceOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalId** | **String** | ID given by the consumer and only understandable by him (to facilitate his searches) |  [optional]
**priority** | **String** | A way that can be used by consumers to prioritize orders in Service Order Management system (from 0 to 4 : 0 is the highest priority, and 4 the lowest) |  [optional]
**description** | **String** | A free-text description of the service order |  [optional]
**category** | **String** | Used to categorize the order that can be useful for the OM system (e.g. “broadband”, “TVOption”, ...) |  [optional]
**requestedStartDate** | [**OffsetDateTime**](OffsetDateTime.md) | Order start date wished by the requestor |  [optional]
**requestedCompletionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Requested delivery date from the requestor perspective |  [optional]
**relatedParty** | [**List&lt;RelatedParty&gt;**](RelatedParty.md) |  |  [optional]
**orderRelationship** | [**List&lt;OrderRelationship&gt;**](OrderRelationship.md) |  |  [optional]
**orderItem** | [**List&lt;CreateServiceOrderItem&gt;**](CreateServiceOrderItem.md) |  |  [optional]
