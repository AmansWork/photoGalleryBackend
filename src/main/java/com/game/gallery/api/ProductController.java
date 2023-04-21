package com.game.gallery.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.game.gallery.bean.Product;
import com.game.gallery.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/gallery/product/get")
	public List<Product> getProducts(){
			
		return productService.getProducts();
	}
	
	@PostMapping("/gallery/product/add")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@PutMapping("/gallery/product/change")
	public Product changeProduct(@RequestBody Product product) {
		return productService.changeProduct(product);
	}
	
	@DeleteMapping("/gallery/product/delete/{id}")
	public ResponseEntity<HttpStatus> deleteProduct(@PathVariable int id){
		return productService.deleteProduct(id);
	}
}
