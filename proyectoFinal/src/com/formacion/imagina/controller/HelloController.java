package com.formacion.imagina.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.formacion.imagina.dao.mensajes.MensajeDAO;
import com.formacion.imagina.dao.novedades.NovedadesDAO;
import com.formacion.imagina.dao.roles.RolDAO;

@Controller
public class HelloController {

	@Autowired
	NovedadesDAO novedadesDAO;
	
	@Autowired
	RolDAO rolDAO;
	
	@Autowired
	MensajeDAO mensajeDAO;
	
	@RequestMapping(value = {"/", "welcome**"}, method = RequestMethod.GET)
	public ModelAndView welcomePage(){
	
		ModelAndView model = new ModelAndView("hello");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		model.addObject("title", mensajeDAO.getMensaje("com.formacion.imagina.hello.title"));
		model.addObject("message", mensajeDAO.getMensaje("com.formacion.imagina.hello.message"));
		model.addObject("fechaActual", sdf.format(new Date()));
		model.addObject("listadoNovedades", novedadesDAO.findMessageEnabled());
		
		return model;
	}
	
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage(){
	
		ModelAndView model = new ModelAndView("admin"); 
		
		model.addObject("title", mensajeDAO.getMensaje("com.formacion.imagina.admin.title"));
		model.addObject("message", mensajeDAO.getMensaje("com.formacion.imagina.admin.message"));
		model.addObject("listadoRol", rolDAO.findAllDistinct());
		
		return model;
	}
	
	@RequestMapping(value = "/dba**", method = RequestMethod.GET)
	public ModelAndView dbaPage(){
	
		ModelAndView model = new ModelAndView("dba");
		model.addObject("title", "Spring Security Hello world");
		model.addObject("message", "This is a protected page - Database Page!");
		
		return model;
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public ModelAndView logoutPage(){
		
		return new ModelAndView("logoutSuccess");
	}
}
