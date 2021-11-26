package com.example.cakes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cakes.Dao.CustomerDao;
import com.example.cakes.DaoImpl.CustomerDaoImpl;
import com.example.cakes.model.Customer;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerController {
	@Autowired
	CustomerDao obj;
	
	@GetMapping("/cust")
	public List getCustomer() {
		return obj.getCustomer();
	}
	
	@GetMapping("cust/{custUserName}/{custPassword}")
	public int CustomerLogin(@PathVariable("custUserName") String custUserName, @PathVariable("custPassword") String custPassword) {
		
		int flag=obj.loginValidation(custUserName, custPassword);
		if(flag==0) {
			return flag;
		}
		return flag;
	}
	
	@PostMapping(value = "/custAdd")
	public void addCustomer(@RequestBody Customer customer){

		obj.addCustomer(customer);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/cust/{id}")
	public void deleteCustomer(@PathVariable int id) {
		obj.deleteCustomer(id);
	}
	
	@PutMapping(value="/cust")
	public void updateCustomer(@RequestBody Customer customer) {
		obj.updateCustomer(customer);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/custPassUpdate/{password}")
	public void updatePassword(@PathVariable("password") String password) {
		obj.updateCustomerPassword(password);
	}
	
	@GetMapping("passwordUpdate/{custUserName}/{answer}/{custPassword}")
	public int PasswordUpdate(@PathVariable("custUserName") String custUserName,@PathVariable("answer") String answer, @PathVariable("custPassword") String custPassword) {
		
		int flag=obj.securityQuestionValidation(custUserName, answer, custPassword);
		if(flag==0) {
			System.out.println("password update failed");
			return flag;
		}
		return flag;
	}
}
