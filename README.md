# Smart Library System (Spring Boot Prototype)

## Overview
This is a layered, service-based prototype for a Smart Library System built using Spring Boot. It demonstrates clean separation of concerns across Presentation, Business, and Data Access layers. The system supports user registration, book addition, and borrowing operations using in-memory storage.

## How to Run

1. Clone the repository or unzip the assignment folder.
2. Open the project in IntelliJ IDEA or any Java IDE.
3. Run the main class:
LibraryApplication.java
4. Or use Maven:
mvn spring-boot:run


## REST Endpoints

### User Operations
- `POST /users/register?name=John`  
  Registers a new user with the given name.

- `GET /users`  
  Returns a list of all registered users.

### Book Operations
- `POST /books/add?title=Clean Code`  
  Adds a new book with the given title.

- `POST /books/borrow?bookId=1`  
  Marks the book with the given ID as borrowed.

- `GET /books`  
  Returns a list of all books and their status.

## Notes
- All data is stored in-memory using HashMap and List.
- No external database or configuration is required.
- Designed for demonstration purposes only.

## Technologies Used
- Java 23
- Spring Boot 3.5.6
- Maven

## Project Structure
```
src/
|-- controller/
|   |-- UserController.java
|   |-- BookController.java
|   |-- UserControllerImpl.java
|   |-- BookControllerImpl.java
|-- service/
|   |-- UserService.java
|   |-- BookService.java
|   |-- UserServiceImpl.java
|   |-- BookServiceImpl.java
|-- repository/
|   |-- UserRepository.java
|   |-- BookRepository.java
|-- model/
|   |-- User.java
|   |-- Book.java
|-- LibraryApplication.java
```



## Author & Submission
- Student: Sultan Sakyp
- Course: Software Architecture, KBTU Fall 2025
- Submission: October 26, 2025
