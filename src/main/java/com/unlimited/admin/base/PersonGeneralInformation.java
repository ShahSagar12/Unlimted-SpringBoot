package com.unlimited.admin.base;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;



@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PersonGeneralInformation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7146202451564737219L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String firstName;
	private String lastName;
	private String middleInnitial;
	private String emailAddress1;
	private String emailAddress2;
	
}
