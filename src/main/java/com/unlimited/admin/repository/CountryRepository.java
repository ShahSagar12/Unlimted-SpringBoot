package com.unlimited.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unlimited.admin.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{

}
