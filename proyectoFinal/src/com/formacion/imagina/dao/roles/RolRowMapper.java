package com.formacion.imagina.dao.roles;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.formacion.imagina.model.Rol;

public class RolRowMapper implements RowMapper<Rol> {

	@Override
	public Rol mapRow(ResultSet rs, int numRow) throws SQLException {
		// TODO Auto-generated method stub
		Rol rol = new Rol();
		
		rol.setUsername(rs.getString("username"));
		rol.setAuthority(rs.getString("authority"));
		rol.setDescription(rs.getString("description"));
		
		return rol;
	}
}
