
# Communication clients

This project is an example of how to use different ways for synchronous and asynchronous communication between services
using Spring Boot. As soon as the application started it logs into the console fact about cats using different HTTP clients.  

### Get starting

Build the application

```shell
./mvnw install
```

Run application as Docker

```shell
docker-compose up -d
```

If you have locally running RabbitMQ, you can just run the app using Maven:

```shell
./mvnw spring-boot:run
```
