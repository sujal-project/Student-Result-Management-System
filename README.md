# Student Result Management System (SRMS)

Student Result Management System (SRMS) is an enterprise-grade, multi-layered web application built using the Java Spring Boot framework. The platform automates academic administration workflows by digitizing grade tracking, offering interactive form submissions, and providing a data-driven performance analytics dashboard for administrators.

## 🏗️ System Architecture

The application follows a clean separation of concerns using a strict multi-layered micro-architecture:

[ Client Browser ]
        ↓
[ Presentation Layer (HTML5/Bootstrap 5/Thymeleaf/Chart.js) ]
        ↓
[ Application Controller Layer (Spring Web MVC Routes) ]
        ↓
[ Data Access Layer (Spring Data JPA / Hibernate) ]
        ↓
[ Relational Database Layer (MySQL) ]

### Core Architecture Layers:
* *Presentation Layer*: A responsive administrative user interface built with Bootstrap 5, dynamic Thymeleaf templates, and interactive charts powered by Chart.js.
* *Application Controller Layer*: Spring Boot REST endpoints mapping incoming form payloads, view routing, and state redirections.
* *Data Access Layer*: Abstracted database transaction layer leveraging Spring Data JPA to execute automated CRUD queries cleanly without boilerplate SQL.
* *Relational Database Layer*: Secure, optimized MySQL schema storing mapped object relations for students, tracking unique roll numbers, and grading metrics.

## 🛠️ Tools & Technologies Used

| Category | Tools / Technology Used | Purpose |
| :--- | :--- | :--- |
| *Backend Framework* | Java Spring Boot | Core system dependency management and scalable web serving |
| *Data Persistence* | Spring Data JPA (Hibernate) | Automated Object-Relational Mapping (ORM) and abstract querying |
| *Frontend UI* | HTML5, Bootstrap 5, Chart.js | Responsive administrative view styling and analytical charts |
| *Template Engine* | Thymeleaf | Dynamic server-side rendering of data objects into HTML layouts |
| *Database Engine* | MySQL | Scalable relational storage managing unique structural indexes |
| *Build Automation* | Maven | Third-party dependency compilation and deployment tracking |
| *Version Control* | Git / GitHub | Secure codebase tracking and source version management |

## 🌟 Key Features

* *Automated Data Persistence Engine*: Uses Hibernate schema updates to dynamically construct, update, and manage relational MySQL data tables directly from Java object models.
* *Interactive Record Management Form*: Safe web entry fields configured via Thymeleaf binding objects (th:object), pushing clean metrics straight from the UI down to the database layers.
* *Grade Distribution Analytics*: Dynamic visual charts generated through a customized Chart.js rendering script that parses collection model structures to graph student frequency metrics on the fly.
* *Graceful Database Fallbacks*: Intelligently switches to native fallback matrices if database instances are completely fresh, avoiding template display breaks for new setups.

## 🚀 Getting Started & Installation

Follow these steps to build and run the system locally on your environment:

### 1. Prerequisites
* *Java Development Kit (JDK) 17* or higher installed.
* *MySQL Server* installed, running, and listening on default port 3306.
* An Integrated Development Environment (IDE) like *VS Code* (with Java extension packs) or *IntelliJ IDEA*.

### 2. Database Preparation
Open your local MySQL terminal client or MySQL Workbench and execute the following query to create an empty schema container:
sql
CREATE DATABASE srms_db;


### 3. Clone the Repository
bash
git clone https://github.com
cd student-result-management


### 4. Configure Application Connection Credentials
Open the centralized configuration file src/main/resources/application.properties and replace the placeholder fields with your local database server instance password profile:
properties
spring.datasource.password=YOUR_MYSQL_ROOT_PASSWORD_HERE


### 5. Compile and Run via VS Code Terminal
Ensure that your previous port assignments are clear, open your built-in VS Code terminal panel (`Ctrl + ` `), and execute the automated Maven lifecycle wrapper commands:

* *Clean and Compile Source Code Layers*:
powershell
.\mvnw.cmd clean compile

* *Boot Up the Spring Boot Web Server*:
powershell
.\mvnw.cmd spring-boot:run


Once you see the terminal trace output display Tomcat started on port 8080, switch to your web browser and open:
👉 *http://localhost:8080/dashboard*

## 📁 Repository Structure

text
student-result-management/
│
├── src/
│   └── main/
│       ├── java/com/srms/
│       │   ├── StudentResultApplication.java  # Main App Driver
│       │   ├── controller/                    # Routing Controllers
│       │   ├── model/                         # Database Entities 
│       │   └── repository/                    # Data Access Layers
│       │
│       └── resources/
│           ├── templates/                     # Thymeleaf HTML Layouts (dashboard.html)
│           ├── application.properties         # Database Profiles & App Constants
│           └── data.sql                       # Optional Automated Data Seeding Script
│
├── .gitignore                                 # Prevents /target folder tracking
├── pom.xml                                    # Maven Dependency Blueprint Configuration
└── README.md                                  # Repository Documentation

