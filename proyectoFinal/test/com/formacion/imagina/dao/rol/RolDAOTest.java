package com.formacion.imagina.dao.rol;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.formacion.imagina.dao.roles.RolDAO;
import com.formacion.imagina.model.Rol;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/com/formacion/conf/mvc-dispatcher-servlet.xml"})
public class RolDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private RolDAO rolDAO;
	
	@Test
	public void findAllDistinctTest(){
		List<Rol> listado = null;
		
		listado = rolDAO.findAllDistinct();
		
		Assert.assertNotNull(listado);
		logger.info("Nos ha devuelto: "+listado.size());
		Assert.assertNotEquals(0, listado.size());
	}
	
}
