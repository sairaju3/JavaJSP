package mutliWord_string;

import java.util.Arrays;
import java.util.Scanner;
class SplitString 
{
	public static int count(String st)
	{
		int count=1;
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch==' ')
			{
				count++;
			}
		}
		return count;
	}
	public static void split(String st)
	{
		int count=count(st);
		String[] res=new String[count];
		String temp="";
		int index=0;
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch==' ')
			{
				res[index++]=temp;
				temp="";
			}
			else
			{
				temp=temp+ch;
			}
			res[index]=temp;
		}
		System.out.println(Arrays.toString(res));
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String..");
		String st=sc.nextLine();
		split(st);
	}
}

