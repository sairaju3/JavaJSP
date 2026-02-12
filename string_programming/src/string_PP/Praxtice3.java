package string_PP;

import java.util.Arrays;
import java.util.Scanner;

public class Praxtice3 
{
	public static String longestWord(String st)
	{
		String[] word=st.split(" ");
		String longestW=word[0];
		for(int i=0;i<=word.length-1;i++)
		{
			String s=word[i];
			if(s.length()>longestW.length())
			{
				longestW=s;
			}
		}
		return longestW;
	}
	public static String shortestWord(String st)
	{
		String[] word=st.split(" ");
		String shortestW=word[0];
		for(int i=0;i<=word.length-1;i++)
		{
			String s=word[i];
			if(s.length()<shortestW.length())
			{
				shortestW=s;
			}
		}
		return shortestW;
	}
	public static char[] toCharArray(String st)
	{
		char[] ch=new char[(st.length())]; 
		for(int i=0;i<=st.length()-1;i++)
		{
			ch[i]=st.charAt(i);
		}
		return ch;
	}
	public static String remove(String st)
	{
		String longt=longestWord(st);
		char[] ch=toCharArray(longt);
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
		String newSt="";
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]!=visited)
			{
				newSt=newSt+ch[i];
			}
		}
		//System.out.println(newSt);
	     return	newSt;
	}
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
	
	public static String alternateUAndL(String st)
	{
		String[] word=st.split(" ");
		String res="";
		for(int i=0;i<=word.length-1;i++)
		{
			String s=word[i];
			if(i%2==0)
			{
				word[i]=toUpperCase(s);	
			}
			
			else
			{
				word[i]=toLowerCase(s);
			}
		}
		return convertString(word);
	}
	public static String convertString(String[] word)
	{
		String res="";
		for(int i=0;i<=word.length-1;i++)
		{
			if(i<word.length)
			{
				res=res+word[i]+" ";
			}
			else
			{
				res=res+word[i];
			}
		}
		return res;
	}
	
	public static void reverseDigit(String st)
	{
		
		String rev="";
		
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch>='0' && ch<='9')
			{
				rev=ch+rev;
			}
		}
		
		int index=0;
		String res="";
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch>='0' && ch<='9')
			{
				res=res+rev.charAt(index++);
			}
			else
			{
				res=res+ch;
			}
		}
		System.out.println(res);
	}
	public static String runLength(String st)
	{
		char[] ch=toCharArray(st);
		String res="";
		int count=1;
		for(int i=0;i<=ch.length-2;i++)
		{
			if(ch[i]==ch[i+1])
			{
				count++;
			}
			else
			{
				res=res+ch[i]+count;
				count=1;
			}
		}
		res=res+ch[ch.length-1]+count;
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Multi word String..");
		String st=sc.nextLine();
		//System.out.println(runLength(st));
		reverseDigit(st);
	//	System.out.println(alternateUAndL(st));
//		String res=remove(st);
//		System.out.println(res);
//		toCharArray(longestWord(st));
//		System.out.println(longestWord(st));
//		System.out.println(shortestWord(st));
		
	}
}
