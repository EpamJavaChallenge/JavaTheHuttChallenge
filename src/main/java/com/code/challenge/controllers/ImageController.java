package com.code.challenge.controllers;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.code.challenge.exceptions.ImageNotFoundException;
import com.code.challenge.model.File;
import com.code.challenge.model.Image;
import com.code.challenge.repositories.FilesRepository;
import com.code.challenge.model.Error;

@RestController
@RequestMapping("/api")
public class ImageController {

	@Autowired
	private FilesRepository repository;
	
	private static final Map<String, Image> IMAGES = new HashMap<>();
	private static final String SEP = "_",
								INF_ERR_CODE = "NFI_ERR",
								INF_ERR_MSG = "The requested image could not be found";
	
	@RequestMapping("/{category}/{type}/{width}/{height}")
	public HttpEntity<Image> getImage(@PathVariable String category,
									  @PathVariable String type,
									  @PathVariable int width,
									  @PathVariable int height,
									  @RequestParam String name) throws MalformedURLException, IOException{
		StringBuilder key = new StringBuilder(category).append(SEP).append(type).append(SEP).append(width)
				   			.append(SEP).append(height).append(SEP).append(name);
		String imgKey = key.toString();
		Image img = null;
		if(IMAGES.containsKey(imgKey)){
			img = IMAGES.get(imgKey);
			if(img==null)
				throw new ImageNotFoundException();
		}else{
			key.setLength(0);
			key.append(name).append(".").append(type);
			List<File> files = repository.findByCategoryAndUrlLike(category, key.toString());
			if(files.isEmpty()){
				IMAGES.put(imgKey, null);
				throw new ImageNotFoundException();
			}
			for(File file : files){
				BufferedImage bi = ImageIO.read(new URL(file.getUrl()));
				Image image = new Image(name, file.getUrl(), type, file.getCategory(), file.getYear());
				IMAGES.put(key.toString(), image);
				if(bi.getWidth()==width && bi.getHeight()==height)
					img = image;
			}
			if(img==null)
				throw new ImageNotFoundException();
		}
		return new ResponseEntity<Image>(img, HttpStatus.OK);
	}
	@ExceptionHandler(ImageNotFoundException.class)
	public HttpEntity<Error> handleINFException(){
		return new ResponseEntity<Error>(new Error(INF_ERR_CODE, INF_ERR_MSG), HttpStatus.NOT_FOUND);
	}
	
}
