package com.game.gallery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.game.gallery.bean.Product;
import com.game.gallery.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Override
	public List<Product> getProducts() {
		
		return productDao.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		return productDao.save(product);
	}

	@Override
	public ResponseEntity<HttpStatus> deleteProduct(int id) {
		productDao.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	public Product changeProduct(Product product) {
		return productDao.save(product);
	}

}
