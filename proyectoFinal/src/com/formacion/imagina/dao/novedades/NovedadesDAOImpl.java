package com.formacion.imagina.dao.novedades;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.formacion.imagina.model.Novedades;

public class NovedadesDAOImpl implements NovedadesDAO {

	static Logger log = Logger.getLogger(NovedadesDAOImpl.class);
	
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Novedades> findMessageEnabled() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM novedades WHERE enabled = TRUE";
		
		log.info("Se esta buscando todos los mensajes");
		
		return jdbcTemplate.query(sql, new NovedadesRowMapper());
	}



	

}
