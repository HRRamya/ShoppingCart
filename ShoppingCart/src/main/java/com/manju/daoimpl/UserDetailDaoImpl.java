package com.manju.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.manju.dao.UserDetailDao;

import com.manju.model.UserDetail;
import com.manju.model.Users;

public class UserDetailDaoImpl implements UserDetailDao
{
	private SessionFactory sessionFactory;
	
	public UserDetailDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
    @Transactional
	public int saveOrUpdate(UserDetail userdetail) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().saveOrUpdate(userdetail);
		return 0;
	}
@Transactional
	public List<UserDetail> getAllUserDetail() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<UserDetail> listUserDetail = (List<UserDetail>) sessionFactory.getCurrentSession().createCriteria(UserDetail.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return listUserDetail;

	}
    @Transactional
	public int deleteById(int userdetailId) {
		
			// TODO Auto-generated method stub
			UserDetail usrToDelete = new UserDetail();
			usrToDelete.setUserId(userdetailId);
			sessionFactory.getCurrentSession().delete(usrToDelete);
			return 0;
	}
	
			
	
}
