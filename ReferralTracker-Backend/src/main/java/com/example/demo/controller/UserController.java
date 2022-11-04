package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.services.UserServices;

@RestController
@CrossOrigin(origins ="*")
public class UserController {
	
	@Autowired 
	public UserServices userServices;
	
	@GetMapping("/users/all")
	public List<User> getAllUsers(){
		return userServices.getAllUsers(); 
	}
}
