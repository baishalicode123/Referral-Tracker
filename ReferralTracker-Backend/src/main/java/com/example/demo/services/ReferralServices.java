package com.example.demo.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Leader;
import com.example.demo.model.Referral;
import com.example.demo.repository.ReferralRepository;

@Service
public class ReferralServices {
	
	@Autowired
	public ReferralRepository referralRepository; 
	
	public List<Referral> getAllReferrals(){
		return referralRepository.findAll(); 
	}
	
	public String addReferral(Referral referral) {
		referralRepository.save(referral); 
		return "Referral is been update";
	}
	
	public List<Referral> deleteOneReferral(Long id){
		referralRepository.deleteById(id);
		return referralRepository.findAll();
	}
	
	public String updateReferral(Long id, Referral referral) {
		Referral r = referralRepository.findById(id).get();
		r.setStatus(referral.status);
		r.setReferred(referral.referred);
		referralRepository.save(r); 
		return "Done"; 
	}
	
	public Collection<Leader> getAllLeaders(){
		return referralRepository.getLeadersList(); 
	}
}
