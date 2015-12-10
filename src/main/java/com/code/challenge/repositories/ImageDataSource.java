package com.code.challenge.repositories;

import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class ImageDataSource extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "code-challenge";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient("10.254.254.150:27017");
	}
}
