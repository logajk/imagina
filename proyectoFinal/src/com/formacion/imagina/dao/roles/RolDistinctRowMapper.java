package com.formacion.imagina.dao.roles;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.formacion.imagina.model.Rol;

public class RolDistinctRowMapper implements RowMapper<Rol> {

	@Override
	public Rol mapRow(ResultSet rs, int numRow) throws SQLException {
		// TODO Auto-generated method stub
		Rol rol = new Rol();
		
		rol.setAuthority(rs.getString("authority"));
		rol.setDescription(rs.getString("description"));
		
		return rol;
	}
}
