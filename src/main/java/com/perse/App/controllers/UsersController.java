package com.perse.App.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.perse.App.models.entities.Users;
import com.perse.App.models.repository.UsersRepository;

@RestController
@RequestMapping("/user")
public class UsersController {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@GetMapping
	public Iterable<Users> getAll() {
		return usersRepository.findAll();
	};
	
	@PostMapping
	public @ResponseBody Users saveUser(Users user) {
		usersRepository.save(user);
		return user;
	}
//	
//	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
//	  public @ResponseBody UsersModel saveUsers(@Valid UsersModel usersModel) {
//	    usersRepository.save(usersModel);
//	    return usersModel;
//	  }
}
