package com.solid;

import java.util.HashMap;
import java.util.Map;

public class StudentManagerImpl implements StudentManager{
	private Map<String, Student> studentMap;

    public StudentManagerImpl() {
        studentMap = new HashMap<>();
    }

    @Override
    public void addStudent(Student student) {
        studentMap.put(student.getStudentId(), student);
    }

    @Override
    public void removeStudent(Student student) {
        studentMap.remove(student.getStudentId());
    }

    @Override
    public Student getStudentById(String studentId) {
        return studentMap.get(studentId);
    }
}
