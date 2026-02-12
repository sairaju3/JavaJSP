package fileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StoreDataIntoFile 
{
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("D://PSR//fos.txt");
			String s="Nani";
			byte[] b =s.getBytes();
			//System.out.println(Arrays.toString(b));
			fos.write(b);
			fos.flush();
			fos.close();
			System.out.println("Data Stored");
			
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
