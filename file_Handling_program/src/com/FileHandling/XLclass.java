package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class XLclass 
{
	public static void main(String[] args) {
		
		File f = new File("PSR.xl");
		try {
			System.out.println(f.createNewFile());
		}
		catch(IOException e)
		{
			System.out.println("Handled....");
		}
	}
}
