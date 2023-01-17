package com.appcrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appcrm.entites.Lead;
import com.appcrm.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
     @Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveOneLead(Lead lead) {
     leadRepo.save(lead);		
	}
	
}
