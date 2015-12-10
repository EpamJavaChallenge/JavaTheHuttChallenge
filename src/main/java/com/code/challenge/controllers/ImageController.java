package com.code.challenge.controllers;

import java.awt.Image;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.code.challenge.repositories.ImageRepository;

@RestController
@RequestMapping("api/Media/")
public class ImageController {

	@Autowired
	private ImageRepository imageRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/{type}/{height}/{width}/{name}")
	public Image getImageInfo(@PathVariable("imageName") List<String> imageName) {
		
		//return imageRepository.findByName(imageName.get(0).concat(str));
		return null;
	}

}
