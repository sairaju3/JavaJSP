package mutliWord_string;

import java.util.Scanner;

public class PalindromeVowels 
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
	public static void reverseEachWord(String st)
	{
		boolean cond=true;
		String[] words =st.split(" ");
		for(int i=0;i<=words.length-1;i++)
		{
			String s = words[i];
			if(checkPalindrome(s))
			{
				cond=false;
				 String vowels = "";
				for(int j=0;j<=s.length()-1;j++)
				{
					char ch=s.charAt(j);
					if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
					{
						vowels=vowels+ch+" ";
					}
				}
				if(!vowels.isEmpty())
					System.out.println(s+"--------> "+vowels);
				else
					System.out.println(s+"--- no vowels");
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
