package com.unlimited.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.unlimited.admin.base.PersonGeneralInformation;
import com.unlimited.admin.dao.PersonDao;

public class PersonServiceImpl implements PersonService{
	@Autowired
	PersonDao personDao;

	@Override
	public void save(PersonGeneralInformation personDetails) {
		personDao.save(personDetails);
	}

	@Override
	public PersonGeneralInformation getPersonById(Integer id) {
	return personDao.getPersonById(id);
	}

	@Override
	public Map<String, List<PersonGeneralInformation>> getAll() {
		
		return personDao.getAll();
	}

}
