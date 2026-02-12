package logicalNumberPrograms;

import java.util.Scanner;
public class PalindromOrNot 
{
	public static int reverse(int num)
	{
		int reverse = 0;
		while(num>0)
		{
			int ld = num%10;
			reverse=(reverse*10)+ld;
			num=num/10;
		}
		return reverse;
	}
	public static void checkPalindrom(int num)
	{
		int reverse = reverse(num);
		if(num==reverse)
			System.out.println(num+" is a palindrome");
		else
			System.out.println(num+" is not a Palindrome");		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		checkPalindrom(num);
	}

}
