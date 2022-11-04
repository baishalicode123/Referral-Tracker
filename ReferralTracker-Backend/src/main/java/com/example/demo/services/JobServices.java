package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Job;
import com.example.demo.repository.JobRepository;

@Service
public class JobServices {
	
	@Autowired
	public JobRepository jobRepository; 
	
	public List<Job> getAllJobs(){
		return jobRepository.findAll(); 
	}
	
	public List<Job> deleteOneJob(Long id){
		jobRepository.deleteById(id);
		return jobRepository.findAll(); 
	}
	
	public List<Job> addOneJob(Job job){
		jobRepository.save(job); 
		return jobRepository.findAll(); 
	}
}
