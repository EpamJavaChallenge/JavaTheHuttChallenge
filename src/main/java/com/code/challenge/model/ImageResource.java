package com.code.challenge.model;

public class ImageResource {
	private long id;
	private String type;
	private String category;
	private String year;
	private String url;
	
	public ImageResource() {
		// TODO Auto-generated constructor stub
	}
	
	public ImageResource(long id, String type, String category, String year, String url) {
		super();
		this.id = id;
		this.type = type;
		this.category = category;
		this.year = year;
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "ImageResource [id=" + id + ", type=" + type + ", category=" + category + ", year=" + year + ", url="
				+ url + "]";
	}
	
}
