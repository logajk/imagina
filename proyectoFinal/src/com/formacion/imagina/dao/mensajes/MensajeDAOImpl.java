package com.formacion.imagina.dao.mensajes;

import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.formacion.imagina.model.Mensaje;

public class MensajeDAOImpl implements MensajeDAO {

	static Logger log = Logger.getLogger(MensajeDAOImpl.class);
	
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/* (non-Javadoc)
	 * @see com.formacion.imagina.dao.mensajes.MensajeDAO#getMensaje(java.lang.String)
	 */
	@Override
	public String getMensaje(String clave){
		String sql = "SELECT * FROM mensajes WHERE clave=?";
		
		Mensaje mensaje = jdbcTemplate.queryForObject(sql, new Object[]{clave}, new MensajeRowMapper());
		log.info("Se ha recuperado el mensaje: "+mensaje.getValor());
		
		return mensaje.getValor();
	}
	
	/* (non-Javadoc)
	 * @see com.formacion.imagina.dao.mensajes.MensajeDAO#getAllAsProperty()
	 */
	@Override
	public Properties getAllAsProperty(){
		
		Properties properties = new Properties();
		String sql = "SELECT * FROM mensajes";
		
		List<Mensaje> listadoMensajes = jdbcTemplate.query(sql, new MensajeRowMapper());
		
		for(Mensaje m : listadoMensajes){
			properties.setProperty(m.getClave(), m.getValor());
		}
		log.info("Se ha recuperado todos los mensajes como propeties");
		
		return properties;
	}
	
	@Override
	public void updateMensaje(Mensaje msg){
		String sql = "UPDATE mensajes SET valor=? WHERE clave=?";
		
		jdbcTemplate.update(sql, new Object[]{
				msg.getValor(),
				msg.getClave()
		});
		log.info("Mensaje actualizado");
	}
}
