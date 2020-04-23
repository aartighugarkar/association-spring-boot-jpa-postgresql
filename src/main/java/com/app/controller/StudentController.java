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
import com.app.models.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("get-all")
	public @ResponseBody ResponseDTO getAllStudents(){
		List<Student> studentList = null;
		try {
			studentList = studentService.getAllStudents();
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseDTO(HttpStatus.BAD_REQUEST.value(), e.getMessage());
		}
		return new ResponseDTO(HttpStatus.OK.value(), "All Students", studentList);
	}
	
	@PostMapping("/save-student")
	public @ResponseBody ResponseDTO saveStudent(@RequestBody Student student) {
		Student studentPersist = null;
		 try {
			 studentPersist = studentService.saveStudent(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseDTO(HttpStatus.BAD_REQUEST.value(), e.getMessage());
		}
		 return new ResponseDTO(HttpStatus.OK.value(), "Saved Successfully", studentPersist);
	}
}
