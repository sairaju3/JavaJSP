package fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StoreUpperCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		File f = new File("D://PSR//mango.text");
		try 
		{
			System.out.println(f.createNewFile());
			FileWriter fw = new FileWriter(f,true);
			System.out.println("Enter the String");
			String st =sc.next();
			
			for(int i=0;i<=st.length()-1;i++)
			{
				char ch = st.charAt(i);
				if(Character.isUpperCase(ch))
				{
					fw.write(ch);
					fw.flush();
					
				}
				
			}
			fw.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Handled...");
		}
		
	}
}
