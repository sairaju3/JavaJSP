package advance_level_programming1;

import java.awt.image.RescaleOp;
import java.util.Scanner;

//59.WAP TO FIND THE RUN-LENGTH OF THE GIVEN STRING .
//				(OR)
//WAP TO COMPRESE THE GIVEN UING RUN LENGTH CODING.

//i/p:- "aaabbc"
//o/p:- "a3b2c1"
//
//i/p:- "abcabc"
//o/p:- "a1b1c1a1b1c1".

public class RunLength 
{
	public static char[] toCharArray(String st)
	{
		char[] ch =new char[st.length()];
		for(int i=0;i<=st.length()-1;i++)
		{
			ch[i]=st.charAt(i);
		}
		return ch;
	}
	public static String runLength(String st)
	{
		//char[] ch=st.toCharArray();
		char[] ch=toCharArray(st);
		
		String result="";
		int count=1;
		for(int i=0;i<=ch.length-2;i++)
		{
			if(ch[i]==ch[i+1])
				count++;
			else
			{
				result=result+ch[i]+count;
				count=1;
			}
		}
		result=result+ch[ch.length-1]+count;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String...");
		String st=sc.next();
		System.out.println(runLength(st));
	}
}
