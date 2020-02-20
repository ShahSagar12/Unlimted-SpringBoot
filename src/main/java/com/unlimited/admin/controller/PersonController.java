package com.unlimited.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unlimited.admin.base.DataOperator;
import com.unlimited.admin.util.DataReaderSaver;

@Controller
@RequestMapping("/admin")
public class PersonController {
	
	@RequestMapping(method=RequestMethod.GET ,value="/")
	public String home() {
		
		
		 
		return "/admin/index";
	}
	
	

}
