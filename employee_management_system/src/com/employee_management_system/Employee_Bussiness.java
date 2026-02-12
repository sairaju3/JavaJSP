package com.employee_management_system;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

//Logic Layer
public class Employee_Bussiness 
{
	static Scanner sc = new Scanner(System.in);
	public static void welcomeHeader(String st) throws InterruptedException
	{
		for(int i=0;i<=st.length()-1;i++)
		{
			System.out.print(st.charAt(i));
			Thread.sleep(10);
		}
		System.out.println();
	}
	public static int generateOTP()
	{
		Random r = new Random();
		int otp = r.nextInt(9999);
		return otp;
		
	}
	public static Employee addEmployee()
	{
		System.out.println("Enter The Employee Name");
		String EmpName=sc.next();
		System.out.println("Enter the Employee Age");
		int age = sc.nextInt();
		System.out.println("Enter the Employee Mobile Number");
		long moblieNo=sc.nextLong();
		
		System.out.println("Enter The Employee EmailId");
		String emailId=sc.next();
		System.out.println("Enter Employee Type (Developer/Tester/Hr)");
		String empType=sc.next();
		System.out.println("Enter the Employee Designation");
		String designation =sc.next();
		System.out.println("Enter the Employee Salary");
		double salary=sc.nextDouble();
		System.out.println("Enter The Employee Year's of Experience");
		double yoe=sc.nextDouble();
		
		return new Employee(EmpName, age, emailId, empType, designation, salary, yoe);
	}
	public static void readAllEmployeeDetails(List<Employee> li)
	{
		System.err.println("============All Employee Details================");
		for(Employee e :li)
		{
			System.out.println(e);
		}
	}
	public static boolean removeEmployee(List<Employee> li)
	{
		return li.remove(li);
		 
		
	}
}
