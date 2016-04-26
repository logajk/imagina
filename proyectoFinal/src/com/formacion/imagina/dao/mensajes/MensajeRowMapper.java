package com.formacion.imagina.dao.mensajes;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.formacion.imagina.model.Mensaje;

public class MensajeRowMapper implements RowMapper<Mensaje> {

	@Override
	public Mensaje mapRow(ResultSet rs, int numRow) throws SQLException {
		// TODO Auto-generated method stub
		Mensaje mensaje = new Mensaje();
		
		mensaje.setClave(rs.getString("clave"));
		mensaje.setValor(rs.getString("valor"));
		
		return mensaje;
	}

}
