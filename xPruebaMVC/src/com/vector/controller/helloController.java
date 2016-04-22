package com.vector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vector.dao.user.UserDAO;

@Controller
public class helloController {

	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/welcome")
	public ModelAndView helloPage(){
		ModelAndView model = new ModelAndView("hello");
		
		model.addObject("mensaje", "Hola mundo!!");
		model.addObject("listado", userDAO.findAll());
		return model;
	}
}
