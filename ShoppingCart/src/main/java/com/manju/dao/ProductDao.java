package com.manju.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.manju.model.Product;


public interface ProductDao 
{
	
	int saveOrUpdate(Product product);
	List<Product>getAllProduct();
	   int deleteById(int productId);
	   Product getByProductId(int productId);
	   
}
