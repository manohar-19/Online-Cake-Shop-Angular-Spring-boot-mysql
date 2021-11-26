package com.example.cakes.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.cakes.model.Order;

@Repository
public interface OrderDao {
	public List<Order> getOrder();
	public void addOrder(Order order);
	public void deleteOrder(int id);
	public void updateOrder(Order order);
}
