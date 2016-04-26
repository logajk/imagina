package com.formacion.imagina.dao.productos;

import java.util.List;

import com.formacion.imagina.model.Producto;

public interface ProductosDAO {

	public List<Producto> findAll();

	public  Producto findByID(int id);

}