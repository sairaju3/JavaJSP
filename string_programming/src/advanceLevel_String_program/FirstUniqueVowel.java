package advanceLevel_String_program;

import java.util.Scanner;

public class FirstUniqueVowel 
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
	public static boolean checkVowel(char ch)
	{
		return (ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' ||  ch=='i' || ch=='o' || ch=='O' || ch=='U' || ch=='u');
		
	}
	public static void frequencyOfChar(String st)
	{
		
//		int index =-1;
		char mRC = ' ';
		int maxCount=Integer.MAX_VALUE;
		
		char[] ch=toCharArray(st);
		char visited=Character.MIN_VALUE;
		
		for(int i=0;i<=ch.length-1;i++)
		{
			if(checkVowel(ch[i]) && ch[i]!=visited)
			{
				int count=0;
				for(int j=i+1;j<=ch.length-1;j++)
				{
					if(checkVowel(ch[j]) && ch[i]==ch[j])
					{
						count++;
						ch[j]=visited;
					}
				}
				if(count<maxCount)
				{
					maxCount=count;
//					index=i;
					mRC= ch[i];
				}
			}
		}
		if (maxCount == 0)
//			System.out.println("First unique Vowel :- " + ch[index]);
			System.out.println("First unique Vowel :- " + mRC);
		else
			System.out.println("No Unique Vowel..");
	}
		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String..");
		String st = sc.next();
		frequencyOfChar(st);	
	}
}
