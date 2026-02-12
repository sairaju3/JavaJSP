package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile 
{
	public static void main(String[] args) {
		
		File f = new File("D://PSR//apple.doc");
		
		
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			
			System.out.println("Handled....");
		}
	}
}
