package string_PP;

import java.util.Scanner;

public class FrequencyOfChar 
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
	public static void frequency(char[] ch)
	{
		char visited=Character.MIN_VALUE;
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]!=visited)
			{
				int count=1;
				for(int j=i+1;j<=ch.length-1;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						ch[j]=visited;
					}
				}
				System.out.println("char : "+ch[i]+"-> frequency"+count);
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.next();
		char[] ch=toCharArray(st);
		frequency(ch);
	}
}
