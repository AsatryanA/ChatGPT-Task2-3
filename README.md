# Movie Database API

Welcome to the Movie Database API! This API allows users to perform CRUD operations on movies, actors, and directors. It is built with Spring Boot, Hibernate, and MongoDB as the non-relational database. Users can also search for movies by title or release date.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Usage](#usage)
    - [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgments](#acknowledgments)

## Technologies Used

- **Spring Boot:** Main framework for building the application.
- **Spring Data MongoDB:** Simplifies the data access code and allows for integration with MongoDB.
- **MongoDB:** A NoSQL database used to store movie-related information.
- **Lombok:** Reduces boilerplate code in entities.
- **JUnit:** Testing framework for unit and integration tests.

## Project Structure

```plaintext
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.example.moviedb/
│   │   │       ├── controller/
│   │   │       │   └── MovieController.java
│   │   │       ├── model/
│   │   │       │   ├── Actor.java
│   │   │       │   ├── Director.java
│   │   │       │   └── Movie.java
│   │   │       ├── repository/
│   │   │       │   ├── ActorRepository.java
│   │   │       │   ├── DirectorRepository.java
│   │   │       │   └── MovieRepository.java
│   │   │       ├── service/
│   │   │       │   ├── MovieService.java
│   │   │       │   └── MovieServiceImpl.java
│   │   │       └── MovieDatabaseApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       ├── java/
│       │   └── com.example.moviedb/
│       │       ├── MovieControllerTest.java
│       │       ├── MovieRepositoryTest.java
│       │       └── MovieServiceTest.java
│       └── resources/
│           └── application-test.properties
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites

- Java 17
- Maven
- MongoDB

### Installation

1. Clone the repository.
    
    ```bash
    git clone https://github.com/AsatryanA/ChatGPT-Task2-3
    ``` 
2. Create a MongoDB database named `moviedb`.
3. Run the application with `mvn spring-boot:run`.
4. The application will be running on `localhost:8080`.

## Usage

### API Endpoints

- **GET /movies** - Returns a list of all movies.
- **GET /movies/{id}** - Returns a movie with the specified ID.
- **GET /movies/search** - Returns a list of movies that match the search criteria.
- **POST /movies** - Creates a new movie.
- **PUT /movies/{id}** - Updates a movie with the specified ID.
- **DELETE /movies/{id}** - Deletes a movie with the specified ID.
- **GET /actors** - Returns a list of all actors.
- **GET /actors/{id}** - Returns an actor with the specified ID.

## Testing

Run `mvn test` to run the unit and integration tests.

## Contributing

Contributions are welcome! Feel free to submit a pull request.

## License

Distributed under the MIT License. See `LICENSE` for more information.

