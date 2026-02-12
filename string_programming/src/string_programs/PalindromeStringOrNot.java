package string_programs;

import java.util.Scanner;

public class PalindromeStringOrNot 
{
	public static String reverseString(String st)
	{
		String newString="";
		for(int i=st.length()-1;i>=0;i--)
		{
			newString=newString+st.charAt(i);
		}
		return newString;
	}
	public static boolean checkPalindrome(String st)
	{
		String reverse = reverseString(st);
		return st.equalsIgnoreCase(reverse);
	}
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String..");
		String st=sc.next();
		
		if(checkPalindrome(st))
			System.out.println("'"+st+"' is a Palindrome Strinng");
		else
			System.out.println("'"+st+"' is Not a palindrome String");
		
	}
}
