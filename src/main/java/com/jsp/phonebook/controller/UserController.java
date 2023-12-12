package com.jsp.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.phonebook.entity.User;
import com.jsp.phonebook.service.UserService;

@Controller
public class UserController 
{   
	@Autowired
	private UserService userService;
	
	@RequestMapping(path = "/add-user" ,method = RequestMethod.GET)
	public ModelAndView saveUserRequest() {
		return userService.saveUserRequest();
	}
	
	@RequestMapping(path = "/add-user" ,method = RequestMethod.POST)
	public ModelAndView saveUser(User user) {
		return userService.saveUser(user);
	}
	
	@RequestMapping(path = "/update-user",method = RequestMethod.GET)
	public ModelAndView updateUserRequest(@RequestParam int userId) {
		return userService.updateUserRequest(userId);
	}
	
	@RequestMapping(path = "/update-user",method = RequestMethod.POST)
	public ModelAndView updateUser(User user) {
		return userService.updateUser(user);
	}
}
