package com.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsCheck 
{
	public static void main(String[] args) {
		
//		File f = new File("D://PSR//sai.doc");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("D://PSR//sai.doc"));
			String res= br.readLine();
			System.out.println(res);

		} 
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
