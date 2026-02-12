package method_programs;

import java.util.jar.Manifest;

public class MainApp 
{
	public static void main(String[] args) 
	{
		Flight flight1 = new Flight();
		flight1.fly("Sub class");
		flight1.fly(23);
	}
	
	
}
