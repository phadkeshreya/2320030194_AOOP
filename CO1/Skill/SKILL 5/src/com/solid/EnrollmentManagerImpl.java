package com.solid;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentManagerImpl implements EnrollmentManager {
	@Override
    public void enrollStudentInCourse(Student student, Course course) {
        student.getEnrolledCourses().add(course);
        course.getEnrolledStudents().add(student);
    }

    @Override
    public void removeStudentFromCourse(Student student, Course course) {
        student.getEnrolledCourses().remove(course);
        course.getEnrolledStudents().remove(student);
    }

    @Override
    public List<Course> getCoursesForStudent(Student student) {
        return student.getEnrolledCourses();
    }
}
