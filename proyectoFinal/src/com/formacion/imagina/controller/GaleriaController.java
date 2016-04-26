package com.formacion.imagina.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.formacion.imagina.dao.mensajes.MensajeDAO;

@Controller
public class GaleriaController {

	static Logger log = Logger.getLogger(ProductoController.class);
	
	@Autowired
	private MensajeDAO mensajeDAO;
	
	@Autowired
	ServletContext servletContext;
	
	@RequestMapping(value="/galeriaImagenes**", method = RequestMethod.GET)
	public ModelAndView galeriaPage(){
		
		ModelAndView model = new ModelAndView("galeria");
		
		model.addObject("title", mensajeDAO.getMensaje("com.formacion.imagina.galeria.title"));
		model.addObject("message", mensajeDAO.getMensaje("com.formacion.imagina.galeria.message"));
		
//		FileSystemResource resource = new FileSystemResource("/imagenes/");
//		ArrayList<String> names = new ArrayList<String>(Arrays.asList(resource.getFile().list()));
		
		File rootDir = new File( servletContext.getRealPath("/imagenes/"));
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(rootDir.list()));
		List<String> listadoImagenes = new ArrayList<>();
		
		
		log.info("Numero de ficheros encontrados: "+names.size());
		
		for(String s : names){
			listadoImagenes.add("/imagenes/"+s);
		}
		
		model.addObject("listadoImagnes", listadoImagenes);
		
		return model;
	}
	
}
