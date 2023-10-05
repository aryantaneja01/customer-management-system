# Customer Management System

This Spring Boot application is a Customer Management System integrated with an AWS RDS instance running MySQL. It allows users to manage customer information through RESTful API endpoints. Users can perform CRUD operations on customer records, including adding new customers, retrieving customer information by ID, updating customer details, and deleting customer records.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Database Configuration](#database-configuration)
- [RESTful API Endpoints](#restful-api-endpoints)
- [Usage](#usage)
  
## Prerequisites

Before you begin, ensure you have the following prerequisites:

- Java JDK 8 or higher
- AWS RDS instance running MySQL
- AWS credentials for database access
- Git (optional, for cloning the repository)

## Getting Started

To get started with this application, follow these steps:

Clone the repository (if not already done):

```shell
git clone https://github.com/yourusername/customer-management-system.git
cd customer-management-system

Build the project:

./mvnw clean install

Run the application:

java -jar target/customer-management-system-0.1.jar

The application should now be running on your local environment.

Database Configuration

You need to configure the application to connect to your AWS RDS instance. Modify the application.properties file:

# Database Configuration
spring.datasource.url=jdbc:mysql://your-rds-endpoint:3306/your-database-name
spring.datasource.username=your-database-username
spring.datasource.password=your-database-password

Replace 'your-rds-endpoint', 'your-database-name', 'your-database-username', and 'your-database-password' with your actual AWS RDS database information.

RESTful API Endpoints

The application exposes the following RESTful API endpoints:

'POST /customers' - Add a new customer with details (customer ID, name, age, gender, address).
'GET /customers/{customerId}' - Retrieve customer information by customer ID.
'PUT /customers/{customerId}' - Update customer details by customer ID.
'DELETE /customers/{customerId}' - Delete a customer record by customer ID.

Usage

Use a tool like Postman or any API client to interact with the API endpoints mentioned above.
