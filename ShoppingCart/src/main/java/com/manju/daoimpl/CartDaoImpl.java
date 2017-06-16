package com.manju.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.manju.dao.CartDao;
import com.manju.model.Cart;
import com.manju.model.Category;


public class CartDaoImpl implements CartDao
{

	private SessionFactory sessionFactory;
	public CartDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public int saveOrUpdate(Cart cart) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().saveOrUpdate(cart);
		return 0;
	}
	@Transactional
	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Cart> listCart = (List<Cart>) sessionFactory.getCurrentSession().createCriteria(Cart.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return listCart;
		
		
	}
	@Transactional
	public int deleteById(int cartId)
	{
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		cart.setCartId(cartId);
		sessionFactory.getCurrentSession().delete(cart);
		return 0;
		
		
	}
//	public Cart getByProductId(int productId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
}
