package com.unlimited.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.unlimited.admin.base.PersonGeneralInformation;

import lombok.Data;

@Data
@Entity(name="person_details")
public class PersonDetails extends PersonGeneralInformation{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Column(name="event_name")
	private String eventName;
	
	@Column(name="scanned_date")
	private String scannedDate;
	
	@Column(name="scanned_time")
	private String scannedTime;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="job_title")
	private String jobTitle;
	
	@Column(name="address_1")
	private String address1;
	
	@Column(name="address_2")
	private String address2;
	
	@Column(name="address_3")
	private String address3;
	
	@Column(name="city")
	private String city;
	
	@Column(name="stateId")
	@OneToOne
	private State stateId;
	
	@Column(name="zip")
	private String zip;
	
	@Column(name="countryId")
	@OneToOne
	private Country countryId;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="phone_number_2")
	private String phoneNumber2;
	
	@Column(name="fax_number")
	private String faxNumber;
	
	@Column(name="questions")
	private String questions;
	
	@Column(name="response")
	private String response;
	
	@Column(name="collatteral")
	private String collateral;
	
	@Column(name="qualification_status")
	private boolean qualificationStatus;
	
	@Column(name="scannedBy")
	private String scannedBy;
	

}
