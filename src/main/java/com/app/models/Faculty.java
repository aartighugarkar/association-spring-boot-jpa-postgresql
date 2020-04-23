package com.app.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "faculties")
public class Faculty implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(nullable = false)
	private String name;

	
	private String age;

	private String gender;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "faculty_subject", 
      joinColumns = @JoinColumn(name = "faculty_id", referencedColumnName = "id"), 
      inverseJoinColumns = @JoinColumn(name = "subject_id", 
      referencedColumnName = "id"))
    private List<Subject> subjects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
}
