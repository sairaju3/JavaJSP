package advanceLevel_String_program;

import java.util.Scanner;

public class ExtractAllDigitsAndReverse 
{
	public static String extrectDigits(String st)
	{
		String reverseString="";
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch>='0' && ch<='9')
			{
				reverseString=reverseString+ch;
			}
		}
		return reverseString;
	}
	public static void reverseDigits(String st)
	{
		String digits=extrectDigits(st);
		String newString="";
		for(int i=digits.length()-1;i>=0;i--)
		{
			char ch=digits.charAt(i);
			newString=newString+ch;
		}
		System.out.println(newString);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.next();
		reverseDigits(st);
		
	}
	
}
