package string_programs;

import java.util.Arrays;
import java.util.Scanner;

public class CorrsepondingCharArray 
{
	public static char[] toCharArray(String st)
	{
		char[] ch = new char[(st.length())] ;
		
		for(int i=0;i<=st.length()-1;i++)
		{
			ch[i]=st.charAt(i);
		}
		return ch;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String...");
		String st = sc.next();
		char[] ch = toCharArray(st);
		System.out.println("Character Array : "+Arrays.toString(ch));
		
	}
}
