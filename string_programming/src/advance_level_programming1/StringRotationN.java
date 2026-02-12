package advance_level_programming1;

import java.util.Scanner;

public class StringRotationN
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
	public static void checkTwoStrings(String st1,String st2)
	{
		char[] ch =toCharArray(st1);
		leftRotate(ch);
		String str1=toString(ch);
		for(int i=0;i<=str1.length()-1;i++)
		{
			if(str1.equals(st2))
			{
				System.out.println("IS equal");
				break;
			}
			
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String st1=sc.next();
		System.out.println("Enter Second String");
		String st2=sc.next();
		char[] ch =toCharArray(st1);
		leftRotate(ch);
		String res=toString(ch);
		System.out.println(res);	
		
	}
}


//for(int i=0;i<=st2.length()-1;i++)
//{
//	if(leftRotate(ch).equals(st2))
//	{
//		System.out.println("Same");
//		break;
//	}
//	else if(!leftRotate(ch).equals(st2))
//		System.out.println("Not equal");
//}
