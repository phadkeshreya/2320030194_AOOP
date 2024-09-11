package com.solid;

import java.util.List;

public class StudentInformationSystem {
	private final StudentManager studentManager;
    private final CourseManager courseManager;
    private final EnrollmentManager enrollmentManager;

    // Dependency injection through the constructor
    public StudentInformationSystem(StudentManager studentManager, CourseManager courseManager, EnrollmentManager enrollmentManager) {
        this.studentManager = studentManager;
        this.courseManager = courseManager;
        this.enrollmentManager = enrollmentManager;
    }

    public void run() {
        // Create students
        Student student1 = new Student("1", "Alice");
        Student student2 = new Student("2", "Bob");

        // Create courses
        Course course1 = new Course("101", "Math");
        Course course2 = new Course("102", "Physics");

        // Manage students and courses
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);

        // Enroll students in courses
        enrollmentManager.enrollStudentInCourse(student1, course1);
        enrollmentManager.enrollStudentInCourse(student2, course2);

        // Display enrolled courses for student1
        List<Course> coursesForAlice = enrollmentManager.getCoursesForStudent(student1);
        System.out.println("Courses for " + student1.getName() + ":");
        for (Course course : coursesForAlice) {
            System.out.println(course.getCourseName());
        }
    }

    public static void main(String[] args) {
        // Instantiate managers and pass them into the SIS system
        StudentManager studentManager = new StudentManagerImpl();
        CourseManager courseManager = new CourseManagerImpl();
        EnrollmentManager enrollmentManager = new EnrollmentManagerImpl();

        // Create and run the SIS
        StudentInformationSystem sis = new StudentInformationSystem(studentManager, courseManager, enrollmentManager);
        sis.run();
    }
}
