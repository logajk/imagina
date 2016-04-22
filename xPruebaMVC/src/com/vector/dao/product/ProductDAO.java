package com.vector.dao.product;

import java.util.List;

import com.vector.model.Product;

public interface ProductDAO {

	public Product findById(int id);

	public List<Product> findAll();

	public void updateProduct(Product product);

	public void deleteProduct(int id);

	public void insertProduct(Product product);

}