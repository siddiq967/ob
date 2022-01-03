package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Product;

public interface ProductService 
{
	public boolean addProduct(Product product);
	public List<Product> getProducts();
	
	public boolean updateProduct(Product product);
	public Product getProduct(String prodid);
	public boolean deletProduct(String prodid);

}
