E-Commerce Microservices

A backend project built with Java and Spring Boot to learn microservices architecture through practical implementation.

Current Services

Product Service

Implemented features:

Create, retrieve, update and delete products

RESTful APIs using Spring Web

Layered architecture: Controller, Service and Repository

Spring Data JPA and Hibernate

MySQL database integration

Request and response DTOs

Request validation

Global exception handling

OpenAPI documentation and Swagger UI

Technology Stack

Java 17

Spring Boot (version specified in pom.xml)

Spring Web

Spring Data JPA

Hibernate ORM

MySQL

Maven

Springdoc OpenAPI / Swagger UI

Git and GitHub

Run Product Service

Install Java 17 and MySQL.

Create a MySQL database named product_db.

Configure DB_USERNAME and DB_PASSWORD as environment variables.

Run the Spring Boot application.

API Documentation

When the application is running on port 8081:

Swagger UI: http://localhost:8081/swagger-ui/index.html

OpenAPI JSON: http://localhost:8081/v3/api-docs

Planned Enhancements

Inventory Service

Order Service

Notification Service

Inter-service REST communication

Messaging with Kafka

Docker and automated testing

Project Status

Product Service implemented and pushed to GitHub. Additional services will be added incrementally.