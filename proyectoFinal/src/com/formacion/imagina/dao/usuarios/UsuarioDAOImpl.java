package com.formacion.imagina.dao.usuarios;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.formacion.imagina.model.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

	static Logger log = Logger.getLogger(UsuarioDAOImpl.class);
	
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void insertUser(Usuario user) {
		// TODO Auto-generated method stub
		log.info("### Insertando usuario #### ");
		
		String sql = "INSERT INTO users(username,password,enabled) VALUES (?,?,?)";
		
		jdbcTemplate.update(sql, new Object[]{
			user.getUsername(),
			user.getPassword(),
			user.isEnabled()
		});
		
		log.info("Usuario insertado: "+user);
	}

	@Override
	public int updateUser(Usuario user) {
		// TODO Auto-generated method stub
		String sql = "UPDATE users SET password=?, enabled=? WHERE username=?";
		
		jdbcTemplate.update(sql, new Object[]{
			user.getPassword(),
			user.isEnabled()
		});
		
		log.info("Usuario eliminado: "+user);
		return 0;
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM users WHERE username=?";
		
		jdbcTemplate.update(sql, new Object[]{
				id
		});
		
		log.info("Se ha eliminado el usuario con id: "+id);
	}

	@Override
	public Usuario selectUser(String id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM users WHERE username=?";
		
		Usuario usuario = jdbcTemplate.queryForObject(sql, new Object[]{id}, new UsuarioRowMapper());
		
		log.info("Usuario: "+usuario);
		
		return usuario;
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM users";
		
		log.info("Se han buscado todos los usuarios");
		return jdbcTemplate.query(sql, new UsuarioRowMapper());
	}
}
