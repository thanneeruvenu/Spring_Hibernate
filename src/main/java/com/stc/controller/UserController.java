package com.stc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stc.domain.User;
import com.stc.service.user.UserService;

@Controller
@RequestMapping(value = "/user")
@Transactional
public class UserController {

	@Autowired
	UserService userServiceImpl; 
	
	@RequestMapping
	@Transactional(readOnly = true)
 	public String getMessage() {
		System.out.println("User controller");
		return "index";
	}
	
	@RequestMapping(value = "/save")
 	public String save() {
	
		User user = new User();
		user.setAge(28);
		user.setName("Hello");	
		
		userServiceImpl.save(user);
		System.out.println("User controller save"); 

		return "index";
	}

	@RequestMapping(value = "/update/{id}")
	public String update(@PathVariable Integer id) {
		User user = userServiceImpl.find(id);
		user.setAge(29);
		userServiceImpl.update(user);
		System.out.println("User controller update");
		return "index";
	}
	
	@RequestMapping(value = "/show/{id}")
	@Transactional(readOnly = true)
	public String show(@PathVariable Integer id) {
		User user = userServiceImpl.find(id);
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getAge());
		System.out.println("User controller show");

		return "index";
	}
	

	@RequestMapping(value = "/list")
	@Transactional(readOnly = true)
	public String list() {
		
		return "index";
	}

}
