package fileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReverseTheStringUsingBufferedReader 
{
	public static void main(String[] args) 
	{	
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader("D://PSR//reverse.text"));
			String res=br.readLine();
			System.out.print(res);
			String rev="";
			for(int i=0;i<=res.length()-1;i++)
			{
				char ch=res.charAt(i);
				rev=ch+rev;
			}
			System.out.println();
			System.out.println(rev);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(IOException e) 
		{
			System.out.println("Handled...");
		}
	}
}
