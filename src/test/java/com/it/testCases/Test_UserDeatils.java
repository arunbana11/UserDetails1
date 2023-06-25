package com.it.testCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;

import com.it.binding.UserBinding;
import com.it.entities.UserDetailsEntity;
import com.it.repo.UserRepo;
import com.it.service.UserService;

@SpringBootTest(classes = Test_UserDeatils.class)
public class Test_UserDeatils {

	@Mock
	UserRepo userRepo;
	@InjectMocks
	UserService userService;
	List<UserBinding> bindings = new ArrayList<>();
	List<UserDetailsEntity> detailsEntities = new ArrayList<>();
	UserBinding userBinding = new UserBinding();

	@Test
	@Disabled
	void test_saveUser() {
		UserBinding userBinding = new UserBinding();
		userBinding.setName("arun");
		userBinding.setCity("adoni");
		userBinding.setEmail("arun@gmail");
		userBinding.setPwd("123");
		userBinding.setSalary(25000.00);

		UserDetailsEntity userDetailsEntity = new UserDetailsEntity();
		BeanUtils.copyProperties(userBinding, userDetailsEntity);
		userDetailsEntity.setUserId(111);
		when(userRepo.save(any(UserDetailsEntity.class))).thenReturn(userDetailsEntity);
		Integer userId = userService.saveUser(userBinding);
		assertEquals(userDetailsEntity.getUserId(), userId);

	}

	@BeforeEach
	void before() {
		List<UserDetailsEntity> detailsEntities = new ArrayList<>();
		detailsEntities.add(new UserDetailsEntity(111, "arun", "adoni", "123", "arun@gmail", 25000.00));
		detailsEntities.add(new UserDetailsEntity(222, "tharak", "hyd", "876", "tharak@gmail", 25000.00));
		List<UserBinding> bindings = new ArrayList<>();
		detailsEntities.forEach(details -> {
			BeanUtils.copyProperties(details, userBinding);
			bindings.add(userBinding);
		});

	}
@Test
	void test_getUserDetails()
	{
		when(userRepo.findAll()).thenReturn(detailsEntities);
		List<UserBinding> userDetails = userService.getUserDetails();
		int entitySize = detailsEntities.size();
		int bindingSize = userDetails.size();
		assertEquals(entitySize, bindingSize);
	}

}
