package com.manju.shoppingcart.ShoppingCart;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class UserDetailTest
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.manju.*");
		context.refresh();
		System.out.println("Done");
		
		//fetching data test
//		UserDetailDao userDetailDao=(UserDetailDao)context.getBean("userdetailDao");
//		UserDetail userDetail=(UserDetail)context.getBean("userdetail");
//		
//		List<UserDetail> lst=userDetailDao.getAllUserDetail();
//		System.out.println(lst.size());
//		for(UserDetail usr:lst){
//			System.out.println(usr.getUserId()+" "+usr.getFirstname()+" "+usr.getLastname()+" "+usr.getLoginId()+" "+usr.getContact()+" "+usr.getShipping()+" "+usr.getArea()+"  "+usr.getCity()+" "+usr.getPincode());	
//		}
//		//FETCHING DATA TEST--------------------------
//		
//				//INSERT DATA TEST--------------------------
////				UsersDao usersDao=(UsersDao) context.getBean("usersDao");
////				Users users=(Users) context.getBean("users");
////				
//		userDetail.setUserId(3);
//	    userDetail.setLoginId(1546);
//		userDetail.setFirstname("SHAM");
//		userDetail.setLastname("RAO");
//		userDetail.setContact("9035797641");
//		userDetail.setCity("HYDRABAD");
//		userDetail.setArea("KR PURAM");
//		userDetail.setPincode(560017);
//		userDetail.setShipping("KR PURAM 1ST CROSS");
//		userDetailDao.saveOrUpdate(userDetail);
//		
////		DELETING TEST
//		userDetail.setUserId(3);
//		userDetailDao.deleteById(3);
//		System.out.println("Deleted");
	}
}
