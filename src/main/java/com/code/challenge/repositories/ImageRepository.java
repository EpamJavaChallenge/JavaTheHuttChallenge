package com.code.challenge.repositories;

import java.awt.Image;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.code.challenge.model.ImageInfo;

@RepositoryRestResource(collectionResourceRel = "image", path = "image")
public interface ImageRepository extends MongoRepository<ImageInfo, Integer> {

	Image findByName(@Param("imageName") String imageName);



}
