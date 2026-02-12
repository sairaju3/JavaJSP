package priorityQueue1;

import java.util.PriorityQueue;
import java.util.Scanner;



public class MainApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student(1031, "Raju", 23, "Btech", "ECE", 2025);
		Student s2 = new Student(1052, "Rani", 21, "BTech", "CSE", 2025);
		Student s3 = new Student(1023, "Kumar", 24, "BTech", "ECE", 2025);
		Student s4 = new Student(1003, "Kamal", 22, "Btech", "AIDS", 2025);
		
		PriorityQueue<Student> pq = null;
		System.out.println("Choose the order");
		System.out.println("1.Baseed on ID");
		System.out.println("2.Baseed on Name");
		System.out.println("3.Baseed on Age");
		int choice =sc.nextInt();
		
		if(choice==1)
		{
			SortBaseOnId sortId=new SortBaseOnId();
			pq=new PriorityQueue<Student>(sortId);
		}
		else if(choice==2)
		{
			SortBaseOnName sortName=new SortBaseOnName();
			pq=new PriorityQueue<Student>(sortName);
		}
		else if(choice==3)
		{
			SortBaseOnAge sortAge = new SortBaseOnAge();
			pq= new PriorityQueue<Student>(sortAge);
		}
		else
		{
			System.out.println("Invalid choice....Enter Valid choice..");
		}
		
		pq.add(s1);
		pq.add(s2);
		pq.add(s3);
		pq.add(s4);
		for(Student s : pq)
		{
			System.out.println(s);
		}
	}
}
