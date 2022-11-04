package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Job;
import com.example.demo.services.JobServices;

@RestController
@CrossOrigin(origins ="*")
public class JobController {
	
	@Autowired
	public JobServices jobServices; 
	
	@GetMapping("/jobs/all")
	public List<Job> getAllJobs(){
		return jobServices.getAllJobs(); 
	}
	
	@DeleteMapping("/jobs/{id}")
	public List<Job> deleteOneJob(@PathVariable Long id){
		return jobServices.deleteOneJob(id); 
	}
	
	@PostMapping("/jobs/add")
	public List<Job> addOneJob(@RequestBody Job job){
		return jobServices.addOneJob(job); 
	}
	
}
