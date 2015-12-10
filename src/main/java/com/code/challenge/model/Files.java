package com.code.challenge.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "files")
public class Files {

	@Id
	private String id;
	private String name;
	private String url;
	private String year;
	private String category;
	
	
	public Files() {
		super();
	}
	public Files(String id, String url, String year, String category) {
		super();
		this.id = id;
		this.url = url;
		this.year = year;
		this.category = category;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Files [id=" + id + ", name=" + name + ", url=" + url
				+ ", year=" + year + ", category=" + category + "]";
	}
	
	
	
}
