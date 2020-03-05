package com.cts.model;

import java.io.Serializable;

public class ProfileBean implements Serializable{
	
	
	private String userName;
	
	private String password;
	
	private String loginAs;
	
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

	
	public String getLoginAs() {
		return loginAs;
	}

	public void setLoginAs(String loginAs) {
		this.loginAs = loginAs;
	}

	public ProfileBean(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	
}
