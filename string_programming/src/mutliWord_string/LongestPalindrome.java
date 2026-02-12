package mutliWord_string;

import java.util.Scanner;

public class LongestPalindrome 
{
	public static String reverse(String st)
	{
		
		String reverseWord="";
		String pst=st;
		for(int i=st.length()-1;i>=0;i--)
		{
			char ch=st.charAt(i);
			reverseWord=reverseWord+ch;
		}
		return reverseWord;
	}
	public static boolean checkPalindrome(String st)
	{
		return reverse(st).equalsIgnoreCase(st);
	}
	public static void longestWord(String st)
	{
		boolean cond=true;
		String[] words =st.split(" ");
		String longestW=words[0];
		for(int i=0;i<=words.length-1;i++)
		{
			String s = words[i];
			
			if(checkPalindrome(s))
			{
				if(s.length()>longestW.length())
				{
					longestW=s;
					cond=false;
				}
			}
		}
		if(cond)
			System.out.println("No palindrome Words...");
		else 
			System.out.println("Longest Palindrome word :- "+longestW);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multi word string");
		String st = sc.nextLine();
		longestWord(st);
	}
}

