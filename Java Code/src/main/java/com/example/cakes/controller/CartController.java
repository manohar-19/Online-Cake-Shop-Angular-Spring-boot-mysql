package com.example.cakes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cakes.Dao.CartDao;
import com.example.cakes.DaoImpl.CartDaoImpl;
import com.example.cakes.DaoImpl.CustomerDaoImpl;

import com.example.cakes.model.CartDetails;
import com.example.cakes.model.Order;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CartController {
	
	@Autowired
	CartDao cartDao;
	
	@Autowired
	CustomerDaoImpl cust;
	
	
	@GetMapping("/userLogin")
	public int userLogin()
	{
		System.out.println(cust.getcustId());
		cartDao.createOrder(cust.getcustId());
		return 1;
		
	}
	
	@GetMapping("/addCart/{id}/{qty}")
	public int addCart(@PathVariable ("id") int ProdId,@PathVariable ("qty") int qty)
	{
		cartDao.addToCart(ProdId,qty);
		return 1;
	}
	
	@GetMapping("/viewCart")
	public List<CartDetails> viewCart()
	{
		return cartDao.getCartDetails();
	}

	@RequestMapping(method = RequestMethod.DELETE,value="/remove/{ProdId}")
	public int flush(@PathVariable ("ProdId") int ProdId)
	{
		
		System.out.println("inside remove");
		cartDao.deleteOrderDetails(ProdId);
		return 1;
	}
	
	@GetMapping("/Logout")
	public int Logout()
	{
		return cartDao.Logout();
	}
	
	@GetMapping("/total")
	public List<Order> Total()
	{
		return cartDao.getTotal();
	}
}
