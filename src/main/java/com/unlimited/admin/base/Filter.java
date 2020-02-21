package com.unlimited.admin.base;

import java.util.List;

import com.unlimited.admin.model.PersonDetails;

public interface Filter {
	
	public abstract List<PersonDetails> filterList(Object param);

}
