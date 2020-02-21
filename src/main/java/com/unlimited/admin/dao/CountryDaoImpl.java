package com.unlimited.admin.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.unlimited.admin.model.Country;
import com.unlimited.admin.repository.CountryRepository;

@Component
public class CountryDaoImpl implements CountryDao{
	@Autowired
	CountryRepository countryRepository;

	@Override
	public Country save(Country country) {
		countryRepository.save(country);
		return country;
	}
	

}
