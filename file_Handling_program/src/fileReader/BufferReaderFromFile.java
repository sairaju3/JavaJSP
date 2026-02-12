package fileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderFromFile 
{
	public static void main(String[] args) 
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader("D://PSR//java.text"));
			String res=br.readLine();
			System.out.print(res);
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
