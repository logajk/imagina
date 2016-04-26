package com.formacion.imagina.dao.mensaje;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.formacion.imagina.dao.mensajes.MensajeDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/com/formacion/conf/mvc-dispatcher-servlet.xml"})
public class MensajeDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private MensajeDAO mensajeDAO;
	
	@Test
	public void getMensajeTest(){
		String msg = mensajeDAO.getMensaje("com.formacion.imagina.admin.message");
		
		Assert.assertNotNull(msg);
		logger.info("Se ha recueprado el mensaje!!!");
		Assert.assertEquals("This is a protected page - Admin Page!", msg);
	}
	
	@Test
	public void getAllAsPropertyTest(){
		
		Properties properties = mensajeDAO.getAllAsProperty();
		
		Assert.assertNotNull(properties);
		logger.info("Properties obtenidos: "+properties.toString());
	}
}
