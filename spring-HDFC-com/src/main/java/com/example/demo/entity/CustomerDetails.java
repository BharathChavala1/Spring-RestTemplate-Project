package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="CustomerDetails")
@Entity
public class CustomerDetails {
	@Id
	private int accountID;
	private String userName;
	private String password;
	private long acountNumber;
	private long cardNumber;
	private int cvv;

	public CustomerDetails() {
		super();
	}

	public CustomerDetails(int accountID, String userName, String password, long acountNumber, long cardNumber,
			int cvv) {
		super();
		this.accountID = accountID;
		this.userName = userName;
		this.password = password;
		this.acountNumber = acountNumber;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
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

	public long getAcountNumber() {
		return acountNumber;
	}

	public void setAcountNumber(long acountNumber) {
		this.acountNumber = acountNumber;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "CustomerDetails [accountID=" + accountID + ", userName=" + userName + ", password=" + password
				+ ", acountNumber=" + acountNumber + ", cardNumber=" + cardNumber + ", cvv=" + cvv + "]";
	}

}
