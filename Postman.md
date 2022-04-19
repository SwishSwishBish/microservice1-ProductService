# Product Service
## Endpoinds
### Save Product
````
POST /api/product HTTP/1.1
Host: localhost:9000
Authorization: Basic base64(username:password)
Content-Type: application/json
Content-Length: 45

{
    "name": "test-1",
    "price": 1.2
}
````
### Get Products
````
GET /api/product HTTP/1.1
Host: localhost:9000
Authorization: Basic base64(username:password)
Content-Type: application/json
Content-Length: 45

{
    "name": "test-1",
    "price": 1.2
}
````
### Delete Product
````
DELETE /api/product/1 HTTP/1.1
Host: localhost:9000
````