# Training Center Management

## Overview

A Spring Boot application for managing government-funded training centers. This application provides functionalities for creating, retrieving, and filtering training center records. It uses JPA for database interactions, handles timestamps in IST, and includes comprehensive exception handling.

## Features

- CRUD operations for training centers
- Filtering and searching by center name, center code, city, and state
- Automatic timestamp handling in IST
- Custom exception handling

## Repository

You can find the repository [here](https://github.com/bhupirao/govt-liv2train.git).

## Setup Instructions

### Prerequisites

- Java 17 or higher
- Maven
- Spring Boot
- MySQL database
# Access the API
Base URL: http://localhost:8080/api/training-centers

# Endpoints
Create a Training Center:

# POST /api/training-centers/addCenter
Request Body: A JSON object representing a training center.
Get All Training Centers:

# GET /api/training-centers/search
Optional query parameters for filtering: centerName, centerCode, city, state.

### Clone the Repository

First, clone the repository to your local machine:

git clone https://github.com/bhupirao/govt-liv2train.git
cd govt-liv2train

Configure Database
Install MySQL and create a database for the application.

Update the application.properties file with your MySQL database credentials:

properties

# MySQL properties
spring.datasource.url=jdbc:mysql://localhost:3306/liv2train_db
spring.datasource.username=root
spring.datasource.password=Root@0000
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

Build and Run the Application
mvn clean install
mvn spring-boot:run



# Exception Handling
The application includes custom exception handling for:

- Validation errors
- Constraint violations
- Resource not found
- Data integrity violations
- General exceptions
  
# Contact
For any questions or issues, please reach out to bhoopsinghyadav26@gmail.com.

# License
This project is licensed under the MIT License - see the LICENSE file for details.



