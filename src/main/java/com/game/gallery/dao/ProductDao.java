package com.game.gallery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.gallery.bean.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}
