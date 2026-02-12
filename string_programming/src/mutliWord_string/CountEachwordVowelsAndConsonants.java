package mutliWord_string;

import java.util.Scanner;

public class CountEachwordVowelsAndConsonants 
//{
//	public static int vowelsInWords(String st)
//	{	
//		int countV=0;
//		for(int i=0;i<=st.length()-1;i++)
//		{
//			char ch=st.charAt(i);
//			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
//			{
//				//System.out.println(ch);
//				countV++;
//			}
//		}
//		return countV;
//				
//	}
//	public static int countConsonantsInWords(String st)
//	{	
//		int countC=0;
//		for(int i=0;i<=st.length()-1;i++)
//		{
//			char ch=st.charAt(i);
//			if(ch!='a'&& ch!='A'&&ch!='e'&&ch!='E'&&ch!='i'&&ch!='I'&&ch!='o'&&ch!='O'&&ch!='u'&&ch!='U')
//			{
//				//System.out.println(ch);
//				countC++;
//			}
//		}	
//		return countC;
//	}
{
	public static void countVowels(String st)
	{
		

		String[] word=st.split(" ");
		for(int i=0;i<=word.length-1;i++)
		{
			int countV=0;
			int countC=0;
			String s = word[i];
			System.out.println(s);
			for(int j=0;j<=s.length()-1;j++)
			{
				char ch=s.charAt(j);
				if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
				{
//						//System.out.println(ch);
					countV++;
				}
				else
					countC++;
			}
			System.out.println("No of Vowels "+countV);
			System.out.println("No of Consonents "+countC);
			
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multi word string");
		String st = sc.nextLine();
		countVowels(st);
//		String[] word=st.split(" ");
//		for(int i=0;i<=word.length-1;i++)
//		{
//			String s = word[i];
//			System.out.println("Vowels in "+s);
//			System.out.println(s+"--->"+vowelsInWords(s));
//			System.out.println("Consonants in "+s);
//			System.out.println(s+"------->"+countConsonantsInWords(s));
//		} 
	}
}
