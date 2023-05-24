## System diagram
![alt text](https://user-images.githubusercontent.com/134405503/240320992-97258705-04f7-452c-ac94-8a428aba329c.png)

## Overview
I have created this simple project to apply my knowledge of microservices patterns and tools. This demo project is a 
simplified ecommerce system that enables merchant to view and order products. 

The main flow is that after a merchant completes the registration process successfully, he will be able to list the 
available products, using which he can create orders. Also, some reporting endpoints are available to provide details
about products and orders.

## Account management service
The account management service is used for merchant registration, account confirmation, and authentication. 

### APIs
POST /api/account
PUT  /api/account/confirm
POST /api/account/authenticate

### User stories
* As a merchant, I want to register using my email address, so that I can log in and use the system.
* As a merchant, I want to receive an OTP on the same registration email, so than I can verify my account.

## Product service:
This service is responsible for managing products. For simplicity, adding/updating products is not implemented and the 
product service datastore comes with pre-populated samples.

### APIs
* GET   /api/product/{productCode}
* GET   /api/product?pageNumber={num}&size={size}
* PATCH /api/product/order
* PATCH /api/product/return

### User stories
* As a merchant, I need to list all available products in pages, so that I can order any of them.

## Order service:
This service is for creating orders/returns of one or multiple products. An order initially has an IN_PROGRESS status,
meaning that it's not confirmed yet. An endpoint exists for inquiring the final status (SUCCEEDED, or FAILED). 

### APIs
POST /api/order
GET  /api/order/{orderNumber}
POST /api/order/{orderNumber}/return
GET  /api/order?from={fromDate}&to={toDate}

### User stories
* As a merchant, I want to create orders of one or more products, so that I sell them to my customers.
* As a merchant, I want to be able to inquire about the status of an order, so that I can check its status.
* As a merchant, I want to receive an email whenever my order status changes, so that I Keep track of the order.
* As a merchant, I want to display full details of my orders, along with the products details within a specific period, 
so that I use them for reports
* As a merchant, I want to create return orders of one or more products, so that I can return one or multiple products 
that I have previously ordered.

## Samples:
Sample requests are available in this postman collection: 