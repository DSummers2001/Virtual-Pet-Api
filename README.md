[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/NIN_if7E)
# Virtual Pets API 

In this assignment, we will build out an REST API for some virtual pet data. 

This could become the foundation if we were to build out the virtual pet app further for more users and potentially a GUI. 

## Required Tasks 

Link to the Assignment: https://wecancodeit.instructure.com/courses/181/assignments/2182

You are creating a Virtual Pet API, it’s advised that you don’t build on top of the Virtual Pet Amok assignment. Instead, create a new project using the Spring Initializer

You DO NOT have to code functionality that deals with all or individual pets ex. feedAllPets(), tick(), etc. We are just building out an API for this assignment.

No game play interface is required for this assignment.

## Instructions
1. Create a project using the Spring Initializer 
2. With JPA, Web, and H2 as the dependencies 
3. Create an entity “Virtual Pet” 
4. Add 4-5 fields that were used to describe the pet in the previous assignments (name, description, hunger, thirst, boredom, etc) 
5. Create a repository for Virtual Pet 
6. Create a controller for for Virtual Pet 
7. In the controller create a method to retrieve all pets 
8. In the controller create a method to retrieve a single pet by ID 
9. In the controller create a method to post (add) a new pet to the database - In the controller create a method to delete a pet with the ID 
10. Create a LoadDatabase class that will auto load 4-5 mock virtual pet data into the database 
11. Create an error handling message when a pet requested by ID is not found
12. Using Javascript, create an app that will demonstrate the following features of the API and outputs the results in the console (console.log()) using fetch()
13. Retrieve all pets in the database 
14. Retrieve a single pet by ID 
15. Add a new pet and retrieve that pet 
16. Delete a pet and check that the pet is no longer present by getting the error handling message

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.1/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.1/gradle-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#using.devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
