package practice;

import java.util.Scanner;

public class NthPalindromeNum 
{
	public static boolean checkPlaindrome(int num)
	{
		int rev=0;
		int temp=num;
		while(num>0)
		{
			int ld=num%10;
			rev=(rev*10)+ld;
			num=num/10;
		}
		return rev==temp;
	}
	public static void nthPalindrome(int n)
	{
		int count=0;
		for(int i=1;true;i++)
		{
			int num=i;
			if(checkPlaindrome(num))
			{
				count++;
			}
			if(count==n)
			{
				System.out.println("The "+n+" palindrome is "+num);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal value");
		int num=sc.nextInt();
		nthPalindrome(num);
	}
}
