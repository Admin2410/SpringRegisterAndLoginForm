package com.slr.springboot.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.slr.springboot.Model.System_User;

@Service
public interface UserService {

	List<System_User> getAllUsers();

	String createUser(System_User user);

	String login(System_User user);

}
