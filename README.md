# E-Commerce Microservices

A backend project built with Java and Spring Boot to learn microservices architecture through practical implementation.

## Current Services

### 1. Product Service

The Product Service manages product information and provides REST APIs for product operations.

**Implemented Features**

- Create a new product
- Retrieve all products
- Retrieve a product by ID
- Update product details
- Delete a product
- Request and response DTOs
- Request validation using Jakarta Bean Validation
- Global exception handling
- RESTful API development
- API documentation using OpenAPI and Swagger UI

## Technology Stack

- **Programming Language:** Java 17
- **Framework:** Spring Boot
- **Web Framework:** Spring Web
- **Persistence:** Spring Data JPA
- **ORM:** Hibernate
- **Database:** MySQL
- **Build Tool:** Maven
- **API Documentation:** Springdoc OpenAPI and Swagger UI
- **Version Control:** Git
- **Code Hosting:** GitHub

*Note: Refer to `pom.xml` for the exact Spring Boot and Springdoc OpenAPI versions.*

## Project Structure

```text
product-service/
├── src/
│   ├── main/
│   │   ├── java/com/example/product/
│   │   │   ├── controller/
│   │   │   ├── dto/
│   │   │   ├── entity/
│   │   │   ├── exception/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── ProductApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites

- Java 17
- MySQL
- Maven Wrapper included in the project
- Eclipse IDE or another Java IDE

### Database Configuration

1. Start your MySQL server.
2. Create the database:

```sql
CREATE DATABASE product_db;
```

3. Configure the following environment variables in your Eclipse Run Configuration:

```text
DB_USERNAME=your_mysql_username
DB_PASSWORD=your_mysql_password
```

4. Ensure that `application.properties` reads the credentials through environment variables rather than hardcoded passwords.

### Run the Application

Run `ProductApplication.java` as a Java Application or Spring Boot App from Eclipse.

The application runs on port `8081`, according to the current configuration.

## API Documentation

When Product Service is running, access the following endpoints:

- **Swagger UI:** http://localhost:8081/swagger-ui/index.html
- **OpenAPI JSON:** http://localhost:8081/v3/api-docs

Swagger UI can be used to explore and test the Product Service REST APIs.

## Git Workflow

This project uses Git for version control and GitHub for source code hosting.

- Feature branches for service development
- Meaningful commit messages
- Incremental implementation and testing
- Pull requests for reviewing changes before merging

## Planned Enhancements

The project will be extended incrementally with additional microservices and backend capabilities.

- Inventory Service for stock management
- Order Service for order processing
- REST-based communication between services
- Notification Service
- Apache Kafka for asynchronous messaging
- Docker-based containerization
- Unit and integration testing
- Resilience, logging and monitoring

## Project Status

- **Product Service:** CRUD APIs, DTOs, validation, global exception handling and Swagger documentation implemented.
- **Inventory Service:** Planned.
- **Order Service:** Planned.
- **Notification Service:** Planned.

This project is being developed incrementally to practise Java backend development and microservices architecture.