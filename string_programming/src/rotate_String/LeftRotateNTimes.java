package rotate_String;

import java.util.Scanner;

public class LeftRotateNTimes 
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
		System.out.println("Enter the No.of left Rotations");
		int n = sc.nextInt();
		char[] ch =toCharArray(st);
		for(int i=1;i<=n;i++)
		{
			
			leftRotate(ch);
			String res=toString(ch);
			System.out.println("After "+i+" left Rotation :- "+res);
			
			
		}
	}

}
