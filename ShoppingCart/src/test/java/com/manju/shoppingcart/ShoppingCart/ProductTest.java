package com.manju.shoppingcart.ShoppingCart;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manju.dao.ProductDao;
import com.manju.model.Product;


public class ProductTest 
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.manju.*");
		context.refresh();
		System.out.println("Done");
//		//FETCHING DATA TEST--------------------------
				ProductDao productDao=(ProductDao) context.getBean("productDao");
				Product product=(Product) context.getBean("product");
				
				List<Product> lst=productDao.getAllProduct();
				System.out.println(lst.size());
				for(Product usr:lst){
					System.out.println(usr.getProductId()+" "+usr.getProductName()+" "+usr.getPrice()+" "+usr.getCategory());	
				}
//				
//				//INSERT DATA TEST--------------------------
//				
//				
////				product.setProductId(6);
////				product.setProductName("Leather Bags");
////				product.setPrice(1000);
////				product.setCategory("Bags");
////				productDao.saveOrUpdate(product);
////				
//////				DELETING TEST
////				product.setProductId(0);
////		
////				productDao.deleteById(0);
////				System.out.println("Deleted");
////				

	}
}
