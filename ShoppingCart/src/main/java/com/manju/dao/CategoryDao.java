package com.manju.dao;

import java.util.List;

import com.manju.model.Category;

public interface CategoryDao {
	int saveOrUpdate(Category category);
	   List<Category>getAllCategory();
	   int deleteById(int categoryId);
	  
}
