package com.solid;

public interface StudentManager {
	void addStudent(Student student);
    void removeStudent(Student student);
    Student getStudentById(String studentId);
}