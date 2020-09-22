# OrderRelationship

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of related order, can be : “dependency” if the order needs to be “not started” until another order item is complete (a service order in this case) or “cross-ref” to keep track of the source order (a productOrder) |  [optional]
**id** | **String** | The id of the related order | 
**href** | **String** | A hyperlink to the related order |  [optional]
**_atReferredType** | **String** | Type of the referred order. |  [optional]
