package com.employee_management_system;

import java.util.Random;

//Validation Layer
public class Employee_Validation 
{
	public static String generateId(String name)
	{
		Random r = new Random();
		char fc = name.charAt(0);
		char sc = name.charAt(1);
		char lc = name.charAt(name.length()-1);
		int rn = r.nextInt(999);
		
		String id = fc+""+sc+lc+rn;
		
		
		if(id.length()<6)
			id=id+"0";
		return id.toUpperCase();		
	}
}
