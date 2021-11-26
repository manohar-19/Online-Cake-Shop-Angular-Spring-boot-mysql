package com.example.cakes.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.cakes.Dao.CategoryDao;
import com.example.cakes.Utils.DbUtil;
import com.example.cakes.model.Category;
import com.example.cakes.model.Customer;

@Repository
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	static List<Category> list = new ArrayList();

	Connection connection;

	public CategoryDaoImpl() {
		connection = DbUtil.getConnection();
		System.out.println("Connection" + connection);
	}

	@Override
	public List<Category> getCategory() {
		System.out.println("Inside viewAll Category");
		try {
			list.clear();
			System.out.println("Inside try");
			PreparedStatement stmt = connection.prepareStatement("select * from category");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Category cat = new Category();
				System.out.println("Inside while");
				cat.setCatId(rs.getInt(1));
				cat.setCatName(rs.getString(2));
				cat.setImage(rs.getString(3));
				System.out.println("Inside while-2");
				list.add(cat);
				System.out.println(list);
				
			}
		} catch (Exception e) {
			System.out.println("Failed to view in Category");
			System.out.println(e);
		}
		return list;
		
		
	}

	@Override
	public void addCategory(Category category) {
		System.out.println("Inside addCategory");
		int catId = category.getCatId();
		String catName = category.getCatName();

		String Query = "insert into category(catName) values('" + catName + "')";

		try {
			PreparedStatement stmt = connection.prepareStatement(Query);
			stmt.executeUpdate();
			System.out.println("Category Added Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Category Add FAILED");
		}

	}

	@Override
	public void deleteCategory(int id) {
		System.out.println("Inside deleteCategory");
		String query = "DELETE FROM category WHERE catId='" + id + "';";

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
	public void updateCategory(Category category) {
		System.out.println("Inside updateCategory");
		int catId = category.getCatId();
		String catName = category.getCatName();

		String Query = "update  category set catName='" + catName + "'where catId='" + catId + "'";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(Query);
			stmt.executeUpdate();
			System.out.println("Category update Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Category update FAILED");
		}
	}

}
