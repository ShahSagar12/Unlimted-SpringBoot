package com.unlimited.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unlimited.admin.base.PersonGeneralInformation;

@Repository
public interface PersonRepository extends JpaRepository<PersonGeneralInformation, Integer>{

}
