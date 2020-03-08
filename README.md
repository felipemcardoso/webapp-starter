[![Build Status](https://travis-ci.org/felipemcardoso/webapp-starter.svg?branch=master)](https://travis-ci.org/felipemcardoso/webapp-starter)

JEE Starter Project

- Project Structure
    - controller: Ports
    - application: Application Service Layer (thin)
        - Command: A single command (Input)
    - domain/model: Domain Logic (Fat)
    - query/model: (Output) - DTOs (Denormalized model)
    - infrastructure: Persistence Implementation, Message Bus, Config, Logging, etc.

- JAX-RS
- Maven Tomcat7 Plugin