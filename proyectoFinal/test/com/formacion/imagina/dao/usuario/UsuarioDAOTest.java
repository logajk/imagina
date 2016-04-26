package com.formacion.imagina.dao.usuario;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.formacion.imagina.dao.usuarios.UsuarioDAO;
import com.formacion.imagina.model.Usuario;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/com/formacion/conf/mvc-dispatcher-servlet.xml"})
public class UsuarioDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Test
	public void selectUserTest(){
		Usuario usuario = null;
		
		usuario = usuarioDAO.selectUser("admin");
		
		Assert.assertNotNull(usuario);			
	}
	
	@Test
	public void selectAllTest(){
		List<Usuario> listado = new ArrayList<Usuario>();
		
		listado = usuarioDAO.findAll();
		
		Assert.assertNotNull(listado);
		logger.info("Nos ha devuelto : "+listado.size());
		Assert.assertNotEquals(0, listado.size());
		
	}
	
	@Test
	public void insertUserTest(){
		Usuario usuario = new Usuario("prueba1", "prueba1", true);
		
		int tamanio = usuarioDAO.findAll().size();
		
		logger.info("Nos ha devuelto : "+tamanio);
		usuarioDAO.insertUser(usuario);
		
		Assert.assertEquals(tamanio+1, usuarioDAO.findAll().size());
		logger.info("Y ahora nos ha devuelto : "+usuarioDAO.findAll().size());
	}
	
	@Test
	public void deleteUserTest(){
		
		int tamanio = usuarioDAO.findAll().size();
		
		logger.info("Nos ha devuelto : "+tamanio);
		usuarioDAO.deleteUser("admin");
		
		Assert.assertEquals(tamanio-1, usuarioDAO.findAll().size());
		logger.info("Y ahora nos ha devuelto : "+usuarioDAO.findAll().size());
	}
}
