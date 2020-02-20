package com.unlimited.admin.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.unlimited.admin.model.PersonDetails;
import com.unlimited.admin.repository.PersonRepository;

public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	PersonRepository personRepository;

	@Override
	public void save(PersonDetails personDetails) {
		personRepository.save(personDetails);
	}

	@Override
	public PersonDetails getPersonById(Integer id) {
		return personRepository.findById(id).get();
	}

	@Override
	public Map<String, List<PersonDetails>> getAll() {
		Map<String,List<PersonDetails>> map=new HashMap<String, List<PersonDetails>>();
		List<PersonDetails> allPersons=personRepository.findAll();
		map.getOrDefault("list", allPersons);
		return map;
	}


	
}
