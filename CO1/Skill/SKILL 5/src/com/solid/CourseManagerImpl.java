package com.solid;

import java.util.HashMap;
import java.util.Map;

public class CourseManagerImpl implements CourseManager {
	 private Map<String, Course> courseMap;

	    public CourseManagerImpl() {
	        courseMap = new HashMap<>();
	    }

	    @Override
	    public void addCourse(Course course) {
	        courseMap.put(course.getCourseId(), course);
	    }

	    @Override
	    public void removeCourse(Course course) {
	        courseMap.remove(course.getCourseId());
	    }

	    @Override
	    public Course getCourseById(String courseId) {
	        return courseMap.get(courseId);
	    }
}
