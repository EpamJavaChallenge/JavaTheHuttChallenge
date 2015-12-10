package com.code.challenge.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "image")
public class ImageInfo {

	@Id
	private Integer id;
	private String name;
	private String type;
	private String category;
	private Integer year;

	public ImageInfo() {
		// TODO Auto-generated constructor stub
	}

	public ImageInfo(Integer id, String name, String type, String category, Integer year) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.category = category;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", name=" + name + ", type=" + type + ", category=" + category + ", year=" + year
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
