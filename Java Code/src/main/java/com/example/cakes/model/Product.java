package com.example.cakes.model;

public class Product {
	private int ProdId;
	private String ProdName;
	private int pricePerkg;
	private int catId;
	private String description;
	private String image;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodId, String prodName, int pricePerkg, int catId, String description, String image) {
		super();
		ProdId = prodId;
		ProdName = prodName;
		this.pricePerkg = pricePerkg;
		this.catId = catId;
		this.description = description;
		this.image = image;
	}
	public int getProdId() {
		return ProdId;
	}
	public void setProdId(int prodId) {
		ProdId = prodId;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public int getPricePerkg() {
		return pricePerkg;
	}
	public void setPricePerkg(int pricePerkg) {
		this.pricePerkg = pricePerkg;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Product [ProdId=" + ProdId + ", ProdName=" + ProdName + ", pricePerkg=" + pricePerkg + ", catId="
				+ catId + ", description=" + description + ", image=" + image + "]";
	}
	
	
	
	
	
}
