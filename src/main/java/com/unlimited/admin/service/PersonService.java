package com.unlimited.admin.service;

import java.util.List;
import java.util.Map;

import com.unlimited.admin.model.PersonDetails;


public interface PersonService {
	
	public void save(PersonDetails personDetails);
	public PersonDetails getPersonById(Integer id);
	public List<PersonDetails> getAll();
	public List<PersonDetails> getByQualificationStatus(boolean status);
	public List<PersonDetails> getByScannedBy(String name);

}
