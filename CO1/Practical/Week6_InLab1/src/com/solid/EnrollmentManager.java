package com.solid;

import java.util.List;

public interface EnrollmentManager {
	void enrollStudentInCourse(Student student, Course course);
    void removeStudentFromCourse(Student student, Course course);
    List<Course> getCoursesForStudent(Student student);
}
