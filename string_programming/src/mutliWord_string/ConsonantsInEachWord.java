package mutliWord_string;

import java.util.Scanner;

public class ConsonantsInEachWord 
{
	public static void vowelsInWords(String st)
	{	
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch=st.charAt(i);
			if(ch!='a'&& ch!='A'&&ch!='e'&&ch!='E'&&ch!='i'&&ch!='I'&&ch!='o'&&ch!='O'&&ch!='u'&&ch!='U')
			{
				System.out.println(ch);
			}
		}		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multi word string");
		String st = sc.nextLine();
		String[] word=st.split(" ");
		for(int i=0;i<=word.length-1;i++)
		{
			String s = word[i];
			System.out.println("Consonants in "+s);
			vowelsInWords(s);
		} 
	}
}

