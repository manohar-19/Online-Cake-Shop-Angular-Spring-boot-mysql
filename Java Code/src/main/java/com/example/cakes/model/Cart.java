package com.example.cakes.model;

public class Cart {
	private int orderId;
	private int orderDate;
	private int custId;
	private int total;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int orderId, int orderDate, int custId, int total) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.custId = custId;
		this.total = total;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(int orderDate) {
		this.orderDate = orderDate;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Cart [orderId=" + orderId + ", orderDate=" + orderDate + ", custId=" + custId + ", total=" + total
				+ "]";
	}
	
	
}
