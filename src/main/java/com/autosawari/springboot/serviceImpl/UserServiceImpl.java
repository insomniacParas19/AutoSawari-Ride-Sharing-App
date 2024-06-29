package com.autosawari.springboot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autosawari.springboot.model.User;
import com.autosawari.springboot.repository.UserRepository;
import com.autosawari.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void userSignup(User user) {
	
		userRepo.save(user);
		
	}

	@Override
	public User userLogin(String un, String psw) {
		
		
		return userRepo.findByUsernameAndPassword(un, psw);
	}

}
