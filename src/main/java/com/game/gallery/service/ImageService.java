package com.game.gallery.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

import com.game.gallery.bean.Image;

public interface ImageService {

	public List<Image> getImages(Model model);

	public Image getImage(int imageId);

	public Image addImage(Image image);

	public Image updateImage(Image image);

	public ResponseEntity<HttpStatus> deleteImage(int imageId);
}
