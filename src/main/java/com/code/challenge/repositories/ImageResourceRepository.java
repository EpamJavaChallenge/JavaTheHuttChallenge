package com.code.challenge.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.code.challenge.model.ImageResource;

@RepositoryRestResource(collectionResourceRel = "10.254.254.150.2701/code-challenge", path = "/code-challenge")
public interface ImageResourceRepository extends MongoRepository<ImageResource, String>{
	public ImageResource finByName(String name,Double width,Double heigth);
    public List<ImageResource> findAll(String name);
}
