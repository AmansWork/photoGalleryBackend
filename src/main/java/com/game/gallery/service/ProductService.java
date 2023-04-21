package com.game.gallery.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.game.gallery.bean.Product;

public interface ProductService {

	public List<Product> getProducts();

	public Product addProduct(Product product);

	public ResponseEntity<HttpStatus> deleteProduct(int id);

	public Product changeProduct(Product product);

}
