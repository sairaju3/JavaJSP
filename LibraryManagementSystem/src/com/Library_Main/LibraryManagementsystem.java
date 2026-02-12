package com.Library_Main;

import java.util.Scanner;

import com.Library_Management_System.Book;
import com.Library_Service.LibraryService;
import com.sun.tools.classfile.StackMapTable_attribute.chop_frame;

public class LibraryManagementsystem 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LibraryService service = new LibraryService();
		boolean condn=true;
		
		while(condn)
		{
			System.out.println("");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
			{
				System.out.println("Enter the book id ");
				int id=sc.nextInt();
				System.out.println("Enter the Titel");
				String title=sc.nextLine();
				System.out.println("Enter Author Name");
				String author=sc.nextLine();
				Book newBook = new Book(id,title,author, condn);
				service.addBook(newBook);
			}break;
			case 2:{
				
			}break;
			case 3:{
				
			}break;
			case 4:{
				
			}break;
			default:
				
			}
		}
		
	}
}
