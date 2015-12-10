package com.code.challenge.controllers;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.challenge.model.Image;
import com.code.challenge.repositories.ImageRepository;

@RestController
@RequestMapping("/api")
public class ImageService {

	@Autowired
	private ImageRepository imageRepository;
	
	@RequestMapping("/{category}/{type}/{width}/{heigth}?name={name}")
	public ResponseEntity getImageDetails(
			@PathVariable String category,
			@PathVariable String type,
			@PathVariable String width,
			@PathVariable String height,
			@Param("name") String name) {
		Image result = null;
		
//		result = imageRepository.findSpecificImage(category, type, width, height, name);
		
		if (Objects.isNull(result)) {
			
		}
		
		return new ResponseEntity(result, HttpStatus.OK);
		
	}
}
