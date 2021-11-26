package com.example.cakes.model;

public class Admin {
	private int adminId;
	private String adminUserName;
	private String adminPass;
	 public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int adminId, String adminUserName, String adminPass) {
		super();
		this.adminId = adminId;
		this.adminUserName = adminUserName;
		this.adminPass = adminPass;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminUserName() {
		return adminUserName;
	}
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminUserName=" + adminUserName + ", adminPass=" + adminPass + "]";
	}
	
	
}
