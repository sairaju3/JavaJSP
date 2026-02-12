package deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class LIFO 
{
	private Deque<Integer> dq = new LinkedList<Integer>();
	
	public void crudOperation()
	{
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.println("Select the type of Oeder");
			System.out.println("1.Inser Element");
			System.out.println("2.Remove an Element");
			System.out.println("3.Read all Elements");
			System.out.println("4.Exit");
			
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1: {
				
				System.out.println("How Many Elements");
				int n = sc.nextInt();
				System.out.println("Enter the Elements one by one");
				for(int i=1;i<=n;i++)
				{
					int ele=sc.nextInt();
					dq.addLast(ele);
				}
				System.out.println(dq);
				
			}break;
			case 2: {
				if(dq.isEmpty())
					System.out.println("Deque is Empty");
				else {
					int ele = dq.removeLast();
					System.out.println("Element remove - "+ele);
				}
				
			}break;
			case 3: {
				if(dq.isEmpty())
					System.out.println("No Element Present");
				else
					System.out.println(dq);
				
			}break;
			case 4: {
				
				System.exit(0);
				
			}break;
			default:
				System.out.println("Invalid choice....Enter Valid Choice.");
			}
		}
	}
}
