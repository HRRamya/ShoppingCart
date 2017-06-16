package com.manju.shoppingcart.ShoppingCart;

import java.util.List;

import org.h2.engine.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manju.dao.UsersDao;
import com.manju.model.Users;



public class UsersTest
{

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.manju.*");
		context.refresh();
		System.out.println("Done");
		
////		//FETCHING DATA TEST--------------------------
		UsersDao usersDao=(UsersDao) context.getBean("usersDao");
		Users users=(Users) context.getBean("users");
//		
//		List<Users> lst=usersDao.getAllUsers();
//		System.out.println(lst.size());
//		for(Users usr:lst){
//			System.out.println(usr.getUserId()+" "+usr.getUsername()+" "+usr.getPassword()+" "+usr.getRole());	
//		}
////		//FETCHING DATA TEST--------------------------
////		
////		//INSERT DATA TEST--------------------------
//////		
		users.setPassword("user");
		users.setRole("USER_USER");
		users.setUsername("uuu");
////		users.setUserId(3);
		usersDao.saveOrUpdate(users);
//////		
////		//FETCHING DATA TEST--------------------------
////		
//////		DELETING TEST
////		users.setUserId(3);
////		usersDao.deleteById(3);
////		
////		
//////		List<Users> lst1=usersDao.getAllUsers();
//////		System.out.println(lst1.size());
//////		for(Users usr:lst1){
//////			System.out.println(usr.getUserId()+" "+usr.getUsername()+" "+usr.getPassword()+" "+usr.getRole());	
//////		}
////		
////		boolean flag=usersDao.getLoginvalidate("BBB", "aaa");
////		if(flag)
////			System.out.println("Found");
////		else
//			System.out.println("Not Found");
	}
}
