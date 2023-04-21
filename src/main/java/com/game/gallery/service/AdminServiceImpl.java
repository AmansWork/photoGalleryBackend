package com.game.gallery.service;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.game.gallery.bean.Admin;
import com.game.gallery.dao.AdminDao;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;
	
	@Override
	public ResponseEntity<HttpStatus> checkAdmin(Admin admin) {
		
		
		String s = admin.getUserName();
		Admin admin1 = adminDao.findById(s).orElse(null);
		Hibernate.initialize(admin);
		if((admin.getUserName().equals(admin1.getUserName())) && admin.getPassword().equals(admin1.getPassword())) {
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

}
