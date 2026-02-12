package org.jsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class PerformCRUD 
{
	public static void signup_hr()
	{
		System.out.println("Enter name");
		String name=CreateScanner.sc.next();
		
		System.out.println("Enter Email");
		String email=CreateScanner.sc.next();
		
		System.out.println("Enter password");
		String password=CreateScanner.sc.next();
		
		System.out.println("Enter Number");
		long number=CreateScanner.sc.nextLong();
		
		Hr hr = new Hr();
		hr.setName(name);
		hr.setEmail(email);
		hr.setPassword(password);
		hr.setNumber(number);
		
		
		
		File file = new File(email+".txt");
		if(!file.exists())
		{
			try 
			{
				file.createNewFile();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		try 
		{
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(hr);
			objectOutputStream.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("SignUp Sucessfull");
		System.out.println("Please login");
		for(int i=1;i<=5;i++)
		{
			System.out.print('.');
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		System.out.println();
		hr_login();
	}
	//@SuppressWarnings("resource")
	public static void hr_login()
	{
		System.out.println("Enter email");
		String email=CreateScanner.sc.next();
		System.out.println("Enter Password");
		String password=CreateScanner.sc.next();
		
		File file=new File(email+".txt");
		if(!file.exists())
		{
			throw new UserNotFoundException("User not Fount with email "+email);
		}
		try 
		{
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			Hr hr =(Hr) inputStream.readObject() ;
					
			if(hr.getPassword().equals(password))
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Invalid Password Please try again");
				hr_login();
			}
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Student CRUD Operation
	public static void signup_student()
	{
		System.out.println("Enter name");
		String name=CreateScanner.sc.next();
		
		System.out.println("Enter Email");
		String email=CreateScanner.sc.next();
		
		System.out.println("Enter password");
		String password=CreateScanner.sc.next();
		
		System.out.println("Enter Number");
		long number=CreateScanner.sc.nextLong();
		
		Student student = new Student();
		student.setName(name);
		student.setEmail(email);
		student.setPassword(password);
		student.setNumber(number);
		
		
		File file = new File(email+".txt");
		if(!file.exists())
		{
			try 
			{
				file.createNewFile();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student);
			objectOutputStream.flush();
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("SignUp Sucessfull");
		System.out.println("Please login");
		for(int i=1;i<=5;i++)
		{
			System.out.print('.');
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println();
		student_login();
	}
	
	public static void student_login()
	{
		System.out.println("Enter email");
		String email=CreateScanner.sc.next();
		System.out.println("Enter Password");
		String password=CreateScanner.sc.next();
		
		File file=new File(email+".txt");
		if(!file.exists())
		{
			throw new UserNotFoundException("User not Fount with email "+email);
		}
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			Student student =(Student) inputStream.readObject() ;
					
			if(student.getPassword().equals(password))
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Invalid Password Please try again");
				student_login();
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
