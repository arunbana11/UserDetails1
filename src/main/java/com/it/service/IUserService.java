package com.it.service;

import java.util.List;

import com.it.binding.UserBinding;

public interface IUserService {

	Integer saveUser(UserBinding userBinding);

	List<UserBinding> getUserDetails();
	
	
	
}
