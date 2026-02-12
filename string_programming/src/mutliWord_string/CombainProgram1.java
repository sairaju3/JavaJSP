package mutliWord_string;

import java.util.Scanner;

public class CombainProgram1 
{
	public static String longestWord(String st)
	{
		String[] words =st.split(" ");
		String longestW=words[0];
		for(int i=0;i<=words.length-1;i++)
		{
			String s = words[i];
			
			if(s.length()>longestW.length())
			{
				longestW=s;
			}
		}
		return longestW;
		
	}
	public static String shortestWord(String st)
	{
		String[] words =st.split(" ");
		String shortestW=words[0];
		for(int i=0;i<=words.length-1;i++)
		{
			String s = words[i];
			
			if(s.length()<shortestW.length())
			{
				shortestW=s;
			}
		}
		return shortestW;
		
	}
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

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multi word string");
		String st = sc.nextLine();
		System.out.println("Longest Word :- "+longestWord(st));
		System.out.println("Shortest Word :- "+shortestWord(st));
		String longestW=longestWord(st);
		System.out.println("Remove Duplicate String :- "+removeDuplicates(longestW));
		
		if(removeDuplicates(longestW).length()==shortestWord(st).length())
			System.out.println("Length is IsEaual");
		else
			System.out.println("Length is not Eqaual");
	}
}
