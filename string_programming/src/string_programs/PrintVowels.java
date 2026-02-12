package string_programs;

import java.util.Scanner;

public class PrintVowels 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String...");
		String st=sc.next();
		System.out.println("The Vowels Present in :- "+st);
		//int count=0;
		boolean condn=true;
		for(int i=0;i<=st.length()-1;i++)
		{
			char ch = st.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || 
			   ch=='E' || ch=='i' || ch=='I' ||
			   ch=='o' || ch=='O' || ch=='u' || ch=='U')
			{
				System.out.println(ch);
				//count++;
				condn=false;
			}
		}
		if(condn)
			System.out.println("No Vowels present in : "+st );
	}
}
