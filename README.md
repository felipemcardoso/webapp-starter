JEE Starter Project

- Project Structure
    - controller: Ports
    - application: Application Service Layer (thin)
        - Command: (Input)
    - domain/model: Domain Logic (Fat)
    - query/model: (Output) - DTOs (Desnomalized model)
    - infrastructure: Persistence Implementation, Message Bus, Config, Logging, etc.

- JAX-RS
- Maven Tomcat7 Plugin