package com.formacion.imagina.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.formacion.imagina.dao.mensajes.MensajeDAO;
import com.formacion.imagina.model.Mensaje;

@Controller
public class ConfigController {
	
	@Autowired
	MensajeDAO mensajeDAO;

	@RequestMapping(value="/admin/config/actualizarMsg", method = RequestMethod.POST)
	public ModelAndView actualizarMensaje(HttpServletRequest request, @RequestParam(value="mensaje") String mensaje){
		
		ModelAndView model = new ModelAndView("config");
		
		model.addObject("title", mensajeDAO.getMensaje("com.formacion.imagina.config.title"));
		model.addObject("message", mensajeDAO.getMensaje("com.formacion.imagina.config.message"));
		
		
		
		if(!StringUtils.isEmpty(mensaje)){
			Mensaje msg = new Mensaje("com.formacion.imagina.hello.message", mensaje);
			mensajeDAO.updateMensaje(msg);
			
			model.addObject("mensajeActalizado", true);
		}
		
		return model;
	}
	
	@RequestMapping(value="/admin/config", method=RequestMethod.GET)
	public ModelAndView configPage(){
		
		ModelAndView model = new ModelAndView("config");
		
		model.addObject("title", mensajeDAO.getMensaje("com.formacion.imagina.config.title"));
		model.addObject("message", mensajeDAO.getMensaje("com.formacion.imagina.config.message"));
		
		return model;
	}
}
