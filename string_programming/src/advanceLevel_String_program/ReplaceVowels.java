package advanceLevel_String_program;

import java.util.Scanner;

public class ReplaceVowels 
{
	public static String repalce(String st,char cha)
	{
		String newString="";
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
					|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				newString=newString+cha;
			}
			else
				newString=newString+ch;
		}
		return newString;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String..");
		String st = sc.next();
		System.out.println("Enter the Special characyter");
		char cha=sc.next().charAt(0);
		System.out.println(repalce(st, cha));
		
		
	}
}
