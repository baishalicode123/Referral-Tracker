package com.example.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Leader;
import com.example.demo.model.Referral;
import com.example.demo.services.ReferralServices;

@RestController
@CrossOrigin(origins="*")
public class ReferralController {
	
	@Autowired
	public ReferralServices referralServices; 
	
	@GetMapping("/referrals")
	public List<Referral> getAllReferrals(){
		return referralServices.getAllReferrals(); 
	}
	
	@PostMapping("/referrals/add")
	public String addReferral(@RequestBody Referral referral) {
		return referralServices.addReferral(referral); 
	}
	
	@DeleteMapping("/referrals/{id}")
	public List<Referral> deleteOneReferral(@PathVariable Long id){
		return referralServices.deleteOneReferral(id); 
	}
	
	@PutMapping("/referrals/update/{id}")
	public String updateReferral(@PathVariable Long id, @RequestBody Referral referral) {
		return referralServices.updateReferral(id, referral); 
	}
	
	@GetMapping("/leaders/board")
	public Collection<Leader> getAllLeaders(){
		return referralServices.getAllLeaders(); 
	}

}
