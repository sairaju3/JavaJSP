package org.jsp;

public class Drive 
{
	public static void main(String[] args) 
	{	
		System.out.println("Choose");
		System.out.println("1. Hr");
		System.out.println("2. Student");
		int choice = CreateScanner.sc.nextInt();
		
		switch (choice) 
		{
		case 1: 
		{
			hr();
			break;
		}
		case 2:
		{
			student();
			break;
		}
		default:
			throw new InvalidChoiceException("Wrong choice Entered Please Try Again ");
		}
	}
	public static void hr()
	{
		System.out.println("Enter choice");
		System.out.println("1.login");
		System.out.println("2.SignUp");
		int choice=CreateScanner.sc.nextInt();
		switch (choice) {
		case 1: 
		{
			PerformCRUD.hr_login();
			break;
		}
		case 2:
		{
			PerformCRUD.signup_hr();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}
	public static void student()
	{
		System.out.println("Enter choice");
		System.out.println("1.login");
		System.out.println("2.SignUp");
		int choice=CreateScanner.sc.nextInt();
		switch (choice) {
		case 1: 
		{
			PerformCRUD.student_login();
			break;
		}
		case 2:
		{
			PerformCRUD.signup_student();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}
}
