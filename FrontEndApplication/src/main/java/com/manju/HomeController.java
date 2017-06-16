package com.manju;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.manju.dao.ProductDao;
import com.manju.model.Product;

@Controller
public class HomeController {

	@Autowired
	Product product;
	
	@Autowired
	ProductDao productDao;
	
	
	
	@RequestMapping("/adm")
	public ModelAndView getAdminPage()
	{
		ModelAndView mv=new ModelAndView("admin");
		List<Product> plist=productDao.getAllProduct();
		return mv;
	}
	@RequestMapping("/supplir")
	public ModelAndView getSupplierPage()
	{
		ModelAndView mv=new ModelAndView("SupplierPage");
		List<Product> plist=productDao.getAllProduct();
		return mv;
	}
	
	@RequestMapping("/landing")
	public ModelAndView getLanding()
	{
		ModelAndView mv=new ModelAndView("LandingPage");
		List<Product> plist=productDao.getAllProduct();
		mv.addObject("pList", plist);
		System.out.println(plist.size());
		mv.addObject("msg", "Hello world");
		return mv;
	}
	
	@RequestMapping("/home")
	public ModelAndView getHome()
	{
		ModelAndView mv=new ModelAndView("home");
		List<Product> plist=productDao.getAllProduct();
		mv.addObject("pList", plist);
		System.out.println(plist.size());
		mv.addObject("msg", "Hello world");
		return mv;
	}

	@RequestMapping("login")
	public String getLogin()
	{
		return "login";
	}
}
