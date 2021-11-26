package com.example.cakes.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.cakes.Dao.OrderDao;
import com.example.cakes.Utils.DbUtil;
import com.example.cakes.model.Admin;
import com.example.cakes.model.Order;

@Repository
public class OrderDaoImpl implements OrderDao {
	@Autowired
	static List<Order> list = new ArrayList();

	Connection connection;

	public OrderDaoImpl() {
		connection = DbUtil.getConnection();
		System.out.println("Connection" + connection);
	}

	@Override
	public List<Order> getOrder() {
		System.out.println("Inside viewAll Order");
		try {

			System.out.println("Inside try");
			PreparedStatement stmt = connection.prepareStatement("select * from orders");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Order order = new Order();
				System.out.println("Inside while");
				order.setOrderId(rs.getInt(1));
				order.setOrderDate(rs.getString(2));
				order.setCustID(rs.getInt(3));
				order.setTotal(rs.getInt(4));
				System.out.println("Inside while-2");
				list.add(order);
				System.out.println(list);
			}
		} catch (Exception e) {
			System.out.println("Failed to view in Order");
			System.out.println(e);
		}
		return list;
	}

	@Override
	public void addOrder(Order order) {
		System.out.println("Inside addOrder");
		int orderId=order.getOrderId();
		String orderDate = order.getOrderDate();
		int custID = order.getCustID();
		int total=order.getTotal();
		String Query = "insert into orders(orderDate,custID,total) values('" + orderDate + "','" + custID + "','" + total + "')";

		try {
			PreparedStatement stmt = connection.prepareStatement(Query);
			stmt.executeUpdate();
			System.out.println("Admin Added Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Admin Add FAILED");
		}
		
	}

	@Override
	public void deleteOrder(int id) {
		System.out.println("Inside deleteAdmin");
		String query = "DELETE FROM orders WHERE orderId='" + id + "';";
		try {
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.executeUpdate();
			System.out.println("Order Deleted Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Order Delete FAILED");
		}
		
	}

	@Override
	public void updateOrder(Order order) {
		System.out.println("Inside updateOrder");
		int orderId=order.getOrderId();
		String orderDate = order.getOrderDate();
		int custId = order.getCustID();
		int total=order.getTotal();

		String Query = "update  orders set orderDate='" + orderDate + "',total='"+total+"',custId='" + custId + "'where orderId='" + orderId + "'";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(Query);
			stmt.executeUpdate();
			System.out.println("Order update Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Order update FAILED");
		}
		
	}
	
	
}
