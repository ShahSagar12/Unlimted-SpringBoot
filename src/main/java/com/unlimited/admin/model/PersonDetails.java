package com.unlimited.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.unlimited.admin.base.PersonGeneralInformation;


@Entity(name="person_details")
public class PersonDetails extends PersonGeneralInformation{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
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
	
	
	@OneToOne
	private State stateId;
	
	@Column(name="zip")
	private String zip;
	
	
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
	
	@Column(name="note")
	private String note;
	
	@Column(name="collatteral")
	private String collateral;
	
	@Column(name="qualification_status")
	private boolean qualificationStatus;
	
	@Column(name="scannedBy")
	private String scannedBy;
	
	public PersonDetails() {
		// TODO Auto-generated constructor stub
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getScannedDate() {
		return scannedDate;
	}

	public void setScannedDate(String scannedDate) {
		this.scannedDate = scannedDate;
	}

	public String getScannedTime() {
		return scannedTime;
	}

	public void setScannedTime(String scannedTime) {
		this.scannedTime = scannedTime;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public State getStateId() {
		return stateId;
	}

	public void setStateId(State stateId) {
		this.stateId = stateId;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Country getCountryId() {
		return countryId;
	}

	public void setCountryId(Country countryId) {
		this.countryId = countryId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber2() {
		return phoneNumber2;
	}

	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getCollateral() {
		return collateral;
	}

	public void setCollateral(String collateral) {
		this.collateral = collateral;
	}

	public boolean isQualificationStatus() {
		return qualificationStatus;
	}

	public void setQualificationStatus(boolean qualificationStatus) {
		this.qualificationStatus = qualificationStatus;
	}

	public String getScannedBy() {
		return scannedBy;
	}

	public void setScannedBy(String scannedBy) {
		this.scannedBy = scannedBy;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public PersonDetails(String eventName, String scannedDate, String scannedTime, String companyName, String jobTitle,
			String address1, String address2, String address3, String city, State stateId, String zip,
			Country countryId, String phoneNumber, String phoneNumber2, String faxNumber, String questions,
			String response, String note, String collateral, boolean qualificationStatus, String scannedBy) {
		super();
		this.eventName = eventName;
		this.scannedDate = scannedDate;
		this.scannedTime = scannedTime;
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.city = city;
		this.stateId = stateId;
		this.zip = zip;
		this.countryId = countryId;
		this.phoneNumber = phoneNumber;
		this.phoneNumber2 = phoneNumber2;
		this.faxNumber = faxNumber;
		this.questions = questions;
		this.response = response;
		this.note = note;
		this.collateral = collateral;
		this.qualificationStatus = qualificationStatus;
		this.scannedBy = scannedBy;
	}

	@Override
	public String toString() {
		return "PersonDetails [eventName=" + eventName + ", scannedDate=" + scannedDate + ", scannedTime=" + scannedTime
				+ ", companyName=" + companyName + ", jobTitle=" + jobTitle + ", address1=" + address1 + ", address2="
				+ address2 + ", address3=" + address3 + ", city=" + city + ", stateId=" + stateId + ", zip=" + zip
				+ ", countryId=" + countryId + ", phoneNumber=" + phoneNumber + ", phoneNumber2=" + phoneNumber2
				+ ", faxNumber=" + faxNumber + ", questions=" + questions + ", response=" + response + ", note=" + note
				+ ", collateral=" + collateral + ", qualificationStatus=" + qualificationStatus + ", scannedBy="
				+ scannedBy + "]";
	}

}
