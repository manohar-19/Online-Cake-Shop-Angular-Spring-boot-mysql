package com.example.cakes.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.cakes.model.Product;

@Repository
public interface ProductDao {
	public List<Product> getProduct(int id);
	public List<Product> getProducts();
	public void addProduct(Product product);
	public void deleteProduct(int id);
	public void updateProduct(Product product);
	public List<Product> getSingleProducts(int id);
}
