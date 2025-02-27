# **Code Snippet Manager (Spring Boot + Gradle)**

A simple Spring Boot project for storing and managing code snippets. This project is intended to help familiarize myself with Spring Boot and Gradle.

---

# How to use the Snippet Manager:

1. rename the development.secrets.properties file into secrets.properties and change it your settings
2. Start the project by running the main-class

---

## **Project Overview**
- **Backend:** Spring Boot (Gradle)
- **Database:** H2 (dev) / PostgreSQL (prod)
- **API:** REST & Swagger
- **Security:** Optional (JWT, Basic Auth)
- **Frontend:** Optional Thymeleaf / React / Vue

---

## **To-Do List:**

### *1. Security & Authentication*
- [ ] **Integrate Spring Security?**
  - [ ] Do we need authentication? (JWT, OAuth?)
  - [ ] Restrict access to API routes
  - [ ] Define user roles and permissions

---  

### *2. Code Quality & Documentation*
- [ ] **Improve logging & error handling**
  - [ ] Standardized error responses with `@ControllerAdvice`

---  

### *3. Testing & Deployment*
- [ ] **Write tests**
  - [ ] Unit tests (`SnippetService`, `SnippetRepository`)
  - [ ] API integration tests (`@SpringBootTest`)

- [ ] **Prepare for deployment**
  - [ ] Docker setup for PostgreSQL & Spring Boot
  - [ ] CI/CD with GitHub Actions or GitLab CI

---  

## **Additional Notes/Questions**
*How should the project be deployed in the future?*
