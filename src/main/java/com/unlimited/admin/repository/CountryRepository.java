package com.unlimited.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unlimited.admin.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{

}
