package com.example.cakes.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.cakes.Dao.CustomerDao;
import com.example.cakes.Utils.DbUtil;
import com.example.cakes.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	static List<Customer> list = new ArrayList();

	Connection connection;

	Customer currentCust = new Customer();

	public CustomerDaoImpl() {
		connection = DbUtil.getConnection();
		System.out.println("Connection" + connection);
	}

	@Override
	public List<Customer> getCustomer() {
		list.clear();
		System.out.println("Inside viewAll customer");
		try {

			System.out.println("Inside try");
			PreparedStatement stmt = connection
					.prepareStatement("select * from customer where custId='" + currentCust.getCustId() + "'");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Customer cust = new Customer();
				System.out.println("Inside while");
				cust.setCustId(rs.getInt(1));
				cust.setCustName(rs.getString(2));
				cust.setCustDob(rs.getString(3));
				cust.setCustUserName(rs.getString(4));
				cust.setCustPassword(rs.getString(5));
				cust.setCustPhone(rs.getString(6));
				cust.setCustEmail(rs.getString(7));
				cust.setCustAddress(rs.getString(8));
				cust.setSecurityQuestion(rs.getString(9));
				System.out.println("Inside while-2");
				list.add(cust);
				System.out.println(list);
			}
		} catch (Exception e) {
		}
		return list;
	}

	@Override
	public int loginValidation(String username, String password) {
		int flag = 0;
		System.out.println("Inside viewAll customer");

		try {
			PreparedStatement stmt = connection
					.prepareStatement("select * from customer where  custUserName='" + username + "'");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				if (rs.getString(4).equals(username) && rs.getString(5).equals(password)) {

					System.out.println("Inside while");
					currentCust.setCustId(rs.getInt(1));
					currentCust.setCustName(rs.getString(2));
					currentCust.setCustDob(rs.getString(3));
					currentCust.setCustUserName(rs.getString(4));
					currentCust.setCustPassword(rs.getString(5));
					currentCust.setCustPhone(rs.getString(6));
					currentCust.setCustEmail(rs.getString(7));
					currentCust.setCustAddress(rs.getString(8));
					currentCust.setSecurityQuestion(rs.getString(9));
					System.out.println("Login Successfully");
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
	public void addCustomer(Customer customer) {
		System.out.println("Inside addCustomer");
		int custId = customer.getCustId();
		String custName = customer.getCustName();
		String custDob = customer.getCustDob();
		String custUserName = customer.getCustUserName();
		String custPassword = customer.getCustPassword();
		String custPhone = customer.getCustPhone();
		String custEmail = customer.getCustEmail();
		String custAddress = customer.getCustAddress();
		String securityQuestion=customer.getSecurityQuestion();
		String SignUpQuery = "insert into customer(custName,custDob,custUserName,custPassword,custPhone,custEmail,custAddress,securityQuestion) "
				+ "values('" + custName + "','" + custDob + "','" + custUserName + "','" + custPassword + "','"
				+ custPhone + "','" + custEmail + "','" + custAddress + "','"+securityQuestion+"')";
		try {
			PreparedStatement stmt = connection.prepareStatement(SignUpQuery);
			stmt.executeUpdate();
			System.out.println("Customer Added Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Customer Add FAILED");
		}

	}

	@Override
	public void deleteCustomer(int id) {
		System.out.println("Inside deleteCustomer");
		String query = "DELETE FROM customer WHERE custId='" + id + "';";

		try {
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.executeUpdate();
			System.out.println("Customer Deleted Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Customer Delete FAILED");
		}

	}

	@Override
	public void updateCustomer(Customer customer) {
		System.out.println("Inside UpdateCustomer");
		int custId = customer.getCustId();
		String custName = customer.getCustName();
		String custDob = customer.getCustDob();
		String custUserName = customer.getCustUserName();
		String custPassword = customer.getCustPassword();
		String custPhone = customer.getCustPhone();
		String custEmail = customer.getCustEmail();
		String custAddress = customer.getCustAddress();
		String securityQuestion=customer.getSecurityQuestion();
		String UpdateQuery = "update  customer set custName='" + custName + "',custDob='" + custDob + "',custUserName='"
				+ custUserName + "',custPassword='" + custPassword + "',custPhone='" + custPhone + "'," + "custEmail='"
				+ custEmail + "',custAddress='" + custAddress + "',securityQuestion='"+securityQuestion+"' where custId='" + currentCust.getCustId() + "';";

		try {
			PreparedStatement stmt = connection.prepareStatement(UpdateQuery);
			stmt.executeUpdate();
			System.out.println("Customer Updated Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Customer Update Failed");
			System.out.println(e);

		}

	}

	@Override
	public void updateCustomerPassword(String password) {
		System.out.println("Inside updateCustomer Password");
		String UpdatePassQuery = "update  customer set custPassword='" + password + "'where custId='"
				+ currentCust.getCustId() + "'";

		try {
			PreparedStatement stmt = connection.prepareStatement(UpdatePassQuery);
			stmt.executeUpdate();
			System.out.println("Customer password Updated Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Customer password Update Failed");
			System.out.println(e);

		}

	}

	public int getcustId() {
		System.out.println(currentCust.getCustId());
		return currentCust.getCustId();
	}

	@Override
	public int securityQuestionValidation(String username, String answer, String password) {
		int flag = 0;
		System.out.println("Inside securityQuestionValidation");

		try {
			PreparedStatement stmt = connection
					.prepareStatement("select * from customer where  custUserName='" + username + "'");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				if (rs.getString(4).equals(username) && rs.getString(9).equals(answer)) {

					System.out.println("Inside updateCustomer Password");

					String UpdatePassQuery = "update  customer set custPassword='" + password + "'where custUserName='"
							+ username + "'";
					PreparedStatement stmt1 = connection.prepareStatement(UpdatePassQuery);
					stmt1.executeUpdate();
					System.out.println("Customer password Updated Successfully");
					flag = 1;
				} else {
					System.out.println(" updateCustomer Password failed");
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

		return flag;

	}

}
