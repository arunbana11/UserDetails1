package com.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.entities.UserDetailsEntity;

public interface UserRepo extends JpaRepository<UserDetailsEntity, Integer> {

}
