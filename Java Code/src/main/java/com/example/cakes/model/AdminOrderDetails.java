package com.example.cakes.model;

public class AdminOrderDetails {
	int orderId;
	String image;
	String ProdName;
	int orderQuantity;
	int orderPrice;
	String custName;
	String custPhone;
	String custAddress;
	String date;
	public AdminOrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public AdminOrderDetails(int orderId, String image, String prodName, int orderQuantity, int orderPrice,
			String custName, String custPhone, String custAddress, String date) {
		super();
		this.orderId = orderId;
		this.image = image;
		ProdName = prodName;
		this.orderQuantity = orderQuantity;
		this.orderPrice = orderPrice;
		this.custName = custName;
		this.custPhone = custPhone;
		this.custAddress = custAddress;
		this.date = date;
	}


	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	
	
	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "AdminOrderDetails [orderId=" + orderId + ", image=" + image + ", ProdName=" + ProdName
				+ ", orderQuantity=" + orderQuantity + ", orderPrice=" + orderPrice + ", custName=" + custName
				+ ", custPhone=" + custPhone + ", custAddress=" + custAddress + ", date=" + date + "]";
	}


	

}
