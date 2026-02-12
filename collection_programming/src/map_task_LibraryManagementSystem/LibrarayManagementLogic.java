package map_task_LibraryManagementSystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class LibrarayManagementLogic 
{
	
	Map<String , Book> map = new LinkedHashMap<>();
	
	
	public static String generateBookId(String bookName,String authorName)
	{
		String part1 = bookName.substring(0,3).toUpperCase();
		
		Random r = new Random();
		int num=r.nextInt(900)+100;
		
		char first = authorName.charAt(0);
		char last = authorName.charAt(authorName.length()-1);
		
		return part1+num+first+last;
	}
	public void addBook()
	{
		
	}
	public void removeBook()
	{
		
	}
	public void updateBook()
	{
		
	}
	public void searchBook()
	{
		
	}
	public void removeAllEntities()
	{
		
	}
}
