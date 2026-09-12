# 💼 LinkedIn Clone — Microservices Architecture

A scalable **LinkedIn Clone** built using **Spring Boot Microservices Architecture**, designed to demonstrate professional networking, post management, real-time communication, file uploads, and cloud deployment.

## 🚀 Tech Stack

* **Java 21**
* **Spring Boot**
* **Spring Cloud**
* **Spring Security & JWT**
* **Neo4j** — Graph database for modeling professional connections
* **Apache Kafka** — Event-driven communication and real-time notifications
* **Docker** — Containerization
* **Kubernetes** — Container orchestration
* **Google Kubernetes Engine (GKE)** — Cloud deployment
* **API Gateway** — Centralized API routing
* **Eureka** — Service discovery
* **PostgreSQL** — Relational database
* **Postman** — API testing

## 🏗️ Microservices Architecture

The application is divided into independent microservices:

* **User Service** — User registration, login and authentication
* **Post Service** — Create and manage posts, likes and interactions
* **Connection Service** — Manage professional connections using Neo4j
* **Notification Service** — Real-time notifications using Kafka
* **Upload Service** — Image/file upload functionality
* **API Gateway** — Single entry point for client requests
* **Discovery Server** — Service registration and discovery using Eureka

## 🔗 Professional Connections with Neo4j

**Neo4j** is used to represent professional relationships as a graph.

For example:

```text
User A
  │
  ├── CONNECTED_TO ──> User B
  │
  └── CONNECTED_TO ──> User C
                         │
                         └── CONNECTED_TO ──> User D
```

This makes it possible to efficiently model and query relationships such as:

* User connections
* Mutual connections
* Professional network relationships
* Connection recommendations

## ⚡ Event-Driven Communication with Kafka

**Apache Kafka** is used for asynchronous communication between microservices.

For example:

```text
User Service
     │
     │ User Created Event
     ▼
   Kafka
     │
     ▼
Connection Service
     │
     ▼
Create/Update Connection Data
```

Kafka is also used to support **real-time notification events** between services.

## 🐳 Docker

Each microservice is containerized using **Docker**, allowing services to run consistently across development and deployment environments.

```text
Docker
 ├── User Service
 ├── Post Service
 ├── Connection Service
 ├── Notification Service
 ├── Upload Service
 └── API Gateway
```

## ☸️ Kubernetes & GKE

The containerized application is deployed using **Kubernetes** and **Google Kubernetes Engine (GKE)**.

Deployment includes:

* Kubernetes Deployments
* Kubernetes Services
* Ingress
* Containerized microservices
* Cloud-based service deployment

```text
Internet
    │
    ▼
GKE Ingress
    │
    ▼
API Gateway
    │
    ├── User Service
    ├── Post Service
    ├── Connection Service
    ├── Notification Service
    └── Upload Service
```

## 🎯 Key Highlights

* Designed a **microservices-based LinkedIn Clone**
* Implemented **JWT-based authentication**
* Used **Neo4j graph database** for professional connections
* Implemented **Kafka-based event-driven communication**
* Added **real-time notification processing**
* Containerized services using **Docker**
* Orchestrated services using **Kubernetes**
* Deployed the application to **Google Kubernetes Engine (GKE)**
* Configured **Ingress** for external traffic routing
* Tested APIs using **Postman**
LinkedIn Clone - Microservices

API Gateway          : 8080  ✅
Discover Server      : 8761  ✅
User Service         : 9020  ✅
Post Service         : 9010  ✅
Connection Service   : 9030  ✅
Notification Service : 9040  ✅
Upload Service       : 9050  ✅

Kafka                : Running ✅
PostgreSQL           : Connected ✅
Neo4j                : Connected ✅
Docker               : Running ✅
Kubernetes/GKE       : Deployed ✅
