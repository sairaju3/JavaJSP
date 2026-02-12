package advance_level_programming1;

import java.util.Scanner;

public class ReverseRatainSpecialChar 
{
	public static void reverseString(String st)
	{
		String rev="";
		
		for(int i=st.length()-1;i>=0;i--)
		{
			char ch = st.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
			{
				rev=rev+ch;
			}	
		}
		//System.out.println(rev);
		int index=0;
		String result="";
		for(int i=0;i<=st.length()-1;i++)
		{
			//Extracting the character from the given string
			char ch=st.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
			{
				//Extracting the character from reverse String and 
				// concatenating with result String
				result=result+rev.charAt(index++);
			}
			else
			{
				// concatenating with result String char(Special char) to the result string
				result=result+ch;
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String...");
		String st=sc.next();
		reverseString(st);
	}
}
