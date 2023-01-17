package com.appcrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appcrm.entites.Lead;
import com.appcrm.service.LeadService;

@Controller
public class LeadContoller {
@Autowired
private LeadService leadService;
	
	@RequestMapping("/save")
	public String view() {
		return "create_lead";
	}
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead") Lead lead,Model model) {
		leadService.saveOneLead(lead);
		model.addAttribute("msg", "save record!");
	return "create_lead";
	}
}
