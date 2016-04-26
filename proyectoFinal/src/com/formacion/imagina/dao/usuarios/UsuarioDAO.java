package com.formacion.imagina.dao.usuarios;

import java.util.List;

import com.formacion.imagina.model.Usuario;



public interface UsuarioDAO {

	void insertUser(Usuario user);
	int updateUser(Usuario user);
	void deleteUser(String id);
	Usuario selectUser(String id);
	public List<Usuario> findAll();
}
