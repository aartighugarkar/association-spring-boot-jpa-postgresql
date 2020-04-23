package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.models.Department;



@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer> {
	
}
