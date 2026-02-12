package fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Summation 
{
	public static void main(String[] args) 
	{
		try {
			FileReader fr = new FileReader("D://PSR//sum.txt");
			Long length=new File("D://PSR//sum.txt").length();
			int sum=0;
			for(int i=0;i<=length-1;i++)
			{
				sum=sum+fr.read();
				
			}
			System.out.println(sum);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
