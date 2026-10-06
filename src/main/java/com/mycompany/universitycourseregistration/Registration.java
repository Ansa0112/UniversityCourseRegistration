
package com.mycompany.universitycourseregistration;

public class Registration {

    private Student student;
    private Course course;

    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void displayRegistration() {

        System.out.println("===== REGISTRATION INFORMATION =====");

        student.displayStudent();

        System.out.println();

        course.displayCourse();
    }

    public void displayConfirmation() {

        System.out.println();
        System.out.println("===== REGISTRATION CONFIRMATION =====");
        System.out.println("Registration confirmed successfully!");
        System.out.println("Student has been registered for the course.");
    }
}
