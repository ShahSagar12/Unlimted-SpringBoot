package com.unlimited.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.unlimited.admin.base.PersonGeneralInformation;
import com.unlimited.admin.model.PersonDetails;

@Service
public interface PersonService {
	
	public void save(PersonDetails personDetails);
	public PersonDetails getPersonById(Integer id);
	public Map<String ,List<PersonDetails>> getAll();

}
