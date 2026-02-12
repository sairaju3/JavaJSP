package mutliWord_string;

import java.util.Scanner;

public class RverseTheEachWordOfString 
{
//	public static String reverseWord(String st)
//	{
//		String reverseWord="";
//		for(int i=st.length()-1;i>=0;i--)
//		{
//			char ch=st.charAt(i);
//			reverseWord=reverseWord+ch;
//		}
//		return reverseWord;
//	}
	public static void reverseEachWord(String st)
	{
		
		String[] words =st.split(" ");
		for(int i=0;i<=words.length-1;i++)
		{
			String newString="";
			String s = words[i];
			for(int j=0;j<=s.length()-1;j++)
			{
				char ch=s.charAt(j);
				newString=ch+newString;
			}
			System.out.println(s+"----->"+newString);
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multi word string");
		String st = sc.nextLine();
		
		 reverseEachWord(st);
	}
}
