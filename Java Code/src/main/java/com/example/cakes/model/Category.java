package com.example.cakes.model;

public class Category {
	private int catId;
	private String catName;
	private String image;

	public Category() {
		super();
	}

	

	public Category(int catId, String catName, String image) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.image = image;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}



	@Override
	public String toString() {
		return "Category [catId=" + catId + ", catName=" + catName + ", image=" + image + "]";
	}

}
