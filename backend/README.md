# Housing Data Viewer

A Spring Boot application that displays housing data from a MySQL database.

## Prerequisites

- Java 11 or later
- Maven
- MySQL Server
- MySQL Workbench (or any MySQL client)

## Setup

1. **Create a MySQL database**:
   ```sql
   CREATE DATABASE housing_db;
   ```

2. **Update database credentials** in `src/main/resources/application.properties` if needed:
   ```properties
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. **Build the application**:
   ```bash
   mvn clean install
   ```

4. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

## Accessing the Data

- **API Endpoint**: `http://localhost:8081/api/housing`
- **Database**: The application will automatically create the `housings` table and populate it with sample data on first run.

## Viewing Data in MySQL Workbench

1. Open MySQL Workbench
2. Connect to your local MySQL server
3. In the Navigator panel, expand the `housing_db` database
4. You should see the `housings` table with the sample data

## API Response Example

```json
[
  {
    "id": 1,
    "address": "123 Main St, Anytown, USA",
    "type": "House",
    "squareFeet": 2500,
    "bedrooms": 3,
    "bathrooms": 2.5,
    "price": 350000.0
  },
  ...
]
```
