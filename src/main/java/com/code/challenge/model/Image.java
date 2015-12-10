package com.code.challenge.model;

public class Image {

	private String name;
	private String url;
	private String type;
	private String category;
	private int year;

	public Image(String name, String url, String type, String category, int year) {
		this.name = name;
		this.url = url;
		this.type = type;
		this.category = category;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
