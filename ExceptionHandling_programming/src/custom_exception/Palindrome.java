package custom_exception;

import java.util.Scanner;

public class Palindrome 
{
	public static void palindrome(int num)
	{
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int ld=num%10;
			rev=(rev*10)+ld;
			num=num/10;
		}
		if(rev==temp)
		{
			System.out.println(temp+" is palindrome Number..");
		}
		else
		{
			PalindromeCustomeException p = new PalindromeCustomeException();
			throw p;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		palindrome(num);
	}
}
