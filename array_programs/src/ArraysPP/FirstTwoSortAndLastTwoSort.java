package ArraysPP;

import java.util.Arrays;
import java.util.Scanner;

public class FirstTwoSortAndLastTwoSort 
{
	public static char[] toCharArray(String st)
	{
		char ch[] = new char[st.length()];
		for(int i=0;i<=st.length()-1;i++)
		{
			ch[i]=st.charAt(i);
		}
		return ch;
	}
	public static char[] sort(String st)
	{
		char[] ch=toCharArray(st);
		if(ch[0]>ch[1])
		{
			char temp=ch[0];
			ch[0]=ch[1];
			ch[1]=temp;
		}
		
		int n=st.length();
		if(ch[n-2]>ch[n-1])
		{
			char temp=ch[n-2];
			ch[n-2]=ch[n-1];
			ch[n-1]=temp;
		}
		return ch;
				
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.next();
		System.out.println(Arrays.toString(sort(st)));
	}
}
