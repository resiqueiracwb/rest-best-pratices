# rest-best-pratices
Best pratices for developmnet rest api
Define operations in terms of HTTP methods
The HTTP protocol defines a number of methods that assign semantic meaning to a request. The common HTTP methods used by most RESTful web APIs are:

#GET 
retrieves a representation of the resource at the specified URI. The body of the response message contains the details of the requested resource.
# POST 
creates a new resource at the specified URI. The body of the request message provides the details of the new resource. Note that POST can also be used to trigger operations that don't actually create resources.
# PUT 
either creates or replaces the resource at the specified URI. The body of the request message specifies the resource to be created or updated.
# PATCH 
performs a partial update of a resource. The request body specifies the set of changes to apply to the resource.
# DELETE 
removes the resource at the specified URI.