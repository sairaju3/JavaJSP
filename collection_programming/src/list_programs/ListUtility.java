package list_programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;



public class ListUtility<E> 
{
	public List<E> typeOfList()
	{
		Scanner sc = new Scanner(System.in);
		
		List<E> li =null;
		System.out.println("select choice");
		System.out.println("1.ArrayList");
		System.out.println("2.LinkedList");
		System.out.println("3.Vector");
		
		int choice = sc.nextInt();
		if(choice==1)
			li=new ArrayList<E>();
		else if(choice==2)
			li = new LinkedList<E>();
		else if(choice==3)
			li = new Vector<E>();
		else
			System.out.println("Invalid Choice");
		return li;
	}
}
