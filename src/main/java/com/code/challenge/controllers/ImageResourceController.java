package com.code.challenge.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.challenge.model.ImageResource;

@Controller
@RequestMapping("/image-resource/")
public class ImageResourceController {
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody ImageResource getImageResource(@RequestParam(value="name") String name,
			@RequestParam(value="type") String type,
			@RequestParam(value="category") String category,
			@RequestParam(value="year") String year) {
		//here the logic :(
        return new ImageResource();
    }

}
