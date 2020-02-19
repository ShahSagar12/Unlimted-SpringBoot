package com.unlimited.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.unlimited.admin.base.PersonGeneralInformation;

@Service
public interface PersonService {
	
	public void save(PersonGeneralInformation personDetails);
	public PersonGeneralInformation getPersonById(Integer id);
	public Map<String ,List<PersonGeneralInformation>> getAll();

}
