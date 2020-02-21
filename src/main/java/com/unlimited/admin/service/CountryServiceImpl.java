package com.unlimited.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unlimited.admin.dao.CountryDao;
import com.unlimited.admin.model.Country;

@Service
public class CountryServiceImpl implements CountryService{
	@Autowired
	CountryDao countryDao;
	
	
	@Override
	public Country save(Country country) {
		
		return countryDao.save(country);
	}

}
