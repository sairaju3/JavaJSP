package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class InsideFile {
	public static void main(String[] args) {
		
		File f = new File("JSpiders//abc.text");
		
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			System.out.println("Handled....");
		}
	}

}
