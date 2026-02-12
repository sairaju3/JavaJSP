package fileInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UsingBuffer 
{
	public static void main(String[] args) {
		
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D://PSR//readIS.txt"));
			
			byte[] b= bis.readAllBytes();
			
			for(int i=0;i<=b.length-1;i++)
			{
				System.out.print((char)b[i]);
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
