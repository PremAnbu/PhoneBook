package com.jsp.phonebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.phonebook.entity.User;
import com.jsp.phonebook.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public ModelAndView saveUserRequest() {
		ModelAndView mav = new ModelAndView("add-user.jsp");
		mav.addObject("user", new User());
		return mav;
	}

	public ModelAndView saveUser(User user) {
		userRepository.saveUser(user);
		return new ModelAndView("index.jsp");
	}

	public ModelAndView updateUserRequest(int userId) {
		
		User user = userRepository.getUserById(userId);
		ModelAndView mav = new ModelAndView("update-user.jsp");
		mav.addObject("user", user);
		return mav;
	}

	public ModelAndView updateUser(User user) {
		userRepository.updateUser(user);
		return new ModelAndView("index.jsp");
	}
}
