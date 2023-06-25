package com.it.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.binding.UserBinding;
import com.it.entities.UserDetailsEntity;
import com.it.repo.UserRepo;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public Integer saveUser(UserBinding userBinding) {
		UserDetailsEntity userDetailsEntity = new UserDetailsEntity();
		BeanUtils.copyProperties(userBinding, userDetailsEntity);
		UserDetailsEntity detailsEntity = userRepo.save(userDetailsEntity);

		return detailsEntity.getUserId();
	}

}
