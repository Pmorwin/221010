# Spring
- Java Framework for making web applications
- Immensely popular espically in enterprise level applications due to its scalability
    - EJB: Entity Java Beans which was a proprietary Java Framework from Oracle, it functioned similar to Spring
    - Spring came out and it was free and just better then EJB, so no one really uses EJB

## IoC Container and Beans
- Inversion of Control Container
    - Inversion of Crontrol is giving up "your ability to control things to gain ease of use"
    - Moto of Spring: "Convention over configurability" 
    - **Application Context**
        - The Application context is the "Brain" of our application and holds all of our beans
        - This is where you register beans
        - This will also control those beans
            - How they are created
            - How they are used
- **Beans** (Specifically Spring Beans)
    - Any object that is controlled by the Application Context

## The Problem
- Large applications have way too many components and moving parts
    - Classes and objects that rely on each other
    - Lots of configuration deatils that are updated and chaged as the application is developed
- Most developers in large applications dont know the full extent of what the code can do or is doing
    - You work on your little slice
    - Its very rare for a single developer to write an entire backend for an enterprise application

## The Solution via Spring
- Spring will promote a level of abstraction with beans that will make writing individual peices of code and their functionality much easier
    - *Loose Coupling*
        Architecture where classes are not hard codeded to each other
- Beans can be 100% mangaed by the IoC container and is a one stop shop for your configuration

## Spring Boot
- ***Spring Boot IS NOT SPRING***
- Spring Boot is a VERY OPIONATED environement of spring
    - It will handle a lot of the low level configuration and boilerplate for you automatically
- Spring Boot is NOT a module of Spring
    - We **USE** Spring boot initializer but that does not make it spring or a spring module
- **application.properties**
    - The main file for configuration in a Spring Boot App
        - Database connection options
        - Logging options 
        - Debug configuration
        - Port to run on

## Modules of Spring
- Spring is expandable and customizable by design
- There are ton of modules that provide very specific functionality
- **Spring Data**
    - This is for your data layer of an application
    - Allows you to very easily map Entites to Tables
    - Create DAOS(Spring calls them Repos) that interact with those tables
- **Spring Web**
    - This is for the API layers of our application
    - This is an abstracted version of Javalin
    - Handle HTTP requests and make HTTP responses
    - JSON serialization, exception handling, and error code throwing
- **Spring Actuator**
    - Adds a lot of dev-friendly routes to your application
    - See configuration info while your app is running
    - Monitor important mertrics
    - Shut it down with a specific path
    - Something only for development, it should be disabled when going production

## Spring AOP
- Asepct Oriented Programming
    - Another Paradigm of programming
- **CCC**
    - Cross Cutting Coerns
    - Features of an application that cannot be addressed by a single layer
        - Secturity, logging
- **Aspects**
    - A class that can execute **Advice** methods throughout an application
    - Advice executes based on a **PointCut** expression


