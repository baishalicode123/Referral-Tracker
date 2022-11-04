package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.context.annotation.PropertySource;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@PropertySource("classpath:application.properties")
public class Referral {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id; 
	public String eid; 
	public String name; 
	public String experience; 
	public String status;
	public String title;
	
	@CreationTimestamp
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(nullable = false, updatable = true, columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP")
	public Date referred;
	

	public Referral() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Referral(Long id, String eid, String name, String experience, String status, String title, Date referred) {
		super();
		this.id = id;
		this.eid = eid;
		this.name = name;
		this.experience = experience;
		this.status = status;
		this.title = title;
		this.referred = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getReferred() {
		return referred;
	}

	public void setReferred(Date referred) {
		this.referred = referred;
	} 
	
	
}
