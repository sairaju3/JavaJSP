package string_programs;

import java.util.Scanner;

public class CountNoOfAlphabits 
{

	public static void countChar(String st)
	{
		int countUpperCase = 0;
		int countLowerCase=0;
		int countDigits=0;
		int countSpecialChar=0;
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch>='A' && ch<='Z')
				countUpperCase++;
			else if(ch>='a' && ch<='z')
				countLowerCase++;
			else if(ch>='0'&&ch<='9')
				countDigits++;
			
			else
				countSpecialChar++;
		}
		System.out.println("No.of UpperCase Alphabits :- "+countUpperCase+"\nNo.of LowerCase Alphabits :- "+countLowerCase+"\nNo.of Digits :- "+countDigits+"\nNo.of Special Characters "+countSpecialChar);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String st=sc.next();
		countChar(st);
	}
}
