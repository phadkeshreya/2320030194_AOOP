package com.solid;

public interface CourseManager {
	void addCourse(Course course);
    void removeCourse(Course course);
    Course getCourseById(String courseId);
}
