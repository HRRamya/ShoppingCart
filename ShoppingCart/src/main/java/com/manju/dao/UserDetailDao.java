package com.manju.dao;

import java.util.List;

import com.manju.model.UserDetail;

public interface UserDetailDao {
	int saveOrUpdate(UserDetail userdetail);
	   List<UserDetail>getAllUserDetail();
	   int deleteById(int userdetailId);
	   ;
}
