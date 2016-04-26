package com.formacion.imagina.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String product_name;
	private BigDecimal price;

	
	public Producto(){
		super();
	}
	
	public Producto(int id, String product_name, BigDecimal price) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the product_name
	 */
	public String getProduct_name() {
		return product_name;
	}

	/**
	 * @param product_name the product_name to set
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Producto [id=" + id + ", product_name=" + product_name + ", price=" + price + "]";
	}
}
