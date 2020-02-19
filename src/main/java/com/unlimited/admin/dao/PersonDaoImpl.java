package com.unlimited.admin.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.unlimited.admin.base.PersonGeneralInformation;
import com.unlimited.admin.repository.PersonRepository;

public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	PersonRepository personRepository;

	@Override
	public void save(PersonGeneralInformation personDetails) {
		personRepository.save(personDetails);
	}

	@Override
	public PersonGeneralInformation getPersonById(Integer id) {
		return personRepository.findById(id).get();
	}

	@Override
	public Map<String, List<PersonGeneralInformation>> getAll() {
		Map<String,List<PersonGeneralInformation>> map=new HashMap<String, List<PersonGeneralInformation>>();
		List<PersonGeneralInformation> allPersons=personRepository.findAll();
		map.getOrDefault("list", allPersons);
		return map;
	}


	
}