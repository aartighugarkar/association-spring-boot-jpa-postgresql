package com.app.service;

import java.util.List;

import com.app.models.Student;

public interface StudentService {
	Student saveStudent(Student student);
	List<Student> getAllStudents();
}
