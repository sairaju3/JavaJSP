package linkedHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainApp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Set<MovieTicket> set = new SetUtility().typeOfSet();
		
		System.out.println("Select the Choice");
		System.out.println("1.Admin");
		System.out.println("2.User");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Select the option ");
			System.out.println("1.Add a Movie ticket");
			System.out.println("2.Remove a Movie Ticket");
			System.out.println("3.Display a Movie");
			System.out.println("4.Exit");
			
			int option=sc.nextInt();
			switch(option)
			{
			case 1:{}break;
			case 2:{}break;
			case 3:{}break;
			case 4:{}break;
			default:{};
			
			}
			
		}
		else if(choice==2)
		{
			System.out.println("Select the Movie");
			MovieTicket_Bussiness.displayMovieName();
			int movieT=sc.nextInt();
			System.out.println("-------Book a Ticket-------");
			System.out.println("How Many Tickets? ");
			int n=sc.nextInt();
			String[] seatNo=new String[n]; 
			MovieTicket_Bussiness.availableSeats();
			System.out.println("Enter the set Number One-By_One");
			
			for(int i=0;i<=seatNo.length-1;i++)
			{
				seatNo[i]=sc.next();
			}
			System.out.println("Select Seat no "+Arrays.toString(seatNo));
		}
		
	}
}
