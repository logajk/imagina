package com.formacion.imagina.dao.roles;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.formacion.imagina.model.Rol;

public class RolDAOImpl implements RolDAO {

	private JdbcTemplate jdbcTemplate;
	
	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/**
	 * Devuelve todos los tipos de perfiles 
	 */
	@Override
	public List<Rol> findAllDistinct(){
		String sql = "SELECT DISTINCT authority, description FROM authorities";
		
		
		return jdbcTemplate.query(sql, new RolDistinctRowMapper());
	}

	
}
