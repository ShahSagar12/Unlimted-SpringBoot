package com.unlimited.admin.service;

import org.springframework.stereotype.Service;

import com.unlimited.admin.model.Country;

@Service
public interface CountryService {
	public Country save(Country country);

}
