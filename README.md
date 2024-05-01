# API Testing Project with REST ASSURED

## Overview
This project demonstrates API testing using REST Assured and SOAPUI libraries, following the Behavior-Driven Development (BDD) approach. It includes test cases that interact with multiple APIs, including an open-source API, a custom API developed for this project (handling customer, product, and order data), and a SOAP API.

## Features
- Utilizes REST Assured and SOAPUI libraries for API testing.
- Adopts the BDD approach with Given-When-Then structure in test cases.
- Tests interactions with multiple APIs, including open-source, custom, and SOAP APIs.
- Validates response status codes, response bodies, and other criteria specified in test scenarios.

## Prerequisites
- JDK (Java Development Kit) installed.
- Maven installed (for dependency management and build).
- SOAPUI installed (for SOAP API testing).

## Setup Instructions
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Build the project using Maven:
   ```
   mvn clean install
   ```
4. Run the tests:
   ```
   mvn test
   ```


## Test Structure
The project follows a modular structure with test cases organized in packages based on API endpoints or functionality. Each test case is written using the BDD approach with Given-When-Then steps to describe the scenario being tested.


## APIs Tested
1. **Open Source Demo API - reqres.in**:
   - Description: A widely used open-source API for testing and prototyping RESTful APIs.
   - Usage: Utilized for testing CRUD operations, authentication, and other scenarios using predefined endpoints and responses.

2. **Custom Customer-Product-Order API**:
   - Description: A custom RESTful API developed for managing customer, product, and order data.
   - Functionality: Supports endpoints for CRUD operations on customers, products, and orders.
   - Schema: The API follows a specific JSON schema for data validation and structure, ensuring consistency and integrity.

3. **Calculator API**:
   - Description: A SOAP-based web service for performing arithmetic operations.
   - Usage: Automated SOAP requests and responses using REST Assured and tested various arithmetic operations.


## Contributing
Contributions are welcome! If you find any bugs or have suggestions for improvement, please open an issue or submit a pull request.
