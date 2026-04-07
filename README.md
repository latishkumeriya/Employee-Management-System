# 🚀 Employee Management System

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.5-brightgreen?style=for-the-badge&logo=springboot)
![Angular](https://img.shields.io/badge/Angular-Frontend-red?style=for-the-badge&logo=angular)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql)
![JWT](https://img.shields.io/badge/Auth-JWT-black?style=for-the-badge&logo=jsonwebtokens)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven)

🛠️ Tech Stack 

![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-Repository-green?style=flat&logo=spring)
![Spring Security](https://img.shields.io/badge/Spring%20Security-Auth-darkgreen?style=flat&logo=springsecurity)
![REST API](https://img.shields.io/badge/API-RESTful-blue?style=flat)
![CORS](https://img.shields.io/badge/CORS-Enabled-lightgrey?style=flat)
![JJWT](https://img.shields.io/badge/JJWT-0.11.5-black?style=flat)

📊 Project Status 

![Build](https://img.shields.io/badge/Build-Passing-brightgreen?style=flat)
![Status](https://img.shields.io/badge/Project-Active-success?style=flat)
![License](https://img.shields.io/badge/License-MIT-yellow?style=flat)



The **Employee Management System (EMS)** is a full-stack web application I developed to demonstrate my understanding of modern backend and frontend technologies, along with secure authentication and scalable architecture design.



### 📌 What the Project Does  
This application allows users to securely log in and manage employee records. It supports  **CRUD operations** ( Read,Delete) on employee data, making it suitable for real-world business use cases where employee information needs to be handled efficiently.



### 🧠 Problem It Solves  
Managing employee data manually or through unsecured systems can lead to data inconsistency and security risks. This project addresses those challenges by providing:
- A **centralized system** for managing employee data  
- **Secure access control** using token-based authentication  
- A **structured backend architecture** for maintainability  



### 🛠️ How I Built It  

#### 🔹 Backend  
I used **Spring Boot** to build RESTful APIs and structured the application using a **layered architecture**:
- **Controller Layer** → Handles HTTP requests  
- **Service Layer** → Contains business logic  
- **Repository Layer** → Interacts with MySQL using Spring Data JPA  

For security, I implemented **JWT authentication**, where:
- Users log in and receive a token  
- The token is validated for every request using a custom filter  
- Protected routes are secured using Spring Security  



#### 🔹 Frontend  
The frontend is built using **Angular**, which:
- Communicates with the backend via REST APIs  
- Handles user interactions and form submissions  
- Stores and sends JWT tokens for authenticated requests  


#### 🔹 Database  
I used **MySQL** to persist employee and user data, ensuring structured storage and efficient querying.



### 🔐 Key Features  
- Secure **JWT-based authentication system**  
- Full **Employee CRUD functionality**  
- **REST API integration** between frontend and backend  
- **CORS configuration** for cross-origin communication  
- Clean and maintainable **layered architecture**  



### ⚡ Challenges & Learning  

During development, I faced and solved several challenges:

- Implementing **JWT authentication flow** correctly  
- Configuring **Spring Security filters**  
- Handling **CORS issues** between Angular and backend  
- Structuring the project for **scalability and clean code**  

These helped me gain strong hands-on experience in **real-world backend security and full-stack integration**.


### 🎯 What This Project Demonstrates  
- Strong understanding of **Spring Boot & Angular integration**  
- Ability to design **secure and scalable systems**  
- Experience with **REST APIs and authentication mechanisms**  
- Practical knowledge of **database design and JPA**  


### 💡 Future Enhancements  
- Role-based access control (Admin/User roles)  
- Pagination and search for employees  
- Deployment on cloud (AWS / Render / Vercel)  
- UI improvements and dashboard analytics  



> 
## 🔐 Login Page
![Login](images/login.png)

## 📊 Dashboard
![Dashboard](images/dashboard.png)
