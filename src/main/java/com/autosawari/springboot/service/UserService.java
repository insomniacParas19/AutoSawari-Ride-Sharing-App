package com.autosawari.springboot.service;

import com.autosawari.springboot.model.User;

public interface UserService {

	void userSignup(User user);
	
	User userLogin(String un, String psw);
}
