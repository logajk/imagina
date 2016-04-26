package com.formacion.imagina.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.formacion.imagina.dao.mensajes.MensajeDAO;
import com.formacion.imagina.dao.productos.ProductosDAO;
import com.formacion.imagina.model.Producto;

@Controller
public class ProductoController {

	static Logger log = Logger.getLogger(ProductoController.class);
	
	@Autowired
	private MensajeDAO mensajeDAO;
	
	@Autowired
	private ProductosDAO productosDAO;
	
	@RequestMapping(value="/articulos**", method = RequestMethod.GET)
	public ModelAndView producPage(){
		
		ModelAndView model = new ModelAndView("product");
		List<Producto> listadoProductos = productosDAO.findAll();
		
		log.info("Tamanio de la lista: "+listadoProductos.size());
		
		model.addObject("title", mensajeDAO.getMensaje("com.formacion.imagina.product.title"));
		model.addObject("message", mensajeDAO.getMensaje("com.formacion.imagina.product.message"));
		
		int num = (int) (Math.random()*listadoProductos.size()+1)-1;
		
		log.info("Numero aleatorio: "+num);
		
		model.addObject("producto", listadoProductos.get(num));
		
		return model;
	}
}
