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

import com.example.cakes.Dao.ProductDao;
import com.example.cakes.DaoImpl.ProductDaoImpl;
import com.example.cakes.model.Category;
import com.example.cakes.model.Product;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductsController {
	@Autowired
	ProductDao obj;
	
	@GetMapping("/prod/{id}")
	public List getProduct(@PathVariable int id) {
		return obj.getProduct(id);
	}
	
	@GetMapping("/prod")
	public List getProducts() {
		return obj.getProducts();
	}
	
	@GetMapping("/singleProd/{id}")
	public List getSingleProduct(@PathVariable int id) {
		return obj.getSingleProducts(id);
	}
	

	@RequestMapping(value = "/prod", method = RequestMethod.POST)
	public void addProducts(@RequestBody Product product) {

		obj.addProduct(product);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/prod/{id}")
	public void deleteProducts(@PathVariable int id) {
		obj.deleteProduct(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/prod")
	public void updateProducts(@RequestBody Product product) {
		obj.updateProduct(product);
	}
	
}
