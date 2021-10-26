package com.demo.dto;

import java.time.LocalDate;

public class SignUpDto {
	
	private String firstName;
	private String lastName;
	private String email;
	private String contact;
	private LocalDate dob;
	private String gender;
	private Long countryId;
	private Long stateId;
	private Long cityId;
	
	public SignUpDto() {
		// TODO Auto-generated constructor stub
	}

	public SignUpDto(String firstName, String lastName, String email, String contact, LocalDate dob, String gender,
			Long countryId, Long stateId, Long cityId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
		this.dob = dob;
		this.gender = gender;
		this.countryId = countryId;
		this.stateId = stateId;
		this.cityId = cityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	@Override
	public String toString() {
		return "SignUpDto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", contact="
				+ contact + ", dob=" + dob + ", gender=" + gender + ", countryId=" + countryId + ", stateId=" + stateId
				+ ", cityId=" + cityId + "]";
	}
	
	

}
