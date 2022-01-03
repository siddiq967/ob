package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Product;

@Repository
public class ProductDAOImpl implements ProductDAO
{
	@Autowired
	EntityManager eMan;

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		eMan.persist(product);
		return true;
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return eMan.createQuery("from Product").getResultList();
	}

	@Override
	public boolean updateProduct(Product product) {
		eMan.merge(product);
		return true;
	}

	@Override
	public Product getProduct(String prodid) {
		return eMan.find(Product.class, prodid);
	}

	@Override
	public boolean deletProduct(String prodid) {
		Product pdel=eMan.find(Product.class, prodid);
		eMan.remove(pdel);
		return true;
	}

}
