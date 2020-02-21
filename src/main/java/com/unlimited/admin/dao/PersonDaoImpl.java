package com.unlimited.admin.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.unlimited.admin.model.PersonDetails;
import com.unlimited.admin.repository.PersonRepository;

@Component
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
	public List<PersonDetails> getAll() {
		List<PersonDetails> newList=new ArrayList<>();
		for(PersonDetails personDetails:personRepository.findAll()) {
			if(personDetails.getCountryId().getCountryName().equalsIgnoreCase("United States")) {
				newList.add(personDetails);
			}	
		}
		return newList;
	}

	@Override
	public List<PersonDetails> getByQualificationStatus(boolean status) {
		List<PersonDetails> persons=new ArrayList<>();
		if(status) {
			for(PersonDetails person:getAll()) {
				if(person.isQualificationStatus()) {
					persons.add(person);
				}
			}
		}else {
			for(PersonDetails person:getAll()) {
				if(!person.isQualificationStatus()) {
					persons.add(person);
				}
			}
		}
		return persons;
	}

	@Override
	public List<PersonDetails> getByScannedBy(String name) {
		List<PersonDetails> newList=new ArrayList<>();
		for(PersonDetails person:getAll()) {
		 if(person.getScannedBy().equalsIgnoreCase(name)) {
			 newList.add(person);
		 }
		}
		return newList;
	}


	
}
