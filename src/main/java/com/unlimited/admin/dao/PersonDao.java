package com.unlimited.admin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.unlimited.admin.base.PersonGeneralInformation;
import com.unlimited.admin.model.PersonDetails;


public interface PersonDao {
	public void save(PersonDetails personDetails);
	public PersonDetails getPersonById(Integer id);
	public List<PersonDetails> getAll();
	public List<PersonDetails> getByQualificationStatus(boolean status);
	public List<PersonDetails> getByScannedBy(String name);
	

}
