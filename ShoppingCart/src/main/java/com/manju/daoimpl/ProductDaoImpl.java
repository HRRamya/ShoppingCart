package com.manju.daoimpl;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.manju.dao.ProductDao;
import com.manju.model.Product;
import com.manju.model.UserDetail;


public class ProductDaoImpl implements ProductDao
{

	private SessionFactory sessionFactory;
	 public ProductDaoImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}
	 @Transactional
	public int saveOrUpdate(Product product) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().saveOrUpdate(product);
		return 0;
	}
	 @Transactional
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return listProduct;
	
	}
	 @Transactional
	public int deleteById(int productId) {
		// TODO Auto-generated method stub
		Product usrToDelete = new Product();
		usrToDelete.setProductId(productId);
		sessionFactory.getCurrentSession().delete(usrToDelete);
		return 0;
		
	}
	 @Transactional
	public Product getByProductId(int productId) {
		System.out.println(productId);
		String hql = "from Product where productId= '" +productId + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>) query.list();
		if (listProduct != null && !listProduct.isEmpty()) 
		{
			return listProduct.get(0);
		}
			
		return null;
	}
	 
	
	
}
