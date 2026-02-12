package advance_level_programming1;

import java.util.Arrays;
import java.util.Scanner;

public class KAnagram 
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
	public static boolean checkAnagram(String st1,String st2,int k)
	{
		//int needChanges=0;
		if(st1.length()==st2.length())
		{
			st1=toLowerCase(st1);
			st2=toLowerCase(st2);
			int[] freq=new int[26];
			for(int i=0;i<=st1.length()-1;i++)
			{
				char ch1=st1.charAt(i);
				char ch2=st2.charAt(i);
				freq[ch1-97]++;
				freq[ch2-97]--;
			}
			int n=0;
			for(int i=0;i<=freq.length-1;i++)
			{
				if(freq[i]>0)
					n++;
			}
			System.out.println(Arrays.toString(freq));
			return n==k;
		}
		else
			return false;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String st1=sc.next();
		System.out.println("Enter Second String");
		String st2=sc.next();
		System.out.println("Enter K Value");
		int k=sc.nextInt();
		System.out.println(checkAnagram(st1, st2, k));
		
	}
}
