package fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadtheDateFromFile 
{
	public static void main(String[] args) {
		
		try 
		{
			FileReader fr = new FileReader("D://PSR//nani.txt");
			Long length = new File("D://PSR//nani.txt").length();
			for(int i=0;i<=length-1;i++)
			{
				System.out.print((char)fr.read());
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
