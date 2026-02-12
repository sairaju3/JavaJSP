package singleTonDesignPattern_programs;

import java.util.Scanner;

public class MainApp 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean start =true;
		while(start)
		{
			System.out.println("Enter The Choice \n1.Create AadharCard\n2.Create VoterId \n3.Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				AadharCard.createAadharObject();
			}break;
			case 2:
			{
				VoterId.createVoterIdObject();
			}break;
			case 3:
			{
				start=false;
				System.out.println("Thank You..");
			}break;
			default:System.out.println("Enter the Valid Choice..");
			}
		}
	}
}
