package com.exponent.bankapplication.model;

public class AccountDetails {

	private long accountNo;
	private String name;
	private long aadharCardNo;
	private String panCard;
	private long contactNo;
	private String email;
	private double balance;
	
	
	@Override
	public String toString() {
		return "| AccountDetails \n |accountNo =" +" "+  accountNo + "\n, name =" +" "+ name + "\n, aadharCardNo=" +" "+ aadharCardNo
				+ "\n, panCard =" +" "+ panCard + "\n, contactNo =" +" "+ contactNo + "\n, email =" +" "+ email + "\n, balance =" +" "+ balance
				+ " ";
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadharCardNo() {
		return aadharCardNo;
	}
	public void setAadharCardNo(long aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
