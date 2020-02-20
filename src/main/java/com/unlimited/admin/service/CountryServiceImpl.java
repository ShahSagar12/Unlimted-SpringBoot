package com.unlimited.admin.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.unlimited.admin.dao.CountryDao;
import com.unlimited.admin.model.Country;

public class CountryServiceImpl implements CountryService{
	@Autowired
	CountryDao countryDao;
	@Override
	public Country save(Country country) {
		
		return countryDao.save(country);
	}

}
