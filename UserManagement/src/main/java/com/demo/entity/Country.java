package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
	@Id
	private Long CountryId;
	private String countryName;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}

	public Country(Long countryId, String countryName) {
		super();
		CountryId = countryId;
		this.countryName = countryName;
	}

	public Long getCountryId() {
		return CountryId;
	}

	public void setCountryId(Long countryId) {
		CountryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [CountryId=" + CountryId + ", countryName=" + countryName + "]";
	}
	
	

}
