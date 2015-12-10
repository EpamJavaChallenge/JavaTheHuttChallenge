package com.code.challenge.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.code.challenge.model.Files;

@RepositoryRestResource(collectionResourceRel = "image", path = "image")
public interface FilesRepository extends MongoRepository<Files, String>{
	Files findByName(@Param("name") String name);
}
