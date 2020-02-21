package com.unlimited.admin.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.unlimited.admin.model.State;
import com.unlimited.admin.repository.StateRepository;

@Component
public class StateDaoImpl implements StateDao {
	
	@Autowired
	StateRepository stateRepository;
	
	@Override
	public State save(State state) {
		stateRepository.save(state);
		return state;
	}

}
