package mutliWord_string;

import java.util.Scanner;

public class VowelsInEachWord 
{
	public static void vowelsInWords(String string)
	{	
		String[] word=string.split(" ");
		
		for(int i=0;i<=word.length-1;i++)
		{
			String st = word[i];
			System.out.println("Vowels in "+st);
			int countV=0;
			int con=0;
			for(int j=0;j<=st.length()-1;j++)
			{
				char ch=st.charAt(j);
				if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
				{
					//System.out.println(ch);
					countV++;
				}
				else
					con++;
			}
			System.out.println(st+" Vowels : "+countV);
			System.out.println(st+" Consonants : "+con);
		}
		
				
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multi word string");
		String st = sc.nextLine();
		vowelsInWords(st);
	
	}
}
