package com.manju.shoppingcart.ShoppingCart;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class CartTest 
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.manju.*");
		context.refresh();
		System.out.println("Done");
//		//FETCHING DATA TEST--------------------------
//	CartDao cartDao=(CartDao)context.getBean("cartDao");
//	Cart cart=(Cart)context.getBean("cart");
//	
//	List<Cart> lst=cartDao.getAllCart();
//	System.out.println(lst.size());
//	for(Cart usr:lst){
//		System.out.println(usr.getId_userId()+" "+usr.getCartId()+" "+usr.getProductname()+" "+usr.getProductprice()+" "+usr.getProductId());	
//	}
//	
//	//INSERT DATA TEST--------------------------
//	
//			cart.setCartId(5);
//			cart.setId_userId(141);
//			cart.setProductId(107);
//			cart.setProductname("Maskara");
//			cart.setProductprice(200);
//			cartDao.saveOrUpdate(cart);
//			
////			DELETING TEST
//			
//			cartDao.deleteById(6);
//			System.out.println("Deleted");
	
}
}