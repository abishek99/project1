package com.cts.model;

public class UserPayment {

	private String cardType;
	
	private String type;
	
	private String cardNumber;
	
	private String name;
	
	private Integer valid;
	
	private Integer until;
	
	private Integer cvv;

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValid() {
		return valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}

	public Integer getUntil() {
		return until;
	}

	public void setUntil(Integer until) {
		this.until = until;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

}
