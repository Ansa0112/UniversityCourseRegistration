
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
}
