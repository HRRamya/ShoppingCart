package com.manju.dao;

import java.util.List;

import com.manju.model.Users;

public interface UsersDao 
{
   int saveOrUpdate(Users users);
   List<Users>getAllUsers();
   int deleteById(int userId);
   Users getByUsersId(int  userId);
   boolean getLoginvalidate(String userId,String userName);
}
