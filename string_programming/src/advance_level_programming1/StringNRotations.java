package advance_level_programming1;

import java.util.Arrays;
import java.util.Scanner;

public class StringNRotations 
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
	public static String leftrotate(String st)
	{
		char[] ch=toCharArray(st);
		System.out.println(Arrays.toString(ch));
		char temp=ch[0];
		for(int i=0;i<=ch.length-2;i++)
		{
			ch[i]=ch[i+1];
		}
		ch[ch.length-1]=temp;
		return toString(ch);
	}
	public static String toString(char[] ch)
	{
		String result="";
		for(int i=0;i<=ch.length-1;i++)
		{
			result=result+ch[i];
		}
		return result;
	}
	public static boolean checkNRotation(String st1,String st2)
	{
		if(st1.length()==st2.length())
		{
			int rotations = 0;
			int length = st1.length();
			while(true)
			{
				if(st1.equals(st2))
				{
					System.out.println("Rotated String equal......");
					return true;
				}
				st2 = leftrotate(st2);
				rotations++;
				
				if(rotations==length)
				{
					System.out.println("Not Equal");
					return false;
				}
			}
		}
		else
			System.out.println("Length is Not match");
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String st1=sc.next();
		System.out.println("Enter Second String");
		String st2 = sc.next();
		checkNRotation(st1, st2);
	}
}
