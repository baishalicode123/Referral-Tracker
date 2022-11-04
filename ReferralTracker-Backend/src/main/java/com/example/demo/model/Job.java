package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job")
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id; 
	
	public String title; 
	public String location; 
	public String description; 
	
	public Job(Long id, String title, String location, String description) {
		super();
		this.id = id;
		this.title = title;
		this.location = location;
		this.description = description;
	}
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
