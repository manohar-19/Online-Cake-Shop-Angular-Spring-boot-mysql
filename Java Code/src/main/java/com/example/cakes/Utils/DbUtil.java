package com.example.cakes.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private static Connection connection = null;  //for using same connection

	public static Connection getConnection() {
		if (connection != null)
			return connection;
		else {

			try {
				String driver = "com.mysql.cj.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/cake?useSSL=false";
				String user = "root";
				String password = "Welcome@123";
				Class.forName(driver);
				connection = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}

	}

}
