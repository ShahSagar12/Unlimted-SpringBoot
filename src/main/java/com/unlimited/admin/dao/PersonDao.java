package com.unlimited.admin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.unlimited.admin.base.PersonGeneralInformation;
import com.unlimited.admin.model.PersonDetails;

@Component
public interface PersonDao {
	public void save(PersonDetails personDetails);
	public PersonDetails getPersonById(Integer id);
	public Map<String ,List<PersonDetails>> getAll();
	

}
