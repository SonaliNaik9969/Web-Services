package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {
	@Id
	private Long stateId;
	private String stateName;
	private Long countryId;
	
	public State() {
		// TODO Auto-generated constructor stub
	}
	
	public State(Long stateId, String stateName, Long countryId) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.countryId = countryId;
	}
	public Long getStateId() {
		return stateId;
	}
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Long getCountryId() {
		return countryId;
	}
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", countryId=" + countryId + "]";
	}
	
	

}
