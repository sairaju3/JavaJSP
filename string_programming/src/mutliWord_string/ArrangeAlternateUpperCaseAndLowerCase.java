package mutliWord_string;

import java.util.Scanner;

public class ArrangeAlternateUpperCaseAndLowerCase 
{
	public static String toLowerCase(String st)
	{
		String res="";
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)(ch+32);
			}
			res=res+ch;
		}
		
		return res;
	}
	public static String toUpperCase(String st)
	{
		String res="";
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char)(ch-32);
			}
			res=res+ch;
		}
		
		return res;
	}
	public static String alternateUpperandLower(String st)
	{
		String[] words =st.split(" ");
		for(int i=0;i<=words.length-1;i++)
		{
			String s = words[i];
			if(i%2==0)
				words[i]=toUpperCase(s);
			else
				words[i]=toLowerCase(s);
		}
		return convertString(words);
	}
	public static String convertString(String[] words)
	{
		String result="";
		 for(int i=0;i<=words.length-1;i++)
		 {
			 if(i<words.length-1)
			 {
				 result = result+words[i]+" ";
			 }
			 else
				 result=result+words[i];	 
		 }
		 return result;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multi word string");
		String st = sc.nextLine();
		
		String alter=alternateUpperandLower(st);
		System.out.println(alter);
		
	
	}
}
