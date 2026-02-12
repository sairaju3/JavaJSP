package advance_level_programming1;

import java.util.Scanner;

public class AnagramStrings 
{
	public static char[] toCharArray(String st)
	{
		char[] ch =new char[st.length()];
		for(int i=0;i<=st.length()-1;i++)
		{
			ch[i]=st.charAt(i);
		}
		return ch;
	}
	public static String ascendingOrder(String st)
	{
		char[] ch=toCharArray(st);
		for(int i=0;i<=ch.length-1;i++)
		{
			for(int j=i+1;j<=ch.length-1;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		return toString(ch);
	}
	public static String toString(char[] ch)
	{
		String res="";
		for(int i=0;i<=ch.length-1;i++)
		{
			res=res+ch[i];
		}
		return res;
	}
	public static void checkAnagram(String st1,String st2)
	{
		
		if(st1.length()==st2.length())
		{
			String sort1=ascendingOrder(st1);
			String sort2=ascendingOrder(st2);
		
			
			if(sort1.equals(sort2))
			{
				System.out.println("Anagram");
			}
			else
				System.out.println("no a Anagram");
		}
		else
			System.out.println("Not a Anagram");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String st1=sc.next();
		System.out.println("Enter Second String");
		String st2=sc.next();
		checkAnagram(st1, st2);
		
	}
}
