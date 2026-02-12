package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo 
{
	public static void main(String[] args) 
	{
		File f = new File("JSP.pdf");
		try {
			System.out.println(f.createNewFile());
		}
		catch(IOException e) {
			System.out.println("Handled....");
		}
	}
}
