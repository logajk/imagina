package com.vector.dao.product;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vector.model.Product;

public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int numRow) throws SQLException {
		// TODO Auto-generated method stub
		Product product = new Product();
		
		product.setId(rs.getInt("id"));
		product.setProduct_name(rs.getString("product_name"));
		product.setPrice(rs.getBigDecimal("price"));
		
		return product;
	}
}
