package mutliWord_string;

import java.util.Scanner;

public class CountNoOfwords 
{
	public static void countWords(String st)
	{
		int count=0;
		String[] word = st.split(" ");
		for(int i=0;i<=word.length-1;i++)
		{
			String s = word[i];
			//System.out.println(s);
			count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multi word string");
		String st = sc.nextLine();
		countWords(st);
		 
	}
}
