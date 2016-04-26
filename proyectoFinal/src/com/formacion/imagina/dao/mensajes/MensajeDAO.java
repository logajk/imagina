package com.formacion.imagina.dao.mensajes;

import java.util.Properties;

import com.formacion.imagina.model.Mensaje;

public interface MensajeDAO {

	public String getMensaje(String clave);

	public Properties getAllAsProperty();

	public void updateMensaje(Mensaje msg);

}