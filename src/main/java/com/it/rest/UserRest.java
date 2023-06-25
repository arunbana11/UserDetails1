package com.it.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.binding.UserBinding;
import com.it.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserRest {

	@Autowired
	private IUserService userService;
	
	@PostMapping("/save")
	ResponseEntity<String> saveUser(@RequestBody UserBinding userBinding)
	{
		   Integer userId = userService.saveUser(userBinding);
		   String body="User  Id is "+userId+"";
		   return ResponseEntity.ok(body);
	}
	
	
}
