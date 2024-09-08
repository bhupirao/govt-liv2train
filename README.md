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
- Maven or Gradle
- PostgreSQL database

### Clone the Repository

First, clone the repository to your local machine:

git clone https://github.com/bhupirao/govt-liv2train.git
cd govt-liv2train

Configure Database
Install PostgreSQL and create a database for the application.

Update the application.properties file with your PostgreSQL database credentials:

properties

spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Build and Run the Application
Maven:

mvn clean install
mvn spring-boot:run
Gradle:

./gradlew build
./gradlew bootRun
Access the API
Base URL: http://localhost:8080/api/training-centers
Endpoints
Create a Training Center:

POST /api/training-centers
Request Body: A JSON object representing a training center.
Get All Training Centers:

GET /api/training-centers
Optional query parameters for filtering: centerName, centerCode, city, state.
Exception Handling
The application includes custom exception handling for:

Validation errors
Constraint violations
Resource not found
Data integrity violations
General exceptions
Contribution
Feel free to contribute to this project by submitting issues or pull requests.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
For any questions or issues, please reach out to bhoopsinghyadav26@gmail.com.

