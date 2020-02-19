package com.unlimited.admin.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;

import com.unlimited.admin.base.DataOperator;

public class DataCopier extends DataOperator{
	
	@Override
	public void executeAction() {
		 String from="C:/Users/SAGAR/Downloads/interview-assignment (1)/interview-assignment/persons.csv";
		 String toCopyloc=("D:/Eclipse_Workspace/FM_workspace/UnlimitedSpringBoot/src/main/webapp/file/");
		 System.out.println("tocopy"+toCopyloc);
		 if(!new File(toCopyloc).exists()) {
				new File(toCopyloc).mkdir();
			}
		 String buffer="";
		 
			try {
				PrintStream printStream=new PrintStream(toCopyloc+"file1.csv");
				BufferedReader reader=new BufferedReader(new FileReader(from));
				while ((buffer=reader.readLine()) != null) {
					String[] token=buffer.split(",");
					if(token[1]!=null) {
			            printStream.println(buffer+"\n");
					}   
			        }
					printStream.close();
					reader.close();
			} catch (Exception e) {
				e.getMessage();
			}
		
	}
	
	

}
