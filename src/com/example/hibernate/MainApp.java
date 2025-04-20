package com.example.hibernate;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        Student s1 = new Student("Vivek", 22);
        dao.addStudent(s1);
        System.out.println("Student added: " + s1.getId());

        Student retrieved = dao.getStudent(s1.getId());
        System.out.println("Retrieved Student: " + retrieved.getName() + ", Age: " + retrieved.getAge());

        dao.updateStudent(s1.getId(), "Vivek Kumar", 23);
        System.out.println("Updated Student");

        dao.deleteStudent(s1.getId());
        System.out.println("Deleted Student");
    }
}
