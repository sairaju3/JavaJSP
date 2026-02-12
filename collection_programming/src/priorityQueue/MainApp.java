package priorityQueue;

import java.util.PriorityQueue;

public class MainApp 
{
	public static void main(String[] args) 
	{
		
		Student s1 = new Student(1031, "Raju", 23, "Btech", "ECE", 2025);
		Student s2 = new Student(1052, "Rani", 21, "BTech", "CSE", 2025);
		Student s3 = new Student(1023, "Kumar", 24, "BTech", "ECE", 2025);
		Student s4 = new Student(1003, "Kamal", 22, "Btech", "AIDS", 2025);
		
		PriorityQueue<Student> pq = new PriorityQueue<Student>();
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
