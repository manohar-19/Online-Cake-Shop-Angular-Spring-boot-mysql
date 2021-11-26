package com.example.cakes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cakes.Dao.AdminDao;


import com.example.cakes.model.Admin;
import com.example.cakes.model.AdminOrderDetails;
import com.example.cakes.model.CartDetails;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminController {
	@Autowired
	AdminDao obj;

	@GetMapping("/admin")
	public List getAdmin() {
		return obj.getAdmin();
	}

	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public void addCategory(@RequestBody Admin admin) {

		obj.addAdmin(admin);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/admin/{id}")
	public void deleteCategory(@PathVariable int id) {
		obj.deleteAdmin(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/admin")
	public void updateCategory(@RequestBody Admin admin) {
		obj.updateAdmin(admin);
	}
	
	
	@GetMapping("admin/{UserName}/{Password}")
	public int CustomerLogin(@PathVariable("UserName") String UserName, @PathVariable("Password") String Password) {
		
		int flag=obj.AdminloginValidation(UserName, Password);
		if(flag==0) {
			return flag;
		}
		return flag;
	}
	
	@GetMapping("/adminOrder")
	public List<AdminOrderDetails> viewOrderDetails()
	{
		return obj.getAdminOrderDetails();
	}
}
