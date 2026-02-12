package deque;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LIFO lifo = new LIFO();
		FIFO fifo = new FIFO();
		
		while(true)
		{
			System.out.println("Select the type of Order");
			System.out.println("1.LIFO");
			System.out.println("2.FIFO");
			System.out.println("3.Exit");
			int choice=sc.nextInt();
			if(choice==1)
			{
				lifo.crudOperation();
			}
			else if(choice==2)
			{
				fifo.crudOperation();
			}
			else if(choice==3)
			{
				System.exit(0);
			}
			else
				System.out.println("Inavlid Choice");
				
		}
		
	}
}
