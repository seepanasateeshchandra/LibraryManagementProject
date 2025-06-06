package com.tap.model;

public class Book {
	
	private int id;
	
	private String title;
	
	private String author;
	
	private String category;
	
	private String isAvailable;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String isAvailable() {
		return isAvailable;
	}

	public void setAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	

	public Book(int id, String title, String author, String category, String isAvailable) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.category = category;
		this.isAvailable = isAvailable;
	}
	
	

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", isAvailable=" + isAvailable + "]";
	}
	
	

}
