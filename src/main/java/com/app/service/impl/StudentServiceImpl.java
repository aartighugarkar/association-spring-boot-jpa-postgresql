package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.StudentDao;
import com.app.models.Student;
import com.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

}
