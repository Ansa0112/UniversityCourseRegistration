
package com.mycompany.universitycourseregistration;

public class UniversityCourseRegistration {

    public static void main(String[] args) {
         Student student = new Student(
                "2024-SE-117",
                "Ansa Sajid",
                "Software Engineering"
        );


        Course course = new Course(
                "SE-201",
                "Software Engineering",
                3
        );

        Registration registration =
                new Registration(student, course);

        registration.displayRegistration();
    }
}
