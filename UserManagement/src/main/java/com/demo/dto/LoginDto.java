package com.demo.dto;

public class LoginDto {
	
	private String email;
	private String tempPassword;
	
	public LoginDto() {
		// TODO Auto-generated constructor stub
	}

	public LoginDto(String email, String tempPassword) {
		super();
		this.email = email;
		this.tempPassword = tempPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTempPassword() {
		return tempPassword;
	}

	public void setTempPassword(String tempPassword) {
		this.tempPassword = tempPassword;
	}

	@Override
	public String toString() {
		return "LoginDto [email=" + email + ", tempPassword=" + tempPassword + "]";
	}
	
	

}
