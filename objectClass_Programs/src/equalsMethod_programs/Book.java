package equalsMethod_programs;

import java.io.ObjectInputStream.GetField;

public class Book 
{
	private String title;
	private String author;
	private int cost;
	private int noOfPages;
	
	public Book(String title, String author, int cost, int noOfPages) {
		super();
		this.title = title;
		this.author = author;
		this.cost = cost;
		this.noOfPages = noOfPages;
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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public  void display()
	{
		System.out.println("Title :"+getTitle());
		System.out.println("Title :"+getAuthor());
		System.out.println("Title :"+getCost());
		System.out.println("Title :"+getNoOfPages());
	}
	public String toString()
	{
		return "Author : "+getAuthor()+"\nCost : "+getCost()+"\nTitle : "+getTitle();
	}
	public boolean equales(Object obj)
	{
		Book b3=(Book)obj;
		return this.noOfPages==b3.noOfPages;
		
	}
	
	
}
