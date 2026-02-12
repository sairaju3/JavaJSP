
package mutliWord_string;

import java.util.Scanner;

public class LongestWordInString 
{
	public static String longestWord(String st)
	{
		String[] words =st.split(" ");
		String longestW=words[0];
		for(int i=0;i<=words.length-1;i++)
		{
			String s = words[i];
			
			if(s.length()>longestW.length())
			{
				longestW=s;
			}
		}
		return longestW;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multi word string");
		String st = sc.nextLine();
		System.out.println("Longest Word :- "+longestWord(st));
	}
}
