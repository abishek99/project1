package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.UserBean;

@Repository
public interface UserCredentials extends JpaRepository<UserBean,String>{

	
	@Query("select u from UserBean u where u.userId=:userName AND u.password=:password")
	public UserBean validateUser(String userName,String password);

	}


