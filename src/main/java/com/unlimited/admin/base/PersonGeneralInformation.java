package com.unlimited.admin.base;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
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
	
	public PersonGeneralInformation() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleInnitial() {
		return middleInnitial;
	}
	public void setMiddleInnitial(String middleInnitial) {
		this.middleInnitial = middleInnitial;
	}
	public String getEmailAddress1() {
		return emailAddress1;
	}
	public void setEmailAddress1(String emailAddress1) {
		this.emailAddress1 = emailAddress1;
	}
	public String getEmailAddress2() {
		return emailAddress2;
	}
	public void setEmailAddress2(String emailAddress2) {
		this.emailAddress2 = emailAddress2;
	}
	public PersonGeneralInformation(Integer id, String firstName, String lastName, String middleInnitial,
			String emailAddress1, String emailAddress2) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleInnitial = middleInnitial;
		this.emailAddress1 = emailAddress1;
		this.emailAddress2 = emailAddress2;
	}
	@Override
	public String toString() {
		return "PersonGeneralInformation [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", middleInnitial=" + middleInnitial + ", emailAddress1=" + emailAddress1 + ", emailAddress2="
				+ emailAddress2 + "]";
	}
	
	
	
}
