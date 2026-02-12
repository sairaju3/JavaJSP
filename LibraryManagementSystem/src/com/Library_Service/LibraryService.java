package com.Library_Service;

import java.util.ArrayList;

import com.Library_Management_System.Book;

public class LibraryService 
{
	ArrayList<Book> library = new ArrayList<Book>();
	
	public void addBook(Book book)
	{
		library.add(book);
		System.out.println("Book added Successfully..");
	}
	public void removeBook(Book book)
	{
		library.remove(book);
		System.out.println("Book Removed Successfully..");
	}
	public void displayBooks()
	{
		if(library.isEmpty())
			System.out.println("No Books Available in the Library");
		else
		{
			System.out.println("Books List");
			for(int i=0;i<=library.size()-1;i++)
			{
				Book b = library.get(i);
				System.out.println(b);
				
			}
		}
	}
	public void returnBook(int id)
	{
		for(int i=0;i<=library.size()-1;i++)
		{
			Book b  = library.get(i);
			if(b.getId()==id)
			{
				b.setAvaiable(true);
				System.out.println("Book returned Successfully");
			}
			else
			{
				System.out.println("Book was Not Found ");
			}
			return;
		}
		System.out.println("Book Not Found..");
		
	}
	
	
}
