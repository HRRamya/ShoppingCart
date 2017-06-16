package com.manju.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.manju.dao.CategoryDao;

import com.manju.model.Category;
import com.manju.model.Product;


public class CategoryDaoImpl implements CategoryDao
{

	private SessionFactory sessionFactory;
	public CategoryDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public int saveOrUpdate(Category category) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().saveOrUpdate(category);
		return 0;
	}
	@Transactional
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return listCategory;
	
		
	}
	@Transactional
	public int deleteById(int categoryId) {
		// TODO Auto-generated method stub
		Category category = new Category();
		category.setCategoryId(categoryId);
		sessionFactory.getCurrentSession().delete(category);
		return 0;
		
	}
		
}
