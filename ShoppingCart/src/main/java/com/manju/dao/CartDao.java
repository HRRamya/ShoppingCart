package com.manju.dao;

import java.util.List;

import com.manju.model.Cart;
import com.manju.model.Product;

public interface CartDao {
	int saveOrUpdate(Cart cart);
	   List<Cart>getAllCart();
	   int deleteById(int cartId);
//	   Cart getByProductId(int productId);
	  
}
