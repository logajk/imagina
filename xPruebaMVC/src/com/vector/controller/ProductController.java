package com.vector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vector.dao.product.ProductDAO;
import com.vector.model.Product;

@Controller
public class ProductController {

	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("/products")
	public ModelAndView productPage(){
		ModelAndView model = new ModelAndView("product");
		
		model.addObject("listado", productDAO.findAll());
		
		return model;
	}
	
	@RequestMapping("/productRemove")
	public ModelAndView deleteProduct(@RequestParam(value="id")int id){
		
		productDAO.deleteProduct(id);
		
		return productPage();
	}
	
	@RequestMapping("/productEdit")
	public ModelAndView showProduct(@RequestParam(value="id")int id){
		ModelAndView model = new ModelAndView("showProduc");
		
		model.addObject("product", productDAO.findById(id));
		
		return model;
	}
	
	@RequestMapping(value="/productUpdate", method=RequestMethod.POST)
	public ModelAndView updateProduct(@ModelAttribute("producto")Product product){
		
		productDAO.updateProduct(product);
		
		return productPage();
	}
	
	@RequestMapping("/productAdd")
	public String addProductPage(){
		return "addProduc";
	}
	
	@RequestMapping(value="/productAddNew", method=RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute("producto")Product product){
		
		productDAO.insertProduct(product);
		
		return productPage();
	}
}
