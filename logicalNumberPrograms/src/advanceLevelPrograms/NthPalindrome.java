package advanceLevelPrograms;

import java.util.Scanner;

public class NthPalindrome 
{
	public static boolean checkPalindrome(int num)
	{
		int rev=0;
		int temp=num;
		while(num>0)
		{
			int ld=num%10;
			rev = (rev*10)+ld;
			num=num/10;
		}
		return rev==temp;
	}
	public static void checkNthPalindrome(int n)
	{
		int count=0;
		for(int i=1;;i++)
		{
			int num=i;
			if(checkPalindrome(num))
			{
				count++;
			}
			if(count==n)
			{
				System.out.println("The "+n+" th Palindrome Number = "+num);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number..");
		int n = sc.nextInt();
		checkNthPalindrome(n);
	}
	
}
