package string_programs;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String..");
		String st=sc.next();
		String newString="";
	
		//for(int i=st.length()-1;i>=0;i--)
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch = st.charAt(i);
			newString =ch+ newString;
		}
		System.out.println("Reverse of '"+st+"' => "+newString);
	}
}
