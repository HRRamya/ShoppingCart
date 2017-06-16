package com.manju.daoimpl;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.manju.dao.UsersDao;

import com.manju.model.Users;

public class UsersDaoImpl implements UsersDao
{


	private SessionFactory sessionFactory;
	public UsersDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional
public int saveOrUpdate(Users users) {
	// TODO Auto-generated method stub
	this.sessionFactory.getCurrentSession().saveOrUpdate(users);
	return 0;
}

@Transactional
public List<Users> getAllUsers() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<Users> listUsers = (List<Users>) sessionFactory.getCurrentSession().createCriteria(Users.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUsers;

}
@Transactional
public int deleteById(int userId) {
	// TODO Auto-generated method stub
	Users usrToDelete = new Users();
	usrToDelete.setUserId(userId);;
	sessionFactory.getCurrentSession().delete(usrToDelete);
	return 0;
}

@Transactional
public boolean getLoginvalidate(String userName, String password)
{

	String hql = "from Users where username= '" + userName + "' and " + " password='" + password+"'";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<Users> listUsrs = (List<Users>) query.list();
	if (listUsrs != null && !listUsrs.isEmpty())
	{
		return true;
		}
	else
		return false;
	}
@Transactional
public Users getByUsersId(int userId) {
	System.out.println(userId);
	String hql="from Users where userId='"+userId+"'";
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<Users> listUsers=(List<Users>)query.list();
	if(listUsers !=null && !listUsers.isEmpty())
	{
		return listUsers.get(0);
	}	
	
	return null;
}

	
}
