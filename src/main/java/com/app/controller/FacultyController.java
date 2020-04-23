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

import com.app.dao.SubjectDao;
import com.app.dto.ResponseDTO;
import com.app.models.Faculty;
import com.app.models.Subject;
import com.app.service.FacultyService;

@RestController
@RequestMapping("faculty")
public class FacultyController {

	@Autowired
	private FacultyService facultyService;
	
	@Autowired
	private SubjectDao subjectDao;

	@GetMapping("/get-all")
	public @ResponseBody ResponseDTO getAllFaculties() {
		List<Faculty> facultyList = null;
		try {
			facultyList=facultyService.getAllFaculties();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseDTO(HttpStatus.BAD_REQUEST.value(), e.getMessage());
		}
		return new ResponseDTO(HttpStatus.OK.value(), "All Faculties", facultyList);
	}
	
	@GetMapping("/get-all-subjects")
	public @ResponseBody ResponseDTO getAllSubjects() {
		List<Subject> subjectList = null;
		try {
			subjectList=subjectDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseDTO(HttpStatus.BAD_REQUEST.value(), e.getMessage());
		}
		return new ResponseDTO(HttpStatus.OK.value(), "All Subjects", subjectList);
	}
	
	@PostMapping("/save-faculties")
	public @ResponseBody ResponseDTO saveFaculties(@RequestBody List<Faculty> faculties) {
		List<Faculty> facultyList = null;
		try {
			facultyList = facultyService.saveFaculty(faculties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseDTO(HttpStatus.BAD_REQUEST.value(), e.getMessage());
		}
		return new ResponseDTO(HttpStatus.OK.value(), "Saved Successfully", facultyList);
	}

}
