package com.manju.dboconfig;

import java.util.Properties;

import javax.persistence.QueryHint;
import javax.sql.DataSource;


import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.manju.dao.CartDao;
import com.manju.dao.CategoryDao;
import com.manju.dao.ProductDao;
import com.manju.dao.UserDetailDao;
import com.manju.dao.UsersDao;
import com.manju.daoimpl.CartDaoImpl;
import com.manju.daoimpl.CategoryDaoImpl;
import com.manju.daoimpl.ProductDaoImpl;
import com.manju.daoimpl.UserDetailDaoImpl;
import com.manju.daoimpl.UsersDaoImpl;
import com.manju.model.Cart;
import com.manju.model.Category;
import com.manju.model.Product;
import com.manju.model.UserDetail;
import com.manju.model.Users;

@Configuration
@ComponentScan("com.manju.*")
@EnableTransactionManagement

public class ApplicationContext {
	
	 @Bean(name = "dataSource")
	    public DataSource getDataSource() {
	    	BasicDataSource dataSource = new BasicDataSource();
	    	dataSource.setDriverClassName("org.h2.Driver");
	    	dataSource.setUrl("jdbc:h2:tcp://localhost/~/shoppingDB");
	    	dataSource.setUsername("sa");
	    	dataSource.setPassword("");
	    	
	    	return dataSource;
	    }
	  private Properties getHibernateProperties() {
	    	Properties properties = new Properties();
	    	properties.put("hibernate.show_sql", "true");
	    	properties.put("hibernate.format_sql", "true");
	    	properties.put("hibernate.hbm2ddl.auto", "update");
	    	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	    	return properties;
	    }
	    
	    @Autowired
	    @Bean(name = "sessionFactory")
	    public SessionFactory getSessionFactory(DataSource dataSource) {
	    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	    	sessionBuilder.addProperties(getHibernateProperties());
	    	sessionBuilder.addAnnotatedClasses(Users.class);
	    	sessionBuilder.addAnnotatedClasses(UserDetail.class);
	    	sessionBuilder.addAnnotatedClasses(Product.class);
	    	sessionBuilder.addAnnotatedClasses(Category.class);
	    	sessionBuilder.addAnnotatedClasses(Cart.class);
	    	return sessionBuilder.buildSessionFactory();
	    }
	    
		@Autowired
		@Bean(name = "transactionManager")
		public HibernateTransactionManager getTransactionManager(
				SessionFactory sessionFactory) {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager(
					sessionFactory);

			return transactionManager;
		}
	    
		@Autowired
		@Bean(name="usersDao")
		public UsersDao getUsersDao(SessionFactory sessionFactory)
		{
			return new UsersDaoImpl(sessionFactory);
		}
		@Autowired
		@Bean(name="users")
		public Users getUsers()
		{
			return new Users();
		}
		
		@Autowired
		@Bean(name="userdetailDao")
		public UserDetailDao getUserDetailDao(SessionFactory sessionFactory)
		{
			return new UserDetailDaoImpl(sessionFactory);
		}
		@Autowired
		@Bean(name="userdetail")
		public UserDetail getUserdetail()
		{
			return new UserDetail();
		}
		
		@Autowired
		@Bean(name="productDao")
		public ProductDao getProductDao(SessionFactory sessionFactory)
		{
			return new ProductDaoImpl(sessionFactory);
		}
		@Autowired
		@Bean(name="product")
		public Product getProduct()
		{
			return new Product();
		}
		
		@Autowired
		@Bean(name="categoryDao")
		public CategoryDao getCategoryDao(SessionFactory sessionFactory)
		{
			return new CategoryDaoImpl(sessionFactory);
		}
		@Autowired
		@Bean(name="category")
		public Category getCategory()
		{
			return new Category();
		}
		
		@Autowired
		@Bean(name="cartDao")
		public CartDao getCartDao(SessionFactory sessionFactory)
		{
			return new CartDaoImpl(sessionFactory);
		}
		@Autowired
		@Bean(name="cart")
		public Cart getCart()
		{
			return new Cart();
		}
}

