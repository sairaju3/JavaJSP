package advance_level_programming1;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates 
{
	public static char[] toCharArray(String st)
	{
		char[] ch=new char[st.length()]; 
		for(int i=0;i<=st.length()-1;i++)
		{
			ch[i]=st.charAt(i);
		}
		return ch;
	}
	public static void remove(String st)
	{
		char[] ch=toCharArray(st);
		
		String res="";
		res=res+ch[0];
		for(int i=1;i<=ch.length-1;i++)
		{
			if(ch[i]!= ch[i-1])
			{
				res=res+ch[i];
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.next();
		remove(st);
	}
}
