package com.unlimited.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unlimited.admin.dao.PersonDao;
import com.unlimited.admin.model.PersonDetails;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	PersonDao personDao;

	@Override
	public void save(PersonDetails personDetails) {
		personDao.save(personDetails);
	}

	@Override
	public PersonDetails getPersonById(Integer id) {
	return personDao.getPersonById(id);
	}

	@Override
	public List<PersonDetails> getAll() {
		
		return personDao.getAll();
	}
	@Override
	public List<PersonDetails> getByScannedBy(String scannedBy) {
		
		return personDao.getByScannedBy(scannedBy);
	}

	@Override
	public List<PersonDetails> getByQualificationStatus(boolean status) {
		
		return personDao.getByQualificationStatus(status);
	}

}
