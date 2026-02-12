package list_programs;

import java.beans.PropertyVetoException;
import java.util.List;
import java.util.Scanner;

public class CrudOperationMain<E> {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> li = new ListUtility<Integer>().typeOfList();


		boolean cond = true;
		while (cond)
		{
			System.out.println("Enter Choice...");
			System.out.println("1.Add an Element");
			System.out.println("2.Remove an Element");
			System.out.println("3.Update an Element");
			System.out.println("4.Read all Elements");
			System.out.println("5.Exit");
			int choice = sc.nextInt();
			if (choice == 1)
			{
				System.out.println("How Many Elements?...");
				int n = sc.nextInt();
				for (int i = 0; i <n; i++)
				{
					System.out.println("Enter the elements one-by-one " + i);
					int ele = sc.nextInt();
					li.add(ele);
				}
				System.out.println("Elements Inserted Sucesfully..");
			} 
			else if (choice == 2)
			{
				if(li.isEmpty())
					System.out.println("No Elements Present in the List");
				else
				{
					System.out.println("Enter the Index to Remove");
					int index = sc.nextInt();
					if (index >= 0 && index < li.size()) 
					{
						int ele =li.remove(index);
						System.out.println(ele+" Removed Successfilly");
					}
					else
						System.out.println("Invalid Index..");
				}
			} 
			else if (choice == 3)
			{
				if(li.isEmpty())
					System.out.println("No Elements Present in the List");
	
				else
				{
					System.out.println("Enter the Update Index... ");
					int index = sc.nextInt();
					if (index >= 0 && index < li.size()) 
					{
						System.out.println("Enter The Index value");
						int value = sc.nextInt();
						int prevele =li.set(index, value);
						System.out.println(prevele+" Updated Successfully..."+value);
					} 
					else
						System.out.println("Invalid Index..");
				}
			} 
			else if (choice == 4) 
			{
				if(li.isEmpty())
					System.out.println("No Elements Present in the List");
				else
				{
					System.out.println("Read all the Elements");
					System.out.println("[ ");
					for(int i=0;i<=li.size()-1;i++)
					{
						if(i==li.size()-1)
							System.out.println(li.get(i)+"");
						else
							System.out.print(li.get(i)+", ");
					}
					System.out.println(" ]");
					System.out.println();
				}
		
			} 
			else if(choice==5)
			{
				System.exit(0);
				System.out.println("Program Exited");
			//	cond = false;
			}
			else
				System.out.println("Enter valid choice...");
		}

	}

}
