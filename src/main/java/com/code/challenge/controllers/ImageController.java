package com.code.challenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.code.challenge.model.Files;
import com.code.challenge.repositories.FilesRepository;


@RestController
@RequestMapping("/api")
public class ImageController {
	
	@Autowired
	private FilesRepository filesRepository; 

	@RequestMapping(method = RequestMethod.GET ,value = "/{category}/{type}/{width}/{height}")
    public Files greeting(
    		@PathVariable("category") String category,
    		@PathVariable("type") String type,
    		@PathVariable("width") String width,
    		@PathVariable("height") String height,
    		@RequestParam(value="name") String name) {
        return filesRepository.findByName(name);
    }
}
