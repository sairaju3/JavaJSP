package mutliWord_string;

import java.util.Scanner;

public class PalindromWord 
{
	public static boolean reverse(String st)
	{
		String reverseWord="";
		String pst=st;
		for(int i=st.length()-1;i>=0;i--)
		{
			char ch=st.charAt(i);
			reverseWord=reverseWord+ch;
		}
		return reverseWord.equals(pst);
	}
//	public static boolean checkPalindrome(String st)
//	{
//		return reverse(st).equalsIgnoreCase(st);
//	}
	public static void reverseEachWord(String st)
	{
		boolean cond=true;
		String[] words =st.split(" ");
		for(int i=0;i<=words.length-1;i++)
		{
			String s = words[i];
			if(reverse(s))
			{
				System.out.println(s);
				cond=false;
			}
		}
		if(cond)
			System.out.println("No Palindrome Words");
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multi word string");
		String st = sc.nextLine();
		
		 reverseEachWord(st);
	}
}
