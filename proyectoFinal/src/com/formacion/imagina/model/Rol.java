package com.formacion.imagina.model;

import java.io.Serializable;

public class Rol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String authority;
	private String description;
	
	public Rol(){}

	public Rol(String username, String authority, String description) {
		super();
		this.username = username;
		this.authority = authority;
		this.description = description;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the authority
	 */
	public String getAuthority() {
		return authority;
	}

	/**
	 * @param authority the authority to set
	 */
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rol [username=" + username + ", authority=" + authority + ", description=" + description + "]";
	}
}
