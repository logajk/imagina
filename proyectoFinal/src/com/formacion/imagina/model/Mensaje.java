package com.formacion.imagina.model;

import java.io.Serializable;

public class Mensaje implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String clave;
	private String valor;

	public Mensaje(){
		super();
	}

	public Mensaje(String clave, String valor) {
		super();
		this.clave = clave;
		this.valor = valor;
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mensaje [clave=" + clave + ", valor=" + valor + "]";
	}
}
