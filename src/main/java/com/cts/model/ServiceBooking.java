package com.cts.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;


@Entity
@Table(name="user_service")
public class ServiceBooking {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private Integer RoomCount;
	
	@NotBlank(message = "{error.blank}")
	private String street;
	
	@NotBlank(message = "{error.blank}")
	private String city;
	
	@NotBlank(message = "{error.blank}")
	private String pincode;
	
	
	@PastOrPresent(message="{error.dob.invalid}")
	private Date date;
	
	@NotBlank(message = "{error.blank}")
	private String timeSlot;
	
	@Pattern(regexp = "[0-9]{10}", message = "{error.contactNumber.invalid}")
	@NotBlank(message = "{error.blank}")
	private String contactNumber;

	public Integer getRoomCount() {
		return RoomCount;
	}

	public void setRoomCount(Integer roomCount) {
		RoomCount = roomCount;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
}
