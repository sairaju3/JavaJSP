package com.Library_Management_System;

public class Book 
{
	private int id;
	private String titel;
	private String author;
	private boolean isAvaiable;
	
	public Book(int id, String titel, String author, boolean isAvaiable) 
	{
		this.id = id;
		this.titel = titel;
		this.author = author;
		this.isAvaiable = isAvaiable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvaiable() {
		return isAvaiable;
	}

	public void setAvaiable(boolean isAvaiable) {
		this.isAvaiable = isAvaiable;
	}

	@Override
	public String toString() 
	{
		return "Book [id=" + id + ", titel=" + titel + ", author=" + author + ", isAvaiable=" + isAvaiable + "]";
	}
	
}
