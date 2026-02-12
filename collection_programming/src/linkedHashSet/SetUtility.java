package linkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class SetUtility 
{
	public Set<MovieTicket> typeOfSet()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the type of set");
		System.out.println("1.HashSet");
		System.out.println("2.LinkedHashSet");
		int choice=sc.nextInt();
		
		Set<MovieTicket> set =null;
		if(choice==1)
		{
			set=new HashSet<MovieTicket>();
		}
		else if(choice==2)
		{
			set=new LinkedHashSet<MovieTicket>();
		}
		return set;
	}
	
		
}



