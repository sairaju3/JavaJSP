package serializableI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainClass 
{
	public static void main(String[] args) {
		
		Employee emp = new Employee("Nani", 303, 300000);
		
		try {
			FileOutputStream fos = new FileOutputStream("D://PSR//emp.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.flush();
			oos.close();
			System.out.println("Data Stored");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
