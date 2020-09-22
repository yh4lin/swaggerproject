# ServiceOrderSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID created on repository side | 
**href** | **String** | Hyperlink to access the order |  [optional]
**externalId** | **String** | ID given by the consumer and only understandable by him (to facilitate his searches) |  [optional]
**state** | [**StateType**](StateType.md) |  |  [optional]
**orderDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**completionDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the order was completed |  [optional]
