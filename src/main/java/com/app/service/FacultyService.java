package com.app.service;

import java.util.List;

import com.app.models.Faculty;

public interface FacultyService {
	
	List<Faculty> getAllFaculties();
	List<Faculty> saveFaculty(List<Faculty> faculties);
	
}
