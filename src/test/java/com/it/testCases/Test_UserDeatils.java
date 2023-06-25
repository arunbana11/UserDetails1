package com.it.testCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
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

	@Test
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

}
