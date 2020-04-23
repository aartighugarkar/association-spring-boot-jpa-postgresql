package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.DepartmentDao;
import com.app.models.Department;
import com.app.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentDao dao;

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return dao.save(department);
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
