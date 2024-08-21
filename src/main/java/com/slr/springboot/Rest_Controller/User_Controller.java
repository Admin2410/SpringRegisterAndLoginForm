package com.slr.springboot.Rest_Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slr.springboot.Model.System_User;
import com.slr.springboot.Service.UserService;

@RestController
public class User_Controller {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/userlist")
	public List<System_User> getALLUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/register")
	public String createUser(@RequestBody System_User user) {
		return userService.createUser(user);
	}
	@PostMapping("/login")
	public String loginUser(@RequestBody System_User user) {
		return userService.login(user);
	}
}
