package com.lti.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.Product;
import com.lti.app.service.ProductService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/rest/api")
public class productController 
{
	@Autowired
	ProductService pservice;
	
	@GetMapping("/products")
	public List<Product> showAll() {
		return pservice.getProducts();
	}
	
	@PostMapping("/products")
	public boolean addProduct(@RequestBody Product product)
	{
		System.out.println(product);
		return pservice.addProduct(product);
		
	}
	
	@PutMapping("/products")
	public boolean updateProduct(@RequestBody Product product)
	{
	return pservice.updateProduct(product);
	}
	
	@DeleteMapping("/products/{prodid}")
	public boolean deleteProduct(@PathVariable("prodid") String prodid)
	{
		return pservice.deletProduct(prodid);
	}
	
	@GetMapping("/products/{prodid}")
	public Product getProduct(@PathVariable("prodid") String prodid)
	{
		return pservice.getProduct(prodid);
	}
	

}
