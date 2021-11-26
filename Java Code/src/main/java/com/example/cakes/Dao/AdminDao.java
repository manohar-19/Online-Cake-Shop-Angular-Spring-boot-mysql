package com.example.cakes.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.cakes.model.Admin;
import com.example.cakes.model.AdminOrderDetails;

@Repository
public interface AdminDao {
	public List<Admin> getAdmin();
	public void addAdmin(Admin admin);
	public void deleteAdmin(int id);
	public void updateAdmin(Admin admin);
	public int AdminloginValidation(String username, String password);
	public List<AdminOrderDetails> getAdminOrderDetails();
}
