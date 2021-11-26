package com.example.cakes.model;

public class Customer {
	private int custId;
	private String custName;
	private String custDob;
	private String custUserName;
	private String custPassword;
	private String custPhone;
	private String custEmail;
	private String custAddress;
	private String securityQuestion;
	
	public Customer() {
		super();
		
	}

	

	public Customer(int custId, String custName, String custDob, String custUserName, String custPassword,
			String custPhone, String custEmail, String custAddress, String securityQuestion) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custDob = custDob;
		this.custUserName = custUserName;
		this.custPassword = custPassword;
		this.custPhone = custPhone;
		this.custEmail = custEmail;
		this.custAddress = custAddress;
		this.securityQuestion = securityQuestion;
	}



	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustDob() {
		return custDob;
	}

	public void setCustDob(String custDob) {
		this.custDob = custDob;
	}

	public String getCustUserName() {
		return custUserName;
	}

	public void setCustUserName(String custUserName) {
		this.custUserName = custUserName;
	}

	public String getCustPassword() {
		return custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	
	public String getSecurityQuestion() {
		return securityQuestion;
	}



	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}



	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custDob=" + custDob + ", custUserName="
				+ custUserName + ", custPassword=" + custPassword + ", custPhone=" + custPhone + ", custEmail="
				+ custEmail + ", custAddress=" + custAddress + ", securityQuestion=" + securityQuestion + "]";
	}
	
}
