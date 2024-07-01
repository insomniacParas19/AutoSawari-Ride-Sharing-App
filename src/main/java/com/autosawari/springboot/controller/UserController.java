package com.autosawari.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.autosawari.springboot.model.User;
import com.autosawari.springboot.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping({"/login"})
	public String getLogin(){
			
	return "LoginForm";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User user, Model model) {
		System.out.println(user.getUsername() + user.getPassword());
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		User u = userService.userLogin(user.getUsername(),user.getPassword());
		
		if(u!=null) {
			
		model.addAttribute("fullname", u.getFullname());
		return "Dashboard";
		}
		
		model.addAttribute("message", "user not registered !!");
		return "LoginForm";
	}
	
	@GetMapping("/signup")
	public String getSignup() {
		
		return "SignupForm";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user, Model model) {
		
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		userService.userSignup(user);
		
		return "LoginForm";
	}
}


