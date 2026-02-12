package string_programs;

import java.util.Scanner;

public class ConvertUpperCaSeIntoLowerCase
{
	public static String checkCharacter(String st)
	{
		String newString="";
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch =st.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch =(char)(ch+32);
			}
			newString=newString+ch;
		}
		return newString;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String...");
		String st = sc.next();
		System.out.println(checkCharacter(st));
	}
}
