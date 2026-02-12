package encapuslationProgramms;

import java.io.Serializable;
public class Book implements Serializable 
{
	private String title;
	private String author;
	private int cost;
	private int noOfPages;
	private String publisher;
	
	public Book() {
		
	}

	public Book(String title, String author, int cost, int noOfPages, String publisher) 
	{
		if(validateTitle(title))
		{
			this.title = title;
		}
		if(validateAuthor(author))
		{
			this.author = author;
		}
		if(validateCost(cost))
		{
			this.cost = cost;
		}
		if(validateNoOFPages(noOfPages))
		{
			this.noOfPages = noOfPages;
		}
		if(validatePublisher(publisher))
		{
			this.publisher = publisher;
		}
	}
	public boolean validateTitle(String title)
	{
		if(title.equals("Java") || title.equals("Python"))
		{
			return true;
		}
		else
		{
			System.out.println("Title MisMatch");
			return false;
		}
	}
	public boolean validateAuthor(String author)
	{
		if((author.equals("James") || author.equals("Scott")) &&(author.length()>=3))
		{
			return true;
		}
		else
		{
			System.out.println("Invalid Author");
			return false;
		}
	}
	public boolean validateCost(int cost)
	{
		if(cost>=30 || cost<=2000)
		{
			return true;
		}
		else
		{
			System.out.println("Invlaid Cost");
			return false;
		}
	}
	public boolean validateNoOFPages(int noOfPages)
	{
		if(noOfPages>=50 || noOfPages<=200)
		{
			return true;
		}
		else
		{
			System.out.println("Invalid Pages");
			return false;
		}
	}
	public boolean validatePublisher(String publisher)
	{
		if(publisher.length()>4)
		{
			return true;
		}
		else
		{
			System.out.println("Invalid Publishers");
			return false;
			
		}
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getAuthor() 
	{
		return author;
	}

	public void setAuthor(String author) 
	{
		this.author = author;
	}

	public int getCost() 
	{
		return cost;
	}

	public void setCost(int cost) 
	{
		this.cost = cost;
	}

	public int getNoOfPages() 
	{
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) 
	{
		this.noOfPages = noOfPages;
	}

	public String getPublisher() 
	{
		return publisher;
	}

	public void setPublisher(String publisher) 
	{
		this.publisher = publisher;
	}
	public void display()
	{
		System.out.println(" "+getTitle());
		System.out.println(" "+getAuthor());
		System.out.println(" "+getCost());
		System.out.println(" "+getNoOfPages());
		System.out.println(" "+getPublisher());
	}
	
}
