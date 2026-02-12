package fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StoreVowels 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		File f = new File("D://PSR//Vowels.text");
		try 
		{
			System.out.println(f.createNewFile());
			FileWriter fw = new FileWriter(f,true);
			System.out.println("Enter the String");
			String st =sc.next();
			
			for(int i=0;i<=st.length()-1;i++)
			{
				char ch = st.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
						ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				{
					fw.write(ch);
					fw.flush();
					
				}
				
			}
			fw.close();
			System.out.println("Strored");
		} 
		catch (IOException e) 
		{
			System.out.println("Handled...");
		}
	}
}

