package duplicate_string_pro;

import java.util.Scanner;

public class RemoveDuplicateChar 
{
	public static char[] toCharArray(String st)
	{
		char[] ch=new char[st.length()];
		for(int i=0;i<=st.length()-1;i++)
		{
			ch[i]=st.charAt(i);
		}
		return ch;
	}
	public static String removeDuplicates(String st)
	{
		char[] ch=toCharArray(st);
		char visited=Character.MIN_VALUE;
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]!=visited)
			{
				for(int j=i+1;j<=ch.length-1;j++)
				{
					if(ch[i]==ch[j])
					{
						ch[j]=visited;
					}
				}
			}
		}
		return toString(ch);
	}
	public static String toString(char[] ch)
	{
		char visited=Character.MIN_VALUE;
		String newString="";
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]!=visited)
				newString=newString+ch[i];
		}
		return newString;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.next();
		System.out.println(removeDuplicates(st));
	}
}
