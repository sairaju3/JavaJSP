package advance_level_programming1;

import java.util.Scanner;

public class AnagramPairs 
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
	public static void splitWords(String st)
	{
		String[] words =st.split(" ");
		boolean cond=false;
		for(int i=0;i<=words.length-1;i++)
		{
			String s = words[i];
			for(int j=i+1;j<=words.length-1;j++)
			{
				String s2=words[j];
				
				if(checkAnagram(s, s2))
				{
					System.out.println("["+s+" , "+s2+"]");
					cond=true;
				}
			}
		}
		if(!cond)
			System.out.println("Not a Anagram Pair");
	}
	public static boolean checkAnagram(String st1,String st2)
	{
		if(st1.length()==st2.length())
		{
			st1=toLowerCase(st1);
			st2=toLowerCase(st2);
			int[] freq=new int[26];
			for(int i=0;i<=st1.length()-1;i++)
			{
				char ch=st1.charAt(i);
				freq[ch-97]++;
			}
			for(int i=0;i<=st2.length()-1;i++)
			{
				char ch=st2.charAt(i);
				freq[ch-97]--;
			}
			for(int i=0;i<=freq.length-1;i++)
			{
				if(freq[i]!=0)
					return false;
			}
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String st1=sc.nextLine();
		splitWords(st1);

//		if(checkAnagram(st1, st2))
//			System.out.println(st1+" and "+st2+" are Anagram Strings");
//		else
//			System.out.println("Not Anagram");
		
	}
}
