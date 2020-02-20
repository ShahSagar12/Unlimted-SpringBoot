package com.unlimited.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unlimited.admin.dao.StateDao;
import com.unlimited.admin.model.State;

@Service
public class StateServiceImpl implements StateService{
	@Autowired
	StateDao stateDao;
	@Override
	public State save(State state) {
		
		return stateDao.save(state);
	}

}
