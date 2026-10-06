
package com.mycompany.universitycourseregistration;

public class UniversityCourseRegistration {

    public static void main(String[] args) {
         Student student = new Student(
                "2024-SE-117",
                "Ansa Sajid",
                "Software Engineering"
        );

        System.out.println("===== STUDENT INFORMATION =====");
        student.displayStudent();
    }
}
