package com.formacion.imagina.dao.producto;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.formacion.imagina.dao.productos.ProductosDAO;
import com.formacion.imagina.model.Producto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/com/formacion/conf/mvc-dispatcher-servlet.xml"})
public class ProductoDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private ProductosDAO productosDAO;
	
	@Test
	public void  findAllTest(){
		List<Producto> listadoProductos = productosDAO.findAll();
		
		Assert.assertNotNull(listadoProductos);
		
		for(Producto p : listadoProductos){
			logger.info(p);
		}
		
		int num = (int) (Math.random()*(listadoProductos.size()+1));
		
		logger.info("Producto No: "+num);
		logger.info(listadoProductos.get(num));
	}
	
	@Test
	public void findProductByID(){
		Producto producto = productosDAO.findByID(7);
		
		logger.info(producto);
		Assert.assertNotNull(producto);
	}
}
