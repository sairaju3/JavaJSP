package fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile 
{
	public static void main(String[] args) {
		
		File f = new File("D://PSR//java.text");
		
		try 
		{
			System.out.println(f.createNewFile());
			FileWriter fw = new FileWriter(f,true);
			fw.write("ABCD ");
			fw.flush();
			fw.close();
			System.out.println("Sucessfull");
		} 
		catch (IOException e) 
		{
			System.out.println("Handled...");
		}
	}
}
