package com.example.cakes.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.cakes.model.Customer;

@Repository
public interface CustomerDao {
	public List<Customer> getCustomer();	
	public int loginValidation(String username, String password);
	public void addCustomer(Customer customer);
	public void deleteCustomer(int id);
	public void updateCustomer(Customer customer);
	public void updateCustomerPassword(String password);
	public int securityQuestionValidation(String username,String answer,String password);
}
