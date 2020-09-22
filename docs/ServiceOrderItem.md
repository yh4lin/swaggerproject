# ServiceOrderItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the line item (generally it is a sequence number 01, 02, 03, …) | 
**action** | [**ActionType**](ActionType.md) |  |  [optional]
**state** | [**StateType**](StateType.md) |  |  [optional]
**percentProgress** | **String** | Progress of the delivery in percentage. |  [optional]
**_atType** | **String** | Used to extend the order item. not used in Beijing relase |  [optional]
**_atSchemaLocation** | **String** | not used in Beijing relase |  [optional]
**_atBaseType** | **String** | not used in Beijing relase |  [optional]
**orderItemRelationship** | [**List&lt;OrderItemRelationship&gt;**](OrderItemRelationship.md) |  |  [optional]
**service** | [**Service**](Service.md) |  | 
**orderItemMessage** | [**List&lt;OrderMessage&gt;**](OrderMessage.md) |  |  [optional]
