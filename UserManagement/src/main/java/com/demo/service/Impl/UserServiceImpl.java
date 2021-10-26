package com.demo.service.Impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.SignUpDto;
import com.demo.dto.UnlockUserDto;
import com.demo.entity.City;
import com.demo.entity.Country;
import com.demo.entity.State;
import com.demo.entity.User;
import com.demo.repo.CityRepo;
import com.demo.repo.CountryRepo;
import com.demo.repo.StateRepo;
import com.demo.repo.UserRepo;
import com.demo.service.UserService;
import com.demo.util.EmailUtil;
@Service
public class UserServiceImpl implements UserService  {
	
	String char_seq = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	@Autowired
	private CountryRepo countryrepo;
	@Autowired
	private StateRepo staterepo;
	@Autowired
	private CityRepo cityrepo;
	@Autowired
	private UserRepo userrepo; 
	@Autowired
	private EmailUtil emailUtil;

	@Override
	public Map<Long, String> getCountry() {
		List<Country> country = countryrepo.findAll();
		HashMap<Long, String> countryMap = new HashMap<>();
		for(Country con : country)
		{
			countryMap.put(con.getCountryId(), con.getCountryName());
		}
		
		return countryMap;
	}

	@Override
	public Map<Long, String> getState(Long countryId) {
		List<State> state = staterepo.findStateByCountryId(countryId);
		HashMap<Long, String> stateMap = new HashMap<>();
		for(State st : state)
		{
			stateMap.put(st.getStateId(), st.getStateName());
		}
		return stateMap;
	}

	@Override
	public Map<Long, String> getCity(Long stateId) {
		List<City> city = cityrepo.findCityByStateId(stateId);
		HashMap<Long, String> cityMap = new HashMap<>();
		for(City ct : city)
		{
			cityMap.put(ct.getCityId(), ct.getCityName());
		}
		return cityMap;
	}
	
	@Override
	public User saveUser(User user)
	{
		User save = userrepo.save(user);
		return save;
	}

	@Override
	public String loginCheckByEmailAndPassword(String email, String tempPassword) {
		String msg = null;
		User foundUser = userrepo.findUserByEmailAndTempPassword(email, tempPassword);
		if(foundUser==null)
		{
			msg = "Invalid Credentials";
		}
		else
		{
			msg = "Login Successfully";
		}
		return msg;
	}

	@Override
	public Boolean forgotPassword(String email) {
		//fetch data by user
		User user = userrepo.findUserByEmail(email);
		if(user==null)
		{
			//generate emailbody
			String emailBody = readEmailBodyToForgotPassword(user);
			//trigger email
			emailUtil.sendEmail(user.getEmail(), "Password Reset", emailBody);
			return true;
		}
		else
		{
			//1.new password generate
			//2.update db password
			//3.send email with new password
			return false;
		}
	}

	
	@Override
	public String readEmailBodyToUnlockAccount(User user) {
		
		String emailBody="";
		FileReader fileReader;
		StringBuffer sb = new StringBuffer();
		
		try {
			String file="Unlock-Email.txt";
			fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String line = br.readLine();
			
			while (line!=null) {
		    sb.append(line);
		    line = br.readLine();
				
			}
			emailBody = sb.toString();
			emailBody = emailBody.replace("{FNAME}", user.getFirstName());
			emailBody = emailBody.replace("{LNAME}", user.getLastName());
			emailBody = emailBody.replace("{TEMP-PWD}", user.getTempPassword());
			
		}catch (Exception e) {
			System.out.println("Error occured while reading file "+e.getMessage());
		}
		return emailBody;
	}

	@Override
	public String generateRandomPassword(int length) {
		
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<length; i++)
		{
			int index = random.nextInt(char_seq.length());
			char charAt = char_seq.charAt(index);
			sb.append(charAt);
		}
		
		return sb.toString();
	}

	@Override
	public boolean signUpUser(SignUpDto signupUser) {
		User entity = new User();
		//copy all value from dto to entity
		BeanUtils.copyProperties(signupUser, entity);
		//set temp password
		String tempPassword = generateRandomPassword(6);
		entity.setTempPassword(tempPassword);
		entity.setAccountStatus("Locked");
		
		User savedUser = userrepo.save(entity);
		//send email to registred user
		String to = entity.getEmail();
		String subject = "Login Information";
		String body = readEmailBodyToUnlockAccount(savedUser);
		boolean sendEmail = emailUtil.sendEmail(to, subject, body);
		return sendEmail;
	}

	@Override
	public boolean UserUnlock(UnlockUserDto unlockdto) {
		User unlockUser = userrepo.findUserByEmailAndTempPassword(unlockdto.getEmail(), unlockdto.getTempPassword());
		if(unlockUser!=null)
		{
			unlockUser.setAccountStatus("Unlocked");
			unlockUser.setTempPassword(unlockdto.getNewPassword());
			userrepo.save(unlockUser);
			return true;
		}
		return false;
	}

	@Override
	public boolean checkDuplicateEmail(String email) {
		User foundUser = userrepo.findUserByEmail(email);
		if(foundUser!=null)
		{
			return true;
		}
		return false;
	}

	@Override
	public String readEmailBodyToForgotPassword(User user) {
		String emailBody="";
		FileReader filereader;
		StringBuffer sb = new StringBuffer();
		try {
			filereader = new FileReader("Recovery-Email.txt");
			BufferedReader br = new BufferedReader(filereader);
			String line = br.readLine();
			while(line!=null)
			{
				sb.append(line);
				line = br.readLine();
			}
			String emailbody = sb.toString();
			emailbody = emailbody.replace("{FNAME}", user.getFirstName());
			emailbody = emailbody.replace("{LNAME}", user.getLastName());
			emailbody = emailbody.replace("{TEMP-PWD}", user.getTempPassword());
		} catch (Exception e) {
			System.out.println("Error occured while reading email body!"+e.getMessage());
			e.printStackTrace();
		}
		return emailBody;
	}

}
