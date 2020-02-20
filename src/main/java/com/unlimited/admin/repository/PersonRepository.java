package com.unlimited.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unlimited.admin.model.PersonDetails;

@Repository
public interface PersonRepository extends JpaRepository<PersonDetails, Integer>{

}
