package com.vector.dao.product;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vector.model.Product;

public class ProductDAOImpl implements ProductDAO {

	static Logger logger = Logger.getLogger(ProductDAOImpl.class);
	
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/* (non-Javadoc)
	 * @see com.vector.dao.product.ProductDAO#findById(int)
	 */
	@Override
	public Product findById(int id){
		logger.info("Buscando producto por id");
		
		String sql = "SELECT * FROM products WHERE id=?";
		
		return jdbcTemplate.queryForObject(sql, new Object[]{id}, new ProductRowMapper());
	}

	/* (non-Javadoc)
	 * @see com.vector.dao.product.ProductDAO#findAll()
	 */
	@Override
	public List<Product> findAll(){
		logger.info("Buscando todos los productos");
		
		String sql = "SELECT * FROM products";
		
		return jdbcTemplate.query(sql, new ProductRowMapper());
	}

	@Override
	public void deleteProduct(int id){
		String sql = "DELETE FROM products WHERE id=?";
		
		logger.info("Borrando producto con id: "+id);
		jdbcTemplate.update(sql, new Object[]{id});
	}
	
	@Override
	public void updateProduct(Product product){
		String sql = "UPDATE products SET product_name = ?, price = ? WHERE id = ?";
		
		logger.info("Actualizado producto: "+product);
		jdbcTemplate.update(sql, new Object[]{
				product.getProduct_name(),
				product.getPrice(),
				product.getId()}
		);
	}
	
	@Override
	public void insertProduct(Product product){
		String sql = "INSERT INTO products(product_name, price) VALUES (?, ?);";
		
		logger.info("Insertando producto nuevo: "+product);
		jdbcTemplate.update(sql, new Object[]{
				product.getProduct_name(),
				product.getPrice()}
		);
	}
}
