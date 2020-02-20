package com.unlimited.admin.util.generator;

import java.util.HashMap;

import com.unlimited.admin.base.DataOperator;
import com.unlimited.admin.util.DataCopier;
import com.unlimited.admin.util.DataReaderSaver;

public class DataActionGenerator {
	
	private static HashMap<String,DataOperator> map=initCommand();

	private static HashMap<String,DataOperator>  initCommand() {
		HashMap<String,DataOperator> hashMap=new HashMap<String, DataOperator>();
		hashMap.put("copy", new DataCopier());
		hashMap.put("reader", new DataReaderSaver());
		return hashMap;
		
	}
	
	public static DataOperator get(String param) {
		return (map.containsKey(param))?map.get(param):null;
	}
	
	
}
