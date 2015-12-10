package com.code.challenge.configuration;

import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class SpringMongoConfiguration extends AbstractMongoConfiguration{

	@Override
	protected String getDatabaseName() {
		return "code-challenge";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient("10.254.254.150:27017");
	}

}
