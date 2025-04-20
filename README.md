[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/xoUQweoY)
# Hibernate Student CRUD Application

This is a basic Hibernate-based Java application to perform CRUD (Create, Read, Update, Delete) operations on a **Student** entity using **Hibernate ORM** and **MySQL**.

## Project Structure
**HibernateStudentCRUD

├── src/

       └── com/example/hibernate/

             ├── Student.java            # Entity class

             ├── StudentDAO.java         # Data access object class for CRUD operations
  
             └── MainApp.java            # Main application class to test CRUD operations

├── lib/                            # Folder for external JAR dependencies

     ├── hibernate-core-5.6.12.Final.jar

     ├── mysql-connector-java-8.0.26.jar

     ├── jakarta.persistence-api-2.2.3.jar

     └── hibernate-commons-annotations-5.1.2.Final.jar

├── hibernate.cfg.xml               # Hibernate configuration file

├── .gitignore                      # To ignore unnecessary files in Git**


## Requirements

- **Java** 8 or later
- **Hibernate ORM**
- **MySQL Database**

## Steps to Run the Project

1. **Set Up MySQL Database**
   - Create a database named `hibernate_crud` in MySQL:
   ```sql
   CREATE DATABASE hibernate_crud;
2. **Configure Hibernate**
In the hibernate.cfg.xml file, update the following properties to match your MySQL database credentials:

xml
Copy
Edit
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/hibernate_crud</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">root</property>

3. **Add Dependencies**


Download and place the necessary JAR files in the lib/ folder:

hibernate-core-5.6.12.Final.jar

mysql-connector-java-8.0.26.jar

jakarta.persistence-api-2.2.3.jar

hibernate-commons-annotations-5.1.2.Final.jar



5. **Run the Application**
Open and run the MainApp.java file. It will perform the following operations:

Create a new student in the database.

Read the student record.

Update the student details.

Delete the student record.

**How the Application Works**
Create: Adds a new student to the students table in the MySQL database.

Read: Retrieves and prints the student information.

Update: Modifies an existing student's information (name and age).

Delete: Removes the student record from the database.

**Technologies Used**
Java 8+

Hibernate ORM

MySQL Database

Maven/Gradle (Optional for managing dependencies)

**Notes**
Ensure you have MySQL installed and running on your machine.

Modify the database connection properties in hibernate.cfg.xml if necessary

