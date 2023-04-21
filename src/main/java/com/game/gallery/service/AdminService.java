package com.game.gallery.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.game.gallery.bean.Admin;

public interface AdminService {

	public ResponseEntity<HttpStatus> checkAdmin(Admin admin);
}
