package com.demo.dto;

public class UnlockUserDto {
	
	private String email;
	private String tempPassword;
	private String newPassword;
	private String confirmPassword;
	
	public UnlockUserDto() {
		// TODO Auto-generated constructor stub
	}

	public UnlockUserDto(String email, String tempPassword, String newPassword, String confirmPassword) {
		super();
		this.email = email;
		this.tempPassword = tempPassword;
		this.newPassword = newPassword;
		this.confirmPassword = confirmPassword;
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

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "UnlockUserDto [email=" + email + ", tempPassword=" + tempPassword + ", newPassword=" + newPassword
				+ ", confirmPassword=" + confirmPassword + "]";
	}
	
	

}
