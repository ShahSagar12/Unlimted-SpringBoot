package com.unlimited.admin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.unlimited.admin.base.PersonGeneralInformation;

@Component
public interface PersonDao {
	public void save(PersonGeneralInformation personDetails);
	public PersonGeneralInformation getPersonById(Integer id);
	public Map<String ,List<PersonGeneralInformation>> getAll();
	

}
