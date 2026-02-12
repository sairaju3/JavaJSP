package com.employee_management_system;
//User Layer

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Employee_Main 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		Employee_Validation ev = new Employee_Validation();
//		Employee e1 = new Employee("Nani", 23, "nani@3303","Developer", "", 20000, 2.5);
		
		Scanner sc = new Scanner(System.in);
		List<Employee> li = new ArrayList<Employee>();
		String st ="------------Employee Management System------------";
		Employee_Bussiness.welcomeHeader(st);
		
		
		System.out.println("Login to Your Account");
		
		System.out.println("Enter The Mobile Number");
		long mn = sc.nextLong();
		
		long genOTP = Employee_Bussiness.generateOTP();
		System.out.println("OTP Generated :- "+genOTP);
		System.out.println("Enter the OTP");
		int enOTP = sc.nextInt();
		if(enOTP==genOTP)
		{
			System.out.println("Login Successfully");
			while(true)
			{
				System.out.println("Select an Operation");
				System.out.println("1.Add an Employee");
				System.out.println("2.Remove an Employee");
				System.out.println("3.Update an Employee Details");
				System.out.println("4.Read all Employee Details");
				int choice = sc.nextInt();
				switch (choice) 
				{
				case 1: 
				{
					Employee e =Employee_Bussiness.addEmployee();
					li.add(e);
					Employee_Bussiness.welcomeHeader("Employee Added Successfully!");
					
					
				}break;
				case 2:
				{
					//Employee e = Employee_Bussiness.removeEmployee(li);
					
				}break;
				case 3:
				{
					
				}break;
				case 4:
				{
					Employee_Bussiness.readAllEmployeeDetails(li);
				}break;
				case 5:
				{
					System.out.println("LogOut Successfull");
					System.exit(0);
					
				}break;
				default:
					
				}
			}
		}
		else
		{
			System.out.println("Invalid OTP ...\nPlease try again..");
		}
	}
	
}
