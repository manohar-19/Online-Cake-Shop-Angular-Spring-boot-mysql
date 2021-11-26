package com.example.cakes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cakes.Dao.OrderDao;
import com.example.cakes.DaoImpl.OrderDaoImpl;
import com.example.cakes.model.Order;
import com.example.cakes.model.Product;


@RestController
public class OrderController {
	@Autowired
	OrderDao obj;
	
	@GetMapping("/ord")
	public List getOrder() {
		return obj.getOrder();
	}

	@RequestMapping(value = "/ord", method = RequestMethod.POST)
	public void addOrder(@RequestBody Order order) {
		obj.addOrder(order);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/ord/{id}")
	public void deleteOrder(@PathVariable int id) {
		obj.deleteOrder(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/ord")
	public void updateOrder(@RequestBody Order order) {
		obj.updateOrder(order);
	}
}
