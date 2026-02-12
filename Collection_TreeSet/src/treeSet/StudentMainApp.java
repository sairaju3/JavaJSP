package treeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class StudentMainApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student(46, "Sai", 23, "B.Tach", "ECE", 2025);
		Student s2 = new Student(23, "Nani", 23, "B.Tach", "ECE", 2023);
		Student s3 = new Student(11, "Kalyan", 22, "B.Tach", "AIML", 2024);
		Student s4 = new Student(56, "Setty", 20, "B.Tach", "CSE", 2025);
		Student s5 = new Student(66, "Sweety", 24, "B.Tach", "MECH", 2024);
		
		TreeSet<Student> ts= new TreeSet<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		for(Student s : ts ) 
		{
			ts.add(s);
		}
		boolean condn=true;
		
		while(condn)
		{
			System.out.println("Select The Operation");
			System.out.println("1.Add Student Details");
			System.out.println("2.Display Student Deatils");
			System.out.println("3.Exit");
			int choice=sc.nextInt();
		
			switch (choice) {
			case 1: 
			{
				
				
			}break;
			case 2:
			{
				
			}break;
			case 3:{
				System.exit(0);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " +choice);
			}
			
		}
		
		
	}
}
