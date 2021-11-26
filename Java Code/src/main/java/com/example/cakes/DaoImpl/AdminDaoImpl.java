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

import com.example.cakes.Dao.AdminDao;
import com.example.cakes.Utils.DbUtil;
import com.example.cakes.model.Admin;
import com.example.cakes.model.AdminOrderDetails;
import com.example.cakes.model.CartDetails;
import com.example.cakes.model.Category;
@Repository
public class AdminDaoImpl implements AdminDao{
	@Autowired
	static List<Admin> list = new ArrayList();
	
	@Autowired
	static List<AdminOrderDetails> list1 = new ArrayList();
	Connection connection;

	public AdminDaoImpl() {
		connection = DbUtil.getConnection();
		System.out.println("Connection" + connection);
	}

	@Override
	public List<Admin> getAdmin() {
		System.out.println("Inside viewAll Admin");
		try {

			System.out.println("Inside try");
			PreparedStatement stmt = connection.prepareStatement("select * from admin");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Admin admin = new Admin();
				System.out.println("Inside while");
				admin.setAdminId(rs.getInt(1));
				admin.setAdminUserName(rs.getString(2));
				admin.setAdminPass(rs.getString(3));
				System.out.println("Inside while-2");
				list.add(admin);
				System.out.println(list);
			}
		} catch (Exception e) {
			System.out.println("Failed to view in Admin");
			System.out.println(e);
		}
		return list;
	}

	@Override
	public void addAdmin(Admin admin) {
		System.out.println("Inside addAdmin");
		int adminId = admin.getAdminId();
		String adminUserName = admin.getAdminUserName();
		String adminPass = admin.getAdminPass();
		String Query = "insert into admin(adminUserName,adminPass) values('" + adminUserName + "','" + adminPass + "')";

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
	public void deleteAdmin(int id) {
		System.out.println("Inside deleteAdmin");
		String query = "DELETE FROM admin WHERE adminId='" + id + "';";

		try {
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.executeUpdate();
			System.out.println("admin Deleted Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("admin Delete FAILED");
		}
		
	}

	@Override
	public void updateAdmin(Admin admin) {
		System.out.println("Inside updateAdmin");
		int adminId = admin.getAdminId();
		String adminUserName = admin.getAdminUserName();
		String adminPass = admin.getAdminPass();

		String Query = "update  admin set adminUserName='" + adminUserName + "',adminPass='" + adminPass + "'where adminId='" + adminId + "'";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(Query);
			stmt.executeUpdate();
			System.out.println("Admin update Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Admin update FAILED");
		}
		
	}

	@Override
	public int AdminloginValidation(String username, String password) {
		int flag = 0;
		System.out.println("Inside viewAll customer");

		try {
			PreparedStatement stmt = connection
					.prepareStatement("select * from admin where  adminUserName='" + username + "'");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				if (rs.getString(2).equals(username) && rs.getString(3).equals(password)) {
					Admin admin=new Admin();
					System.out.println("Inside while");
					admin.setAdminId(rs.getInt(1));
					admin.setAdminUserName(rs.getString(2));
					admin.setAdminPass(rs.getString(3));
					
					System.out.println("Admin Login Successfully");
					flag = 1;
				} else {
					System.out.println("enter Valid Credentials");
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

		return flag;
	}

	@Override
	public List<AdminOrderDetails> getAdminOrderDetails() {
		String getAdminOrderDetails = "select orderdetails.orderId, products.image, products.ProdName, orderdetails.orderQuantity,orderdetails.orderPrice,customer.custName,customer.custPhone,customer.custAddress,orders.orderDate from products,orderdetails,customer,orders\r\n" + 
				"where products.ProdId=orderdetails.prodId  and orderdetails.custId=customer.custId and orders.orderId=orderdetails.orderId;";
		list1.clear();

		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(getAdminOrderDetails);

			while (rs.next()) {
				AdminOrderDetails AODobj = new AdminOrderDetails();
				
				AODobj.setOrderId(rs.getInt(1));
				
				AODobj.setImage(rs.getString(2));
				AODobj.setProdName(rs.getString(3));
				AODobj.setOrderQuantity(rs.getInt(4));
				AODobj.setOrderPrice(rs.getInt(5));
				AODobj.setCustName(rs.getString(6));
				AODobj.setCustPhone(rs.getString(7));
				AODobj.setCustAddress(rs.getString(8));
				System.out.println(rs.getString(8));
				AODobj.setDate(rs.getString(9));
				list1.add(AODobj);
				System.out.println(list1);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

		return list1;
	}
	
}
