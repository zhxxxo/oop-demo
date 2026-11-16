# OOP Demo — Spring Boot

A small Spring Boot application written for the **BIT235 Object Oriented Programming** course.
It demonstrates the four pillars of OOP in a real running web app, and serves static
HTML pages generated with the help of an AI assistant.

## What is inside

```
src/main/java/com/example/oopdemo
├── OopDemoApplication.java          # entry point + startup report
├── model
│   ├── Student.java                 # base class (encapsulation)
│   └── GraduateStudent.java         # subclass  (inheritance + polymorphism)
├── service
│   └── StudentService.java          # in-memory data source
└── controller
    └── StudentController.java       # REST layer
src/main/resources/static
├── index.html                       # landing page
├── students.html                    # list page, calls the REST API
└── style.css
```

## OOP concepts shown

| Concept | Where |
|---|---|
| Encapsulation | `Student` keeps its fields private and exposes getters only |
| Inheritance | `GraduateStudent extends Student` and adds a thesis topic |
| Polymorphism | `getLevel()` and `describe()` are overridden, so one list of `Student` references prints two formats |
| Layered design | Controller → Service → Model |

## Run it

```bash
mvn spring-boot:run
```

Then open:

- <http://localhost:8080/> — landing page
- <http://localhost:8080/students.html> — student list
- <http://localhost:8080/api/students> — raw JSON

## Tooling

- Java 21 (Eclipse Temurin)
- Spring Boot 4.1.2 (Maven)
- VS Code with the Spring Boot Extension Pack and Spring Initializr Java Support
