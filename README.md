# rest-best-pratices
Best pratices for developmnet rest api
Define operations in terms of HTTP methods
The HTTP protocol defines a number of methods that assign semantic meaning to a request. The common HTTP methods used by most RESTful web APIs are:

## GET 
retrieves a representation of the resource at the specified URI. The body of the response message contains the details of the requested resource.
## POST 
creates a new resource at the specified URI. The body of the request message provides the details of the new resource. Note that POST can also be used to trigger operations that don't actually create resources.
 request creates a resource. The server assigns a URI for the new resource, and returns that URI to the client. In the REST model, you frequently apply POST requests to collections. The new resource is added to the collection. A POST request can also be used to submit data for processing to an existing resource, without any new resource being created.

## PUT 
either creates or replaces the resource at the specified URI. The body of the request message specifies the resource to be created or updated.
request creates a resource or updates an existing resource. The client specifies the URI for the resource. The request body contains a complete representation of the resource. If a resource with this URI already exists, it is replaced. Otherwise a new resource is created, if the server supports doing so. PUT requests are most frequently applied to resources that are individual items, such as a specific customer, rather than collections. A server might support updates but not creation via PUT. Whether to support creation via PUT depends on whether the client can meaningfully assign a URI to a resource before it exists. If not, then use POST to create resources and PUT or PATCH to update.


## PATCH 
performs a partial update of a resource. The request body specifies the set of changes to apply to the resource.
request performs a partial update to an existing resource. The client specifies the URI for the resource. The request body specifies a set of changes to apply to the resource. This can be more efficient than using PUT, because the client only sends the changes, not the entire representation of the resource. Technically PATCH can also create a new resource (by specifying a set of updates to a "null" resource), if the server supports this.

## DELETE 
removes the resource at the specified URI.
 requests must be idempotent. If a client submits the same PUT request multiple times, the results should always be the same (the same resource will be modified with the same values). POST and PATCH requests are not guaranteed to be idempotent.


#Exemples:
```bash
 /customers

    GET  --  Retrieve all customers
    POST --  Create a new customer
    PUT ---  Bulk update of customers
    DELETE - Remove all customers
```
```bash
/customers/1
    
    GET  --  Retrieve the details for customer 1
    POST --  Error
    PUT ---  Update the details of customer 1 if it exists
    DELETE - Remove customer 1
```
```bash
/customers/1/orders
    
    GET  --  Retrieve all orders for customer 1
    POST --  Create a new order for customer 1
    PUT ---  Bulk update of orders for customer 1
    DELETE - Remove all orders for customer 1
```
