package com.example.cakes.model;

public class OrderDetails {
	private int orderId;
	private int prodId;
	private int custid;
	private int orderQuantity;
	private int orderPrice;
	private String message;
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetails(int orderId, int prodId, int custid, int orderQuantity, int orderPrice, String message) {
		super();
		this.orderId = orderId;
		this.prodId = prodId;
		this.custid = custid;
		this.orderQuantity = orderQuantity;
		this.orderPrice = orderPrice;
		this.message = message;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", prodId=" + prodId + ", custid=" + custid + ", orderQuantity="
				+ orderQuantity + ", orderPrice=" + orderPrice + ", message=" + message + "]";
	}
	
	
}
