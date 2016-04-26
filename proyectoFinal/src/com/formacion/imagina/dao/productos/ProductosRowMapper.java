package com.formacion.imagina.dao.productos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.formacion.imagina.model.Producto;

public class ProductosRowMapper implements RowMapper<Producto> {

	@Override
	public Producto mapRow(ResultSet rs, int numRow) throws SQLException {
		// TODO Auto-generated method stub
		Producto producto = new Producto();
		
		producto.setId(rs.getInt("id"));
		producto.setProduct_name(rs.getString("product_name"));
		producto.setPrice(rs.getBigDecimal("price"));
		
		return producto;
	}

}
