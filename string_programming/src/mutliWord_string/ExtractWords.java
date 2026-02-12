package mutliWord_string;

import java.util.Scanner;

public class ExtractWords 
{
	public static void extractWord(String st)
	{
		String revString="";
		String[] word = st.split("");
		for(int i=0;i<=word.length-1;i++)
		{
			String s = word[i];
			revString =s+ revString;
			
		}
		System.out.println(revString);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Multi word string");
		String st = sc.nextLine();
		extractWord(st);
	}
}
