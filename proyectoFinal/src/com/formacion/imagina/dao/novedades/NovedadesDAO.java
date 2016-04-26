package com.formacion.imagina.dao.novedades;

import java.util.List;

import com.formacion.imagina.model.Novedades;

public interface NovedadesDAO {
	
	public List<Novedades> findMessageEnabled();
}
