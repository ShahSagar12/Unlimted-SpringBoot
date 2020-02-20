package com.unlimited.admin.util;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;

import com.unlimited.admin.base.DataOperator;
import com.unlimited.admin.model.Country;
import com.unlimited.admin.model.PersonDetails;
import com.unlimited.admin.model.State;
import com.unlimited.admin.repository.CountryRepository;
import com.unlimited.admin.repository.PersonRepository;
import com.unlimited.admin.repository.StateRepository;
import com.unlimited.admin.service.CountryService;
import com.unlimited.admin.service.PersonService;
import com.unlimited.admin.service.StateService;

public class DataReaderSaver extends DataOperator{
	@Autowired
	CountryRepository countryService;
	@Autowired
	StateRepository stateService;
	@Autowired
	PersonRepository personService;
	@Override
	public void executeAction() {
		
		String toCopyloc=("D:/Eclipse_Workspace/FM_workspace/UnlimitedSpringBoot/src/main/webapp/file/file1.csv");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(toCopyloc));
			String buffer=null;
			reader.readLine();
			Integer i=1;
			while ((buffer=reader.readLine()) != null) {
			
				String[] data=buffer.split(",");
				PersonDetails person=new PersonDetails();
				person.setEventName(data[0]);
				person.setScannedDate(data[1]);
				person.setScannedTime(data[2]);
				person.setFirstName(data[3]);
				person.setMiddleInnitial(data[4]);
				person.setLastName(data[5]);
				person.setEmailAddress1(data[6]);
				person.setEmailAddress2(data[7]);
				person.setCompanyName(data[8]);
				person.setJobTitle(data[9]);
				person.setAddress1(data[10]);
				person.setAddress2(data[11]);
				person.setAddress3(data[12]);
				person.setCity(data[13]);
				
				State state=new State();
				state.setId(i);
				state.setStateName(data[14]);
				stateService.save(state);
				System.out.println(state.toString());
				
				System.out.println("State Saved");
				person.setStateId(state);
				
				person.setZip(data[15]);
				
				Country country=new Country();
				country.setCountryName(data[16]);
				countryService.save(country);
				person.setCountryId(country);
				
				
				person.setPhoneNumber(data[17]);
				person.setPhoneNumber2(data[18]);
				person.setFaxNumber(data[19]);
				person.setQuestions(data[20]);
				person.setResponse(data[21]);
				person.setNote(data[22]);
				person.setCollateral(data[23]);
				person.setQualificationStatus((data[24].equalsIgnoreCase("Qualified"))?true:false);
				person.setScannedBy(data[25]);
				
				personService.save(person);
			
				
				}
				
		        
			System.out.println("Saved Successfully");
			reader.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
			
			
	}

}
