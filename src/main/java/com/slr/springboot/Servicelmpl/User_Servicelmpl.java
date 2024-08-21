package com.slr.springboot.Servicelmpl;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slr.springboot.Model.System_User;
import com.slr.springboot.Repo.UserRepo;
import com.slr.springboot.Service.UserService;

@Service
public class User_Servicelmpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public List<System_User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public String createUser(System_User user) {
		// TODO Auto-generated method stub
		System_User uobj = new System_User();
		uobj.setUserName(user.getUserName());
		uobj.setEmailId(user.getEmailId());
		String encodedPass = Base64.getEncoder().encodeToString(user.getUserPwd().getBytes());
		uobj.setUserPwd(encodedPass);
		uobj.setUserRole("Guest");
		uobj.setUserStatus("Prohibited");
		userRepo.save(uobj);
		String str = "User created Successfully...";
		return str;
	}

	@Override
	public String login(System_User user) {
		// TODO Auto-generated method stub
		String output = "";
		try {
		System_User existUser = userRepo.findByUserName(user.getUserName());
		
		
		if(existUser!=null) {
			String clientPwd = user.getUserPwd();
			byte[] pwdBytes = Base64.getDecoder().decode(existUser.getUserPwd().getBytes());
			String decodedPwd = new String(pwdBytes);
			if(decodedPwd.equals(clientPwd)) {
				output = "login successfull";
			}else {
				output = "Your password is incorrect";
			}
		}else {
			output = "user not found in db";
		}
		}catch(Exception e) {
			e.printStackTrace();
			output = e.toString();
		}
		
		return output;
	}

}
