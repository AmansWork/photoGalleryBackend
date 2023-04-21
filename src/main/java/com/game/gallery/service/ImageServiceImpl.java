package com.game.gallery.service;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.game.gallery.bean.Image;
import com.game.gallery.dao.ImageDao;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ImageServiceImpl implements ImageService{

	@Autowired
	private ImageDao imageDao;

	
	@Override
	public List<Image> getImages(Model model) {
		List<Image> images = imageDao.findAll();
		model.addAttribute("images", images);
		return images;
	}

	@Override
	public Image getImage(int imageId) {
		Image cust =  imageDao.findById(imageId).orElse(null);
		Hibernate.initialize(cust);
		return cust;
	}

	@Override
	public Image addImage(Image image) { 
		return imageDao.save(image);
	}

	@Override
	public Image updateImage(Image image) {
		return imageDao.save(image);
	}

	@Override
	public ResponseEntity<HttpStatus> deleteImage(int imageId) {
		imageDao.deleteById(imageId);
		return  new ResponseEntity<>(HttpStatus.OK);
	}	

}
