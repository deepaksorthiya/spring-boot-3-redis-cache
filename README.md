[![Java Maven Build Test](https://github.com/deepaksorthiya/spring-boot-3-redis-cache/actions/workflows/maven-build.yml/badge.svg)](https://github.com/deepaksorthiya/spring-boot-3-redis-cache/actions/workflows/maven-build.yml)

# Getting Started

### Requirements:

```
Git: 2.49.0
Spring Boot: 3.4.5
Maven: 3.9+
Redis Server Tested On: 7.4.2
Java: 21
Database : H2-2.2.224
Docker Desktop: Tested on 4.41.0
```

## Clone this repository:

```bash
git clone https://github.com/deepaksorthiya/spring-boot-3-redis-cache.git
cd spring-boot-3-redis-cache
```

## Build Project:

```bash
./mvnw clean package -DskipTests
```

## Run project

Set up a Docker local environment on your machine by running these commands in the terminal:

1. Start Redis Server:
    ```bash
    docker compose up
   ```
2. Start Spring boot app:
    ```bash
    ./mvnw spring-boot:run

## Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/maven-plugin/build-image.html)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/reference/actuator/index.html)
* [Spring Web](https://docs.spring.io/spring-boot/reference/web/servlet.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Validation](https://docs.spring.io/spring-boot//io/validation.html)
* [Flyway Migration](https://docs.spring.io/spring-boot/how-to/data-initialization.html#howto.data-initialization.migration-tool.flyway)

## Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

## Testcontainers support

This project
uses [Testcontainers at development time](https://docs.spring.io/spring-boot/3.4.0/reference/features/dev-services.html#features.dev-services.testcontainers).

Testcontainers has been configured to use the following Docker images:

* [`redis:latest`](https://hub.docker.com/_/redis)

Please review the tags of the used images and set them to the same as you're running in production.

