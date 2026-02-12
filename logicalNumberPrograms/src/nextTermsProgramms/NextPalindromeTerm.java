
package nextTermsProgramms;

import java.util.Scanner;

public class NextPalindromeTerm 
{
	public static boolean checkPalindrome(int num)
	{
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int ld=num%10;
			rev=(rev*10)+ld;
			num=num/10;
		}
		return rev==temp;
	}
	public static void checkNextPlaindrome(int num)
	{
		
		for(int i=num+1;;i++)
		{
			int	next=i;
			if(checkPalindrome(next))
			{
				System.out.println("The Next Palindrome number "+num+" is "+next);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		checkNextPlaindrome(num);
	}
}
