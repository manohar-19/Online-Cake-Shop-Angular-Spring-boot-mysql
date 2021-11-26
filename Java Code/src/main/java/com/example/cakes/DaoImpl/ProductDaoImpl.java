package com.example.cakes.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.cakes.Dao.ProductDao;
import com.example.cakes.Utils.DbUtil;
import com.example.cakes.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	static List<Product> list = new ArrayList();
	
	Connection connection;
	
	public ProductDaoImpl() {
		connection = DbUtil.getConnection();
		System.out.println("Connection" + connection);
	}
	@Override
	public List<Product> getProduct(int id) {
		list.clear();
		System.out.println("Inside viewAll Product");
		try {

			System.out.println("Inside try");
			PreparedStatement stmt = connection.prepareStatement("select * from products where catId='"+id+"'");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Product prod = new Product();
				System.out.println("Inside while");
				prod.setProdId(rs.getInt(1));
				prod.setProdName(rs.getString(2));
				prod.setPricePerkg(rs.getInt(3));
				prod.setDescription(rs.getString(4));
				prod.setCatId(rs.getInt(5));
				prod.setImage(rs.getString(6));
				System.out.println("Inside while-2");
				list.add(prod);
				System.out.println(list);
			}
		} catch (Exception e) {
		}
		return list;
	}
	
	@Override
	public List<Product> getProducts() {
		System.out.println("Inside viewAll Product");
		try {
			list.clear();
			System.out.println("Inside try");
			PreparedStatement stmt = connection.prepareStatement("select * from products ");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Product prod = new Product();
				System.out.println("Inside while");
				prod.setProdId(rs.getInt(1));
				prod.setProdName(rs.getString(2));
				prod.setPricePerkg(rs.getInt(3));
				prod.setDescription(rs.getString(4));
				prod.setCatId(rs.getInt(5));
				prod.setImage(rs.getString(6));
				System.out.println("Inside while-2");
				list.add(prod);
				System.out.println(list);
			}
		} catch (Exception e) {
		}
		return list;
	}
	
	@Override
	public void addProduct(Product product) {
		System.out.println("Inside addCustomer");
		int ProdId=product.getProdId();
		String ProdName=product.getProdName();
		int pricePerkg=product.getPricePerkg();
		String description=product.getDescription();
		int catId=product.getCatId();
		

		String SignUpQuery = "insert into products(ProdName,pricePerkg,description,catId) "
				+ "values('" + ProdName + "','" + pricePerkg + "','" + description + "','" + catId + "')";
		try {
			PreparedStatement stmt = connection.prepareStatement(SignUpQuery);
			stmt.executeUpdate();
			System.out.println("Product Added Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Product Add FAILED");
		}

		
	}
	@Override
	public void deleteProduct(int id) {
		System.out.println("Inside deleteProduct");
		String query = "DELETE FROM products WHERE ProdId='" + id + "';";

		try {
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.executeUpdate();
			System.out.println("Product Deleted Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Product Delete FAILED");
		}
		
	}
	@Override
	public void updateProduct(Product product) {
		System.out.println("Inside updateProduct");
		int ProdId=product.getProdId();
		String ProdName=product.getProdName();
		int pricePerkg=product.getPricePerkg();
		String description=product.getDescription();
		int catId=product.getCatId();

		String UpdateQuery = "update  products set ProdName='" + ProdName + "',pricePerkg='" + pricePerkg + "',description='"
				+ description + "',catId='" + catId + "';";

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
	public List<Product> getSingleProducts(int id) {
		list.clear();
		System.out.println("Inside viewsingle Product");
		try {

			System.out.println("Inside try");
			PreparedStatement stmt = connection.prepareStatement("select * from products where prodId='"+id+"'");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Product prod = new Product();
				System.out.println("Inside while");
				prod.setProdId(rs.getInt(1));
				prod.setProdName(rs.getString(2));
				prod.setPricePerkg(rs.getInt(3));
				prod.setDescription(rs.getString(4));
				prod.setCatId(rs.getInt(5));
				prod.setImage(rs.getString(6));
				System.out.println("Inside while-2");
				list.add(prod);
				System.out.println(list);
			}
		} catch (Exception e) {
		}
		return list;
	}
	
}
