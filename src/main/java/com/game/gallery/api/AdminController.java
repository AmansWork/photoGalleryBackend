package com.game.gallery.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.game.gallery.bean.Admin;
import com.game.gallery.service.AdminService;

@RestController
@CrossOrigin
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("gallery/admin")
	public ResponseEntity<HttpStatus> checkAdmin(@RequestBody Admin admin){
		return adminService.checkAdmin(admin);
	}
}
