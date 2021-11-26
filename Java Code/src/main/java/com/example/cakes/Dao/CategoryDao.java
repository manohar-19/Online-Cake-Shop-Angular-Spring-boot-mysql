package com.example.cakes.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.cakes.model.Category;

@Repository
public interface CategoryDao {
	public List<Category> getCategory();
	public void addCategory(Category category);
	public void deleteCategory(int id);
	public void updateCategory(Category category);
	
}
