package com.sonar.issues.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonar.issues.service.UsersServise;

@RestController
@ResponseBody
public class UsersAllowedTo {
	@Autowired
	private UsersServise service;
	
	@GetMapping("/getUserCategory")
	public String checkAllowedToVote(@RequestParam int age,
			@RequestParam boolean premium,@RequestParam boolean active) {
		return service.getUserCategory(age,premium,active);
	}
	@GetMapping("/processUser")
	public void ProcessUser(@RequestParam(required=false) String userName) {
		service.processUser(userName);
	}
}
