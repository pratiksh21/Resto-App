# <h1 align = "center"> Restaurant Application API </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-brightgreen.svg" />
</a>
    <img alt = "GPL v3" src="https://img.shields.io/badge/License-GPLv3-blue.svg" />
    </a>
</p>


---

<p align="left">

## Overview

The Restaurant Management Application is a Spring Boot-based web application designed to help manage restaurant information. It allows users to perform various operations related to restaurant management, including adding new restaurants, updating specialties, and deleting restaurants from the system.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

## Data Flow

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

1. **Get All Restaurants:** `GET /restaurants`
   
   This endpoint retrieves a list of all registered restaurants.

   ```java
   @GetMapping("restaurants")
   public List<Restaurant> getRestaurants() {
       
   }
   ```

2. **Get Restaurant by ID:** `GET /restaurant/{id}`

   This endpoint retrieves detailed information about a specific restaurant by its ID.

   ```java
   @GetMapping("restaurant/{id}")
   public Restaurant getRestaurant(@PathVariable Integer id) {
      
   }
   ```

3. **Add Restaurant:** `POST /restaurant`

   This endpoint adds a new restaurant to the system.

   ```java
   @PostMapping("restaurant")
   public String addRestaurant(@Valid @RequestBody Restaurant restaurant) {
    
   }
   ```

4. **Add Restaurants:** `POST /restaurants`

   This endpoint adds multiple restaurants to the system.

   ```java
   @PostMapping("restaurants")
   public String addRestaurants(@Valid @RequestBody List<Restaurant> restaurants) {
       
   }
   ```

5. **Update Restaurant Specialty:** `PUT /restaurant/id/{id}/specialty/{specialty}`

   This endpoint updates the specialty of a restaurant by its ID.

   ```java
   @PutMapping("restaurant/id/{id}/specialty/{updatedSpeciality}")
   public String updateSpecialty(@PathVariable Integer id, @RequestParam String updadteSpecial) {
       
   }
   ```

6. **Delete Restaurant:** `DELETE /restaurant/{id}`

   This endpoint deletes a restaurant by its ID.

   ```java
   @DeleteMapping("restaurant/{id}")
   public String deleteRestaurant(@PathVariable Integer id) {
       
   }
   ```

### Services

The Services layer implements the core business logic, data processing, and interaction with the data repository. Key responsibilities include:

- Validating input data.
- Performing CRUD operations on restaurant data.
- Handling data transformations and interactions with external systems (if applicable).

### Repository

The Repository layer manages data access to the underlying database. It handles database operations such as Create, Read, Update, and Delete (CRUD) for restaurant data. Additionally, it may include data mapping and conversion between Java objects and database entities.

## Database Design

The project's database design includes tables for restaurant management, with fields such as:

### Restaurant Table

| Column Name    | Data Type      | Description                        |
| -------------- | -------------- | ---------------------------------- |
| restaurantId   | INT            | Unique identifier for each restaurant |
| restaurantName | VARCHAR(255)   | Restaurant's name                   |
| restaurantAddress | VARCHAR(255) | Restaurant's address                |
| restaurantContact | VARCHAR(12)  | Restaurant's contact number (e.g., 911234567890) |
| restaurantEmail | VARCHAR(255)  | Restaurant's email address          |
| restaurantSpecialty | VARCHAR(255) | Restaurant's specialty              |
| numberOfStaff  | INT            | Number of staff members             |
| restaurantType | ENUM           | Restaurant type (e.g., FAMILY, CAFE, FAST_FOOD) |
| created_at     | TIMESTAMP      | Timestamp of record creation        |
| updated_at     | TIMESTAMP      | Timestamp of record modification    |

The "Restaurant" table stores restaurant-related information, including restaurant IDs, names, addresses, contact information, specialties, staff counts, types, and timestamps for record creation and modification.

This database design ensures data integrity and provides a structured approach to managing restaurant information within the application.

## Data Structures Used

The project utilizes the following data structures:

### Restaurant Class

The `Restaurant` class defines the structure for restaurant data and includes the following fields:

- `restaurantId` (Restaurant ID): An integer that serves as a unique identifier for each restaurant.
- `restaurantName` (Restaurant Name): A string representing the restaurant's name.
- `restaurantAddress` (Restaurant Address): A string containing the restaurant's address.
- `restaurantContact` (Restaurant Contact): A string representing the restaurant's contact number (e.g., 911234567890).
- `restaurantEmail` (Restaurant Email): A string containing the restaurant's email address.
- `restaurantSpecialty` (Restaurant Specialty): A string representing the restaurant's specialty.
- `numberOfStaff` (Number of Staff): An integer indicating the number of staff members.
- `restaurantType` (Restaurant Type): An enumeration specifying the restaurant type (e.g., FAMILY, CAFE, FAST_FOOD).

### Type Enum

The `Type` enum enumerates the possible restaurant types:

- `FAMILY`: Represents a family restaurant.
- `CAFE`: Represents a cafe.
- `FAST_FOOD`: Represents a fast-food restaurant.
- ...

### ArrayList

The project

 utilizes the `ArrayList` data structure to store and manage lists of `Restaurant` objects in various parts of the application. `ArrayList` provides dynamic sizing and efficient element retrieval, making it suitable for storing restaurant records and performing operations on them.

These data structures enable the application to organize and manipulate restaurant data efficiently while maintaining data integrity.

## Project Summary

The Restaurant Management Application is a robust Spring Boot application designed for efficient restaurant data management. It offers a set of RESTful API endpoints for various restaurant-related operations, including adding, retrieving, updating, and deleting restaurant information.

Key Features:

- RESTful API endpoints for restaurant management.
- Data validation to ensure data integrity.
- Clean code separation with a layered architecture (Controller, Services, Repository).
- Robust error handling for improved reliability.
- Java-based backend and Maven for build management.

The Restaurant Management Application serves as a practical example of Spring Boot application development, demonstrating best practices in API design and restaurant data management. It offers a solid foundation for building and extending restaurant management systems in various applications.

<!-- License -->
## License
This project is licensed under the [GNU General Public License v3.0](LICENSE).

<!-- Acknowledgments -->
## Acknowledgments
Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

<!-- Contact -->
## Contact
For questions or feedback, please contact [Amit Ashok Swain](mailto:business.amitswain@gmail.com).



