package predicate_programs;
//WAP TO FIND ALL THE PALINDROME STRING PRESENT IN THE GIVEN MULTI WORD STRING.

import java.util.function.Predicate;

public class Palindrome 
{
	public static void main(String[] args) {
		
		String st= "Sai madam malayalam nani";
		String word[] =st.split(" ");
		
		
		Predicate<String> c1 = s->{
			String rev="";
			String ss=s;
			for(int i=0;i<=s.length()-1;i++)
			{
				char ch=s.charAt(i);
				rev=ch+rev;
			}
		
			return rev.equals(ss);
		};
		for(int i=0;i<=word.length-1;i++)
		{
			System.out.println(word[i]+"-->"+c1.test(word[i]));
			;
		}
	}
}
