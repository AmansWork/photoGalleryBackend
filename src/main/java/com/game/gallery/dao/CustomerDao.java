package com.game.gallery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.gallery.bean.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
