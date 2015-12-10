package com.code.challenge.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.code.challenge.model.File;

public interface FilesRepository extends MongoRepository<File, Long> {

	List<File> findByCategoryAndUrlLike(String category, String url);
	
}
