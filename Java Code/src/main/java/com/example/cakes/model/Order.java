package com.example.cakes.model;

public class Order {
	private int orderId;
	private String orderDate;
	private int custID;
	private int total;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, String orderDate, int custID, int total) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.custID = custID;
		this.total = total;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", custID=" + custID + ", total=" + total
				+ "]";
	}
	
	
}
