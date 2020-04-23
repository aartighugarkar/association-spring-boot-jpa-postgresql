package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ResponseDTO;
import com.app.models.Department;
import com.app.service.DepartmentService;

@RestController
@RequestMapping("department")
public class DepartmentController {
	
	@Autowired
	DepartmentService deptService;
	
	@GetMapping("/get-all")
	public @ResponseBody ResponseDTO getAllDepartments(){
		List<Department> departmentList = null;
		try {
			departmentList=deptService.getAllDepartments();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseDTO(HttpStatus.BAD_REQUEST.value(), e.getMessage());
		}
		return new ResponseDTO(HttpStatus.OK.value(), "All Departments", departmentList);
	}
	
	@PostMapping("/save-department")
	public @ResponseBody ResponseDTO saveDepartment(@RequestBody Department dept) {	
		Department deptPersist = null;
		
		try {
			deptPersist = deptService.saveDepartment(dept);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseDTO(HttpStatus.BAD_REQUEST.value(), e.getMessage());
		}
		return new ResponseDTO(HttpStatus.OK.value(), "Saved Successfully", deptPersist);
	}
	
}
