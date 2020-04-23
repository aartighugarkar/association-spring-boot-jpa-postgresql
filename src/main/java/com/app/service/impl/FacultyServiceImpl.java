package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.FacultyDao;
import com.app.models.Faculty;
import com.app.service.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService {
	
	@Autowired
	FacultyDao dao;

	@Override
	public List<Faculty> getAllFaculties() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Faculty> saveFaculty(List<Faculty> faculties) {
		// TODO Auto-generated method stub
		return dao.saveAll(faculties);
	}

	

}
