package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.models.Address;
import com.app.models.Subject;

@Repository
public interface SubjectDao extends JpaRepository<Subject, Integer> {

}
