package mutliWord_string;

import java.util.Scanner;

public class ShortestPalindrome 
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
	public static String shortestWord(String st)
	{
		String[] words =st.split(" ");
		String longestW="";
		for(int i=0;i<=words.length-1;i++)
		{
			String s = words[i];
			
			if(checkPalindrome(s))
			{
				if(longestW.isEmpty() && s.length()>longestW.length())
				{
					longestW=s;
					
				}
				else if(s.length()<longestW.length())
				{
					longestW=s;
				}	
			}
		}
		return longestW;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multi word string");
		String st = sc.nextLine();
		String shortestW=shortestWord(st);
		if(shortestW.isEmpty())
			System.out.println("No palindrome");
		else 
			System.out.println("Shortest Palindrome Word"+shortestW);
		
	}
}

