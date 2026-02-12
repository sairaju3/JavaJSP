package com.FileHandling;

import java.io.File;

public class FolderInsideFile 
{
	public static void main(String[] args) {
		
		File f = new File("JSpiders");
		
		boolean file = f.mkdir();
		System.out.println(file);
	}
}
