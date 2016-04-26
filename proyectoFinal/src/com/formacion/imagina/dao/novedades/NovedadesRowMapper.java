package com.formacion.imagina.dao.novedades;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.formacion.imagina.model.Novedades;

public class NovedadesRowMapper implements RowMapper<Novedades> {

	@Override
	public Novedades mapRow(ResultSet rs, int numRow) throws SQLException {
		// TODO Auto-generated method stub
		Novedades novedades = new Novedades();
		
		novedades.setId(rs.getInt("id"));
		novedades.setMessage(rs.getString("message"));
		novedades.setEnabled(rs.getBoolean("enabled"));
		
		return novedades;
	}
}
