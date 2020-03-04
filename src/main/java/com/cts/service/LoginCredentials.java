package com.cts.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.UserBean;

@Repository
public interface LoginCredentials extends JpaRepository<UserBean, String>{

}
