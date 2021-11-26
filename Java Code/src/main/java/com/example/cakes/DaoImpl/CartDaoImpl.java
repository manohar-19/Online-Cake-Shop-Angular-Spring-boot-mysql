package com.example.cakes.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.cakes.Dao.CartDao;
import com.example.cakes.Utils.DbUtil;

import com.example.cakes.model.CartDetails;
import com.example.cakes.model.Category;
import com.example.cakes.model.Order;
import com.example.cakes.model.OrderDetails;
import java.time.LocalDate;

@Repository
public class CartDaoImpl implements CartDao {

	Connection connection;
	int ordId = 0;
	int currentcustId;
	boolean orderInit = false;
	int orderTotal=0;
	LocalDate myDateObj = LocalDate.now();
	// private String custId;

	@Autowired
	static List<OrderDetails> list = new ArrayList();
	
	@Autowired
	static List<CartDetails> list1 = new ArrayList();
	
	@Autowired
	static List<Order> list2 = new ArrayList();
	
	public CartDaoImpl() {
		connection = DbUtil.getConnection();
		System.out.println("connection " + connection);
		System.out.println("In constructor");
	}

	public void createOrder(int CustId) {
		System.out.println("createOrder");
		if (orderInit == false) {
			System.out.println("createOrder if");
			System.out.println("inside create order");
			String getordIdQuery = "select max(orderId) from orders;";
			int id = 0;

			try {
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(getordIdQuery);
				System.out.println("Try block running");

				while (rs.next()) {
					id = rs.getInt(1);
					System.out.println(rs.getInt(1));
				}
				++id;
				System.out.println(id);

			} catch (SQLException e) {
				// TODO Auto-generated catch block

				System.out.println(id);
			}

			int total = 0;
			String insertOrderQuerry = "insert into orders values (" + id + ",'" + myDateObj + "'," + CustId + ","
					+ total + ");";

			System.out.println(insertOrderQuerry);
			Statement stmt;
			try {
				stmt = connection.createStatement();
				stmt.executeUpdate(insertOrderQuerry);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			ordId = id;
			this.currentcustId = CustId;
			orderInit = true;
		} else {
			System.out.println("order not initialized");
		}

	}

	public void addToCart(int prodId, int qty) {

		int total = 0;
		//
		String insertOrderDetailsQuerry = "insert into orderdetails values (" + ordId + ",'" + prodId + "','"
				+ this.currentcustId + "'," + qty + "," + "(select pricePerKg from products where prodid=" + prodId
				+ ")*" + qty + ",'happy Birthday');";

		String sumQuery = "select sum(orderPrice) from orderdetails where orderId='" + ordId + "';";
		System.out.println(sumQuery);
		System.out.println(insertOrderDetailsQuerry);
		Statement stmt;
		try {
			stmt = connection.createStatement();
			stmt.executeUpdate(insertOrderDetailsQuerry);

			ResultSet rs = stmt.executeQuery(sumQuery);

			while (rs.next()) {
				total = rs.getInt(1);
				System.out.println(rs.getInt(1));

			}
			orderTotal=total;
			String sumInOrder = "UPDATE orders SET total = '" + total + "' WHERE orderId='" + ordId + "';";
			stmt.executeUpdate(sumInOrder);
			System.out.println("add to cart Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int Logout() {
		System.out.println("inside logout");
		orderInit=false;
		int total=0;
		String checkTotal = "select total from orders where orderId='" + ordId + "';";
		System.out.println(checkTotal);
		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(checkTotal);
			while (rs.next()) {
				total = rs.getInt(1);
				System.out.println(rs.getInt(1));
			}
			if(total==0) {
				String deleteOrder=	"DELETE FROM orders WHERE orderId='"+ordId+"';";
				stmt.executeUpdate(deleteOrder);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		System.out.println("logout Successfull");
		return 1;
	}

	
	@Override
	public List<CartDetails> getCartDetails() {
		String getCartDetails = "select  products.image, products.ProdName,products.pricePerkg, orderdetails.orderQuantity,orderdetails.orderPrice,products.ProdId from products,orderdetails\r\n" + 
				"where products.ProdId=orderdetails.prodId and orderId='"+ordId+"';";
		list1.clear();

		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(getCartDetails);

			while (rs.next()) {
				CartDetails cartDetails = new CartDetails();
				
				cartDetails.setImage(rs.getString(1));
				cartDetails.setProdName(rs.getString(2));
				cartDetails.setPricePerKg(rs.getInt(3));
				cartDetails.setOrderQuantity(rs.getInt(4));
				cartDetails.setOrderPrice(rs.getInt(5));
				cartDetails.setProdId(rs.getInt(6));
				list1.add(cartDetails);
				System.out.println(list1);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

		return list1;
	}

	@Override
	public void deleteOrderDetails(int ProductId) {
		int total=0;
		String dropCartQuerry = "delete from orderdetails where orderId='" + ordId + "' and ProdId='"+ProductId+"'";
			System.out.println(dropCartQuerry);
			
			String sumQuery = "select sum(orderPrice) from orderdetails where orderId='" + ordId + "';";
			System.out.println(sumQuery);
		Statement stmt;
		try {
			stmt = connection.createStatement();
			stmt.executeUpdate(dropCartQuerry);
			System.out.println("deleted successfully");
			
			ResultSet rs = stmt.executeQuery(sumQuery);

			while (rs.next()) {
				total = rs.getInt(1);
				System.out.println(rs.getInt(1));

			}
			String sumInOrder = "UPDATE orders SET total = '" + total + "' WHERE orderId='" + ordId + "';";
			stmt.executeUpdate(sumInOrder);
			
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("deleted failed");
		}
		
	}

	@Override
	public List<Order> getTotal() {
		System.out.println("Inside getTotal");
		try {
			list2.clear();
			System.out.println("Inside try");
			PreparedStatement stmt = connection.prepareStatement("select * from orders where orderId='"+ordId+"'");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Order cart = new Order();
				System.out.println("Inside while");
				cart.setOrderId(rs.getInt(1));
				cart.setOrderDate(rs.getString(2));
				cart.setCustID(rs.getInt(3));
				cart.setTotal(rs.getInt(4));
				System.out.println("Inside while-2");
				list2.add(cart);
				System.out.println(list2);
				
			}
		} catch (Exception e) {
			System.out.println("Failed to view in getTotal");
			System.out.println(e);
		}
		return list2;
		
		
	}

}
