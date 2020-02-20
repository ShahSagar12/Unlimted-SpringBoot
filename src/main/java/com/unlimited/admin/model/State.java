package com.unlimited.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity(name="state")
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="state_name")
	private String stateName;
	
	public State() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public State(Integer id, String stateName) {
		
		this.id = id;
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", stateName=" + stateName + "]";
	}

	
}
