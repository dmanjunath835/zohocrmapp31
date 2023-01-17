package com.appcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appcrm.entites.Lead;
import com.appcrm.repository.LeadRepository;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {
@Autowired
	private LeadRepository leadRepo;

 @GetMapping
  public  List<Lead> getAllLeads(){
	 List<Lead> leads = leadRepo.findAll();
  return leads;
 }
}
