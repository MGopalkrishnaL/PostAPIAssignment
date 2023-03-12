# PostAPIAssignment
### Requirements
* IntelliJIDEA
* ServerPort: 8080 (use: localhost:8080)
* Java version: 17
* Everything is present in the pom.xml (no need to download any library)
* terminus
* EC2 
### Steps to run the Project
* Click on the Swagger URL which is pasted below and perform the operations
```
http://52.66.244.168:8081/swagger-ui/index.html#/
```
# Dependencies
## Validation
* Bean Validation with Hibernate validator.
## H2 Database
* Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.
## Spring Web
* Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
## Spring Boot DevTools
* Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
## Spring Data JPA
* Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
## Lombok
* Java annotation library which helps to reduce boilerplate code.
## JSON
* JSON is a lightweight, language-independent, data interchange format. See http://www.JSON.org/ The files in this package implement JSON encoders/decoders in Java. It also includes the capability to convert between JSON and XML, HTTP headers, Cookies, and CDL. This is a reference implementation.
## MySQL
* MySQL JDBC driver.
## Swagger
* It provide the UserInterface for all our API's. 
# Project Structure(MVC Structure)
## Model
*PostModel
## Controller
* PostController
## DAO
* PostRepository
## Service
* PostService
# EndPoints
## Post
* Create-post
* getall
# Working
* In this project we mainly focus on the deployment of project in the EC2 which is provided by the AWS(Amazon web services).
* In this project we deployed the project with the help of the terminus.
