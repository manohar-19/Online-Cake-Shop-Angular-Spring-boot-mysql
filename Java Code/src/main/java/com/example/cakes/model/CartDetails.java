package com.example.cakes.model;

public class CartDetails {
	private String image;
	private String ProdName;
	private int PricePerKg;
	private int orderQuantity;
	private int orderPrice;
	private int ProdId;
	public CartDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartDetails(String image, String prodName, int pricePerKg, int orderQuantity, int orderPrice, int prodId) {
		super(); 	
		this.image = image;
		this.ProdName = prodName;
		this.PricePerKg = pricePerKg;
		this.orderQuantity = orderQuantity;
		this.orderPrice = orderPrice;
		this.ProdId = prodId;
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
		this.ProdName = prodName;
	}
	public int getPricePerKg() {
		return PricePerKg;
	}
	public void setPricePerKg(int pricePerKg) {
		this.PricePerKg = pricePerKg;
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
	public int getProdId() {
		return ProdId;
	}
	public void setProdId(int prodId) {
		this.ProdId = prodId;
	}
	@Override
	public String toString() {
		return "CartDetails [image=" + image + ", ProdName=" + ProdName + ", PricePerKg=" + PricePerKg
				+ ", orderQuantity=" + orderQuantity + ", orderPrice=" + orderPrice + ", ProdId=" + ProdId + "]";
	}
	
}
