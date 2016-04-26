package com.formacion.imagina.dao.productos;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.formacion.imagina.model.Producto;

public class ProductosDAOImpl implements ProductosDAO {

	static Logger log = Logger.getLogger(ProductosDAOImpl.class);
	
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/* (non-Javadoc)
	 * @see com.formacion.imagina.dao.productos.ProductosDAO#findAll()
	 */
	@Override
	public List<Producto> findAll(){
		String sql = "SELECT * FROM products";
		
		log.info("Se estan buscando todos los productos");
		return jdbcTemplate.query(sql, new ProductosRowMapper());
	}	
	
	@Override
	public Producto findByID(int id){
		String sql = "SELECT * FROM products WHERE id=?";
		
		log.info("Se esta buscando el producto: "+id);
		return jdbcTemplate.queryForObject(sql, new Object[]{id}, new ProductosRowMapper());
	}
}
