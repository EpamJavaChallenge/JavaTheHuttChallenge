package com.code.challenge.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class MongoConfiguration extends AbstractMongoConfiguration {

	private static final String DB_NAME = "code-challenge", DB_IP = "10.254.254.150";
	
	@Override
	protected String getDatabaseName() {
		return DB_NAME;
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient(DB_IP);
	}

}
