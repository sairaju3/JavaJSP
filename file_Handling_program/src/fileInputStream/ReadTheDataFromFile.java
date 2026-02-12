package fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTheDataFromFile 
{
	public static void main(String[] args) 
	{
		try {
			FileInputStream fis = new FileInputStream("D://PSR//readIS.txt");
			
			int size=fis.available();
			byte[] b= new byte[size];
			fis.read(b);
			String s= new String(b);
			int num=Integer.parseInt(s);
			System.out.println(num);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
