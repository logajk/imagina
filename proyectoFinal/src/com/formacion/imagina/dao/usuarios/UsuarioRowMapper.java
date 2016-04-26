package com.formacion.imagina.dao.usuarios;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.formacion.imagina.model.Usuario;

public class UsuarioRowMapper implements RowMapper<Usuario> {

	@Override
	public Usuario mapRow(ResultSet rs, int numRow) throws SQLException {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario();
		
		usuario.setUsername(rs.getString("username"));
		usuario.setPassword(rs.getString("password"));
		usuario.setEnabled(rs.getBoolean("enabled"));
		
		return usuario;
	}
}
