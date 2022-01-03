package com.lti.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.pojo.Product;
import com.lti.app.repository.ProductDAO;
import com.lti.app.springdatarepo.MyJPARepo;

@Service
@Transactional
public class ProductServiceImpl implements ProductService
{
	@Autowired
	ProductDAO pdao;
	
	@Autowired
	MyJPARepo myrepo;

	@Override
	public boolean addProduct(Product product) {
//		return pdao.addProduct(product);
		myrepo.save(product);
		return true;
	}

	@Override
	public List<Product> getProducts() {
//		return pdao.getProducts();
		return myrepo.findAll();
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
//		return pdao.updateProduct(product);
		myrepo.save(product);
		return true;
	}

	@Override
	public Product getProduct(String prodid) {
		// TODO Auto-generated method stub
//		return pdao.getProduct(prodid);
		return myrepo.findById(prodid).get();
	}

	@Override
	public boolean deletProduct(String prodid) {
		// TODO Auto-generated method stub
//		return pdao.deletProduct(prodid);
		myrepo.deleteById(prodid);
		return true;
	}
	
	

}
