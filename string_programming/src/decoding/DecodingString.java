package decoding;

import java.util.Scanner;

public class DecodingString 
{
	public static String extractString(String st)
	{
		String newString="";
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch!='[' && ch!=']')
			{
				newString=newString+ch;
			}
		}
		return newString;
	}
	public static String decodeString(String st)
	{
		String result="";
		String newString=extractString(st);
		for(int i=newString.length()-1;i>=0;i--)
		{
			char ch=newString.charAt(i);
			if(!Character.isDigit(ch))
			{
				result=ch+result;
			}
			if(Character.isDigit(ch))
			{
				String temp="";
				int n=ch-48;
				for(int j=1;j<=n;j++)
				{
					temp=temp+result;
				}
				result=temp;
			}
		}
		return result;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.next();
		System.out.println(decodeString(st));
	}
}
