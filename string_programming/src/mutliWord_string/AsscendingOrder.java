package mutliWord_string;

import java.util.Scanner;

public class AsscendingOrder 
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
	public static String toString(char[] ch)
	{
		String res="";
		for(int i=0;i<=ch.length-1;i++)
		{
			res=res+ch[i];
		}
		return res;
	}
	public static String assendingOrder(String st)
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
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.nextLine();
		System.out.println(assendingOrder(st));
	}

}
