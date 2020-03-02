package com.cts.model;

import java.io.Serializable;

public class ProfileBean implements Serializable{
	
	private String userName;
	
	private String password;
	
	public ProfileBean() {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ProfileBean(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	
}
