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

import com.example.cakes.Dao.CategoryDao;
import com.example.cakes.DaoImpl.CategoryDaoImpl;
import com.example.cakes.model.Category;
import com.example.cakes.model.Customer;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CategoryController {
	@Autowired
	CategoryDao obj;

	@GetMapping("/cat")
	public List getCustomer() {
		return obj.getCategory();
	}

	@RequestMapping(value = "/cat", method = RequestMethod.POST)
	public void addCategory(@RequestBody Category category) {

		obj.addCategory(category);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/cat/{id}")
	public void deleteCategory(@PathVariable int id) {
		obj.deleteCategory(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/cat")
	public void updateCategory(@RequestBody Category category) {
		obj.updateCategory(category);
	}
}
