# Housing Data Platform

A full-stack application for managing and visualizing housing data.

## Project Structure

- `backend/`: Spring Boot application (Java)
- `frontend/`: Angular application (TypeScript)

## Prerequisites

- Java 17 or later
- Node.js 16+ and npm
- MySQL 8.0+
- Maven 3.6+

## Getting Started

### Backend Setup

1. Navigate to the backend directory:
   ```bash
   cd backend
   ```

2. Configure your database settings in `src/main/resources/application-dev.properties`

3. Build and run the application:
   ```bash
   mvn spring-boot:run -Dspring-boot.run.profiles=dev
   ```

### Frontend Setup

1. Navigate to the frontend directory:
   ```bash
   cd frontend
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Start the development server:
   ```bash
   ng serve
   ```

## Features

- View housing data in a tabular format
- Filter and sort housing data
- Responsive design for all devices

## API Documentation

The API documentation will be available at `http://localhost:8080/api/swagger-ui.html` when the backend is running.
