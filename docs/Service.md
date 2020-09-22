# Service

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of a service instance. It must be valued if orderItem action is &#x27;delete&#x27; and corresponds to a AAI service.id | 
**href** | **String** | Reference to the Service (useful for delete or modify command). Not managed in Beijing release. |  [optional]
**name** | **String** | Name of the service - When orderItem action is &#x27;add&#x27; this name will be used in ONAP/SO request as InstaceName. |  [optional]
**serviceState** | **String** | The lifecycle state of the service requested; Not managed in Beijing release. |  [optional]
**_atType** | **String** | To define the service type Not managed in Beijing Release |  [optional]
**_atSchemaLocation** | **String** | The URL to get the resource schema. Not managed in Beijing Release |  [optional]
**serviceCharacteristic** | [**List&lt;ServiceCharacteristic&gt;**](ServiceCharacteristic.md) |  |  [optional]
**serviceRelationship** | [**List&lt;ServiceRelationship&gt;**](ServiceRelationship.md) |  |  [optional]
**relatedParty** | [**List&lt;RelatedParty&gt;**](RelatedParty.md) |  |  [optional]
**serviceSpecification** | [**ServiceSpecificationRef**](ServiceSpecificationRef.md) |  |  [optional]
