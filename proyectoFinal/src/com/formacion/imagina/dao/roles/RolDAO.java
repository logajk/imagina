package com.formacion.imagina.dao.roles;

import java.util.List;

import com.formacion.imagina.model.Rol;

public interface RolDAO {

	public List<Rol> findAllDistinct();

}