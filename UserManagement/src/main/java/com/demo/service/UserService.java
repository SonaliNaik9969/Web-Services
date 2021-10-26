package com.demo.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.demo.dto.SignUpDto;
import com.demo.dto.UnlockUserDto;
import com.demo.entity.User;
@Service
public interface UserService {
	
	public Map<Long, String> getCountry();
	
	public Map<Long, String> getState(Long countryId);
	
	public Map<Long, String> getCity(Long stateId);

	User saveUser(User user);

	public String loginCheckByEmailAndPassword(String email, String tempPassword);

	public Boolean forgotPassword(String email);
	
	public String readEmailBodyToUnlockAccount(User user);
	
	public String generateRandomPassword(int length);

	public boolean signUpUser(SignUpDto signupUser);

	public boolean UserUnlock(UnlockUserDto unlockdto);
	
	public boolean checkDuplicateEmail(String email);
	
	public String readEmailBodyToForgotPassword(User user);
	
	

	
	

}
