package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
	@Id
	private Long cityId;
	private String cityName;
	private Long stateId;
	
	public City() {
		// TODO Auto-generated constructor stub
	}

	public City(Long cityId, String cityName, Long stateId) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.stateId = stateId;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", stateId=" + stateId + "]";
	}
	
	

}
