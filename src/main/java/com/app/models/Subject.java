package com.app.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties("faculties")
public class Subject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	private String type;

	/*
	 * @ManyToMany(mappedBy = "subjects", fetch = FetchType.LAZY) private
	 * List<Faculty> faculties = new ArrayList<>();
	 */

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/*
	 * public List<Faculty> getFaculties() { return faculties; }
	 * 
	 * public void setFaculties(List<Faculty> faculties) { this.faculties =
	 * faculties; }
	 */
}
