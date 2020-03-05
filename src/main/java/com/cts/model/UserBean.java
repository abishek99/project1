package com.cts.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user_profile")
public class UserBean implements Serializable {

	@Size(max = 20, message = "{error.firstName.size}")
	@NotBlank(message = "{error.blank}")
	private String firstName;

	@Size(min = 1, max = 15, message = "{error.lastName.size}")
	@NotBlank(message = "{error.blank}")
	private String lastName;

	@Pattern(regexp="[0-9]{2}-[0-9]{2}-[0-9]{4}",message="{error.dob.invalid}")
	private String dob;

	@Pattern(regexp = "[0-9]{10}", message = "{error.contactNumber.invalid}")
	@NotBlank(message = "{error.blank}")
	private String contactNumber;
	
	
	private String gender;

	@Size(min = 3, message = "{error.userId.size}")
	@Id
	private String userId;

	@NotBlank(message = "{error.blank}")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
