package map_task_LibraryManagementSystem;


import java.util.HashMap;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LibrarayManagementLogic lm = new  LibrarayManagementLogic();
		
		while(true)
		{
			System.out.println("Select The Map");
			System.out.println("1.HashMap");
			System.out.println("2.LinkedHashMap");
			System.out.println("3.treeMap");
			int choice=sc.nextInt();
			if(choice==1)
			{
			
			}
			else if(choice==2)
			{
				
			}
			else if(choice==3)
			{
				
			}
			else
			{
				System.exit(0);
			}
			
		}
	}
}
