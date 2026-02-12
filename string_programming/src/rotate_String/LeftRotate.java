package rotate_String;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate 
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
	public static char[] leftRotate(char[] ch)
	{
		char temp=ch[0];
		for(int i=0;i<=ch.length-2;i++)
		{
			ch[i]=ch[i+1];
		}
		ch[ch.length-1]=temp;
		return ch;
	}
	public static String toString(char[] ch)
	{
		String st="";
		for(int i=0;i<=ch.length-1;i++)
		{
			st+=ch[i];
		}
		return st;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String..");
		String st=sc.next();
		
		char[] ch =toCharArray(st);
		System.out.println(Arrays.toString(ch));
		String res=toString(leftRotate(ch));
		System.out.println(res);
		
	
	}
}
