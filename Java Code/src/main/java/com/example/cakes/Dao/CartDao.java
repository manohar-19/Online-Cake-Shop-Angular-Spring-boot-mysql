package com.example.cakes.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.cakes.model.Cart;
import com.example.cakes.model.CartDetails;
import com.example.cakes.model.Order;
import com.example.cakes.model.OrderDetails;

@Repository
public interface CartDao {
	public void addToCart(int prodId,int qty);
	public void createOrder(int CustId);
	public void deleteOrderDetails(int ProductId);
	public List<CartDetails> getCartDetails();
	public int Logout();
	public List<Order> getTotal();

}
