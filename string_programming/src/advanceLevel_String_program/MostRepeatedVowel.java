package advanceLevel_String_program;

import java.util.Scanner;

public class MostRepeatedVowel 
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
		if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' ||  ch=='i' || ch=='o' || ch=='O' || ch=='U' || ch=='u')
			return true;
		else 
			return false;
	}
	public static void frequencyOfChar(String st)
	{
		
		int index =-1;
		int maxCount=0;
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
				if(count>maxCount)
				{
					maxCount=count;
					index=i;
				}
			}
		}
		if(maxCount==0)
			System.out.println("No Repeated Vowel..");
		else
			System.out.println("Most Repeated Vowel :- "+ch[index]+" -------------> "+maxCount);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String..");
		String st = sc.next();
		frequencyOfChar(st);	
	}
}
