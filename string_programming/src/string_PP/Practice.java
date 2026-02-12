package string_PP;

import java.beans.Visibility;
import java.security.KeyStore.CallbackHandlerProtection;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class Practice 
{
	public static char[] toCharArray(String st)
	{
		char[] ch=new char[(st.length())];
		for(int i=0;i<=st.length()-1;i++)
		{
			
			ch[i]=st.charAt(i);
		}
		return ch;
	}

	public static void extract(String st)
	{
		String newString="";
		for(int i=0;i<=st.length()-1;i++) 
		{
			char ch=st.charAt(i);
			if(ch>='a' && ch<='z')
			{
				newString =newString+ch;
				//System.out.println(ch);
			}
		}
		System.out.println(newString);
	}
	public static boolean reverse(String st)
	{
		String rev="";
		String st1=st;
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			rev=ch+rev;
		}
		return rev.equals(st1);
	}
	public static void check(String st)
	{
		String newSt="";
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u')
			{
				newSt=newSt+'@';
			}
			else
				newSt=newSt+ch;
		}
		System.out.println(newSt);
	}
	public static void frequency(String st)
	{
		char visited=Character.MIN_VALUE;
		char[] ch=toCharArray(st);
		for(int i=0;i<=ch.length-1;i++)
		{
			
			if(ch[i]!=visited)
			{
				int count=1;
				for(int j=i+1;j<=ch.length-1;j++)
				{
					if(ch[i]==ch[j])
					{
						ch[j]=visited;
						count++;
					}
				}
			System.out.println("Char : "+ch[i]+"-> Frequency "+count);
		}
		}
	}
	public static void mostRepetated(String st)
	{
		char visited=Character.MIN_VALUE;
		char[] ch=toCharArray(st);
		int mostCount=0;
		char index='a';
		for(int i=0;i<=ch.length-1;i++)
		{
			int count=1;
			if(ch[i]!=visited)
			{
				for(int j=i+1;j<=ch.length-1;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						ch[j]=visited;
					}
				}
				if(count>mostCount)
				{
					mostCount=count;
					index=ch[i];
				}
			}
		}
		System.out.println(index+"  "+mostCount);
	}

	public static void firstUnique(String st)
	{
		char[] ch=toCharArray(st);
		char visited=Character.MIN_VALUE;
		int maxCount=Integer.MAX_VALUE;
		int index=-1;
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]!=visited)
			{
				int count=0;
				for(int j=i+1;j<=ch.length-1;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						ch[j]=visited;
					}
				}
				if(count<maxCount)
				{
					maxCount=count;
					index=i;
				}
			}
		}
		if(maxCount==0)
			System.out.println("First Unique char "+ch[index]);
		else
			System.out.println("No Unique Character");
	}
	public static String toUpperCase(String st)
	{
		String newString="";
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char)(ch-32);
			}
			newString=newString+ch;
		}
		return newString;
	}
	public static String toLowerCase(String st)
	{
		String newString="";
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char)(ch+32);
			}
			newString=newString+ch;
		}
		return newString;
	}
	public static void count(String st)
	{
		int countUpp=0;
		int countLow=0;
		int countNum=0;
		int countSpe=0;
		 
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch>='a' && ch<='z')
				countLow++;
			else if(ch>='A' && ch<='Z')
				countUpp++;
			else if(ch>='0' && ch<='9')
				countNum++;
			else
				countSpe++;
		}
		System.out.println("No.of UpperCase Alphabits :- "+countUpp+"\nNo.of LowerCase Alphabits :- "+countLow+"\nNo.of Digits :- "+countNum+"\nNo.of Special Characters "+countSpe);
	}
	public static boolean checkVowels(char ch)
	{
		return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' );
	}
	public static void nonRepetated(String st)
	{
		char[] ch=toCharArray(st); 
		char visited=Character.MIN_VALUE;
		for(int i=0;i<=ch.length-1;i++)
		{
			if(checkVowels(ch[i]) && ch[i]!=visited)
			{
				boolean dup=false;
				for(int j=i+1;j<=ch.length-1;j++)
				{
					if(checkVowels(ch[i]) && ch[i]==ch[j])
					{
						ch[j]=visited;
						dup=true;
					}
				}
				if(dup)
				{
					ch[i]=visited;
				}
			}
		}
		String newS="";
		for(int i=0;i<=ch.length-1;i++)
		{
			if(checkVowels(ch[i]) && ch[i]!=visited)
			{
				newS=newS+ch[i];
			}
		}
		System.out.println(newS);
		
	}
	public static boolean checkPalindrome(String st)
	{
		String rev="";
		String temp=st;
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			rev=ch+rev;
		}
		return temp.equals(rev);
	}
	public static void checkPalindromWord(String st)
	{
		String[] word=st.split(" ");
		
		for(int i=0;i<=word.length-1;i++)
		{
			String s=word[i];
			if(checkPalindrome(s))
			{
				System.out.println(s);
				System.out.print("Vowels : ");
				for(int j=0;j<=s.length()-1;j++)
				{
					char ch=s.charAt(j);
					if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
					{
						
						System.out.print(ch+" ,");
					}
				}
				System.out.println();
				//System.out.println(s);
			}	
		}
	}
	public static void main(String[] args) {
		
		String st="madam nani malayalam";
		checkPalindromWord(st);
		
		
		//nonRepetated(st);
		
		
		//count(st);
		
		//firstUnique(st);
		
		//mostRepetated(st);
		
		//frequency(st);
		//check(st);
		//System.out.println(toUpperCase(st));
		
//		System.out.println(Arrays.toString(toCharArray(st)));
//		//extract(st);
//		if(reverse(st))
//			System.out.println("palindrome");
//		else
//			System.out.println("not a Palindrome");
	}
}
