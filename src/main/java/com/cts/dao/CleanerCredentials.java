package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.CleanerBean;

@Repository
public interface CleanerCredentials extends JpaRepository<CleanerBean,String>{

}
