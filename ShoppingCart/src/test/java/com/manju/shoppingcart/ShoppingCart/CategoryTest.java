package com.manju.shoppingcart.ShoppingCart;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class CategoryTest 
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.manju.*");
		context.refresh();
		System.out.println("Done");
		//FETCHING DATA TEST--------------------------
//		CategoryDao categoryDao=(CategoryDao) context.getBean("categoryDao");
//		Category category=(Category) context.getBean("category");
//		
//		List<Category> lst=categoryDao.getAllCategory();
//		System.out.println(lst.size());
//		for(Category usr:lst){
//			System.out.println(usr.getUserId()+" "+usr.getCategoryId()+" "+usr.getCategory());	
//		}
//		
//		//INSERT DATA TEST--------------------------
//		 category.setCategoryId(3);
//		category.setCategory("COSMETICS");
//         categoryDao.saveOrUpdate(category);
//		
////			DELETING TEST
//			
//			categoryDao.deleteById(3);
//			System.out.println("Deleted");
//	

		
	}
}
