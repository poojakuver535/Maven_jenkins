# Maven Jenkins

A Java project demonstrating **Maven-based build management and Jenkins-oriented CI/CD practices**.

## Overview

This project was created to practice managing a Java application with **Apache Maven** and understand how Maven projects can be integrated into a **Jenkins continuous integration workflow**.

The project includes a Maven `pom.xml`, Java source code, documentation, and project configuration files.

## Key Areas

* Java project development
* Maven project configuration
* Dependency management
* Maven build lifecycle
* CI/CD concepts
* Jenkins integration concepts
* Project documentation

## Tech Stack

* **Java**
* **Apache Maven**
* **Jenkins**
* **Git/GitHub**
* **Qodana**

## Project Structure

```text
Maven_jenkins/
│
├── docs/
├── src/
├── .idea/
├── .gitignore
├── dependency-reduced-pom.xml
├── pom.xml
├── qodana.yaml
└── README.md
```

## Maven

The project uses Maven for:

* Dependency management
* Project configuration
* Compilation
* Testing
* Packaging
* Build automation

The main Maven configuration is defined in `pom.xml`.

## Jenkins & CI/CD

The project is intended to support learning around integrating Maven projects with Jenkins.

A typical Jenkins workflow for a Maven project can include:

```text
Developer
    ↓
Git Repository
    ↓
Jenkins
    ↓
Maven Build
    ↓
Tests
    ↓
Build / Package
```

Jenkins can execute Maven commands such as:

```bash
mvn clean
mvn test
mvn package
```

This type of Maven + Jenkins workflow is commonly used to automate Java builds and testing in CI pipelines.

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/poojakuver535/Maven_jenkins.git
```

### Navigate to the Project

```bash
cd Maven_jenkins
```

### Build the Project

```bash
mvn clean package
```

### Run Tests

```bash
mvn test
```

## Learning Outcomes

Through this project, I practiced:

* Maven project structure
* Maven dependency management
* Maven build lifecycle
* Java project packaging
* CI/CD fundamentals
* Jenkins and Maven integration concepts
* Managing Java projects with Git

## Future Improvements

* Add a Jenkinsfile for Pipeline-as-Code
* Configure automated builds on Git commits
* Add automated test reporting
* Add code-quality checks
* Add Docker-based CI/CD
* Deploy the application through a Jenkins pipeline

## Author

**Pooja S**

GitHub: https://github.com/poojakuver535

LinkedIn: https://www.linkedin.com/in/pooja-s-79538827/
