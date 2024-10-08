package com.autosawari.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autosawari.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsernameAndPassword(String un, String psw);
}
