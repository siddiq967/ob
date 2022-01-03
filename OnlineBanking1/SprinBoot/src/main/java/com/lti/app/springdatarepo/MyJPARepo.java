package com.lti.app.springdatarepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lti.app.pojo.Product;

public interface MyJPARepo extends JpaRepository<Product, String>
{
	@Query("from Product where price=:price")
	public List<Product> findByPrice(int price);
	
	@Query("from Product where price between :low and :upp")
	public List<Product> findPriceBtwn(int low,int upp);

}
