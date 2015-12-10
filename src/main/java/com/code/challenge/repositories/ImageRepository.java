package com.code.challenge.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.code.challenge.model.Image;

public interface ImageRepository extends MongoRepository<Image, Long>{
	
//	Image findSpecificImage(String category, String type, int width, 
//			int height, String name);
	
	Image findByCategory(String category);
	Image findByType(String type);
	Image findByWidth(int width);
	Image findByHeight(int heigth);
	Image findByName(String name);
}
