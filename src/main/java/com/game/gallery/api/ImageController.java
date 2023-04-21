package com.game.gallery.api;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.game.gallery.bean.Image;
import com.game.gallery.service.ImageService;

@RestController
@CrossOrigin
public class ImageController {

	@Autowired
	private ImageService imageService;

	@GetMapping("/gallery/image")
	public List<Image> getImages(Model model) {
		return imageService.getImages(model);
	}

	@GetMapping("/gallery/image/{ImageId}")
	public Image getImage(@PathVariable int ImageId) {
		return imageService.getImage(ImageId);
	}

	@PostMapping("/gallery/image")
	public Image addImage(@RequestParam MultipartFile image) throws IOException {
		byte[] imageData = image.getBytes();
		Image imageEntity = new Image();
		imageEntity.setImage(imageData);
		imageEntity.setName(image.getName());
		return imageService.addImage(imageEntity);
	}

	@PutMapping("/gallery/image")
	public Image updateImage(@RequestParam MultipartFile image) throws IOException {
		byte[] imageData = image.getBytes();
		Image imageEntity = new Image();
		imageEntity.setImage(imageData);
		imageEntity.setName(image.getName());
		return imageService.addImage(imageEntity);
	}

	@DeleteMapping("gallery/image/{id}")
	public ResponseEntity<HttpStatus> deleteImage(@PathVariable int id) {
		return imageService.deleteImage(id);
	}
}
