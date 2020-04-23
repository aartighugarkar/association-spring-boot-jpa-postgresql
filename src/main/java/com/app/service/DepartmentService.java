package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.models.Department;

public interface DepartmentService {
	Department saveDepartment(Department department);
	List<Department> getAllDepartments();
	
}
