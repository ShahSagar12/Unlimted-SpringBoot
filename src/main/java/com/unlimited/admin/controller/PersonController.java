package com.unlimited.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.unlimited.admin.service.PersonService;

@Controller
@RequestMapping("/admin")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	
	@RequestMapping(method=RequestMethod.GET ,value="/")
	public String home(Model model) {
		model.addAttribute("persons", personService.getAll());
		return "/admin/index";
	}
	
	@RequestMapping(method=RequestMethod.GET ,value="/person/qualified")
	public String qualified(Model model) {
		model.addAttribute("persons", personService.getByQualificationStatus(true));
		return "/admin/index";
	}
	
	@RequestMapping(method=RequestMethod.GET ,value="/person/unqualified")
	public String unqualified(Model model) {
		model.addAttribute("persons", personService.getByQualificationStatus(false));
		return "/admin/index";
	}
	
	@RequestMapping(method=RequestMethod.GET ,value="/person/scannedby")
	public String scannedBy(Model model,@RequestParam String name) {
		model.addAttribute("persons", personService.getByScannedBy(name));
		return "/admin/index";
	}
	
	

}
