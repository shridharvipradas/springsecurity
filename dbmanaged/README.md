# Banking Application

This is a simple banking application built with **Spring Boot** and **Spring Security**. It demonstrates user authentication and authorization using roles (`USER` and `ADMIN`) and manages user accounts stored in an **H2 in-memory database**.

## Features

- User authentication and role-based authorization.
- User accounts management.
- H2 in-memory database for data storage.
- RESTful API for account operations.
- Web-based login interface.

## Prerequisites

- Java 17 or higher
- Maven

## Access the Application
1. Open your web browser and go to http://localhost:8080/h2-console to access the H2 database console.

- Database Name: testdb
- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: password

2. Use the following credentials to log in:

- User: user1
- Password: userpass
- Admin: admin1
- Password: adminpass

## API Endpoints
- Login Page: GET /login
- View Account: GET /account/{accountId}
- Replace {accountId} with the actual account ID to retrieve the account details.

## Database Initialization
The application initializes with a default user and an account using the data.sql file.

- Users:
    - user1 with password `userpass` (role: USER)
    - admin1 with password `adminpass` (role: ADMIN)
- Accounts:
    - An account for user1 with a balance of 1000.00.

## Technologies Used
- Spring Boot 3.3.4
- Spring Security
- H2 Database
- Spring Data JPA
- Maven
