# Microservices Portfolio Project

This project demonstrates a simple microservices architecture built using **Spring Boot**. It includes multiple independently deployable services that communicate using **REST APIs**, with service discovery and registration handled by **Eureka**.

---

## 🧱 Project Structure

microservices-portfolio/
│
├── eureka-server # Service registry using Netflix Eureka
├── user-service # User microservice
├── order-service # Order microservice

## ⚙️ Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Spring Cloud Netflix Eureka
- RestTemplate
- Maven
- Git
- Postman (for testing)
- Eclipse IDE

---

## 📌 Microservices Overview

### 🧑 User Service
- Port: `8082`
- Sample Endpoint:  
  `GET /api/v1/users/{userId}`  
  Returns basic user information.

- Communicates with Order Service using **RestTemplate**.

---

### 📦 Order Service
- Port: `8081`
- Sample Endpoint:  
  `GET /api/v1/orders/{orderId}`  
  Returns order details for a given order.

---

### 🔎 Eureka Server
- Port: `8761`
- Registers and manages service instances.
- UI: `http://localhost:8083`

---

## 🔁 Service Communication

- **User Service** uses `RestTemplate` to call Order Service.
- Service URLs are resolved using **Eureka service discovery**.
- Load balancing can be enabled using `@LoadBalanced`.

---

## ▶️ How to Run

> Make sure ports 8080, 8081, and 8082 are free.

### 1. Start Eureka Server
```bash
cd eureka-server
mvn spring-boot:run

Start Order Service
cd order-service
mvn spring-boot:run


3. Start User Service
cd user-service
mvn spring-boot:run

 Future Enhancements
Integrate RabbitMQ for async communication

Add API Gateway

Add Circuit Breaker (Resilience4J or Hystrix)

Use Docker for containerization

Add MongoDB / MySQL persistence

Use Spring WebClient for async requests


Author
Akash Gattu

