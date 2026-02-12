package predicate_programs;

import java.util.function.Consumer;

// WAP TO REVERSE EACH WORD PRESENT IN THE GIVEN STRING 

public class ReverseEachWord 
{
	public static void main(String[] args) 
	{	
		String st="java is robust";
		String[] word=st.split(" ");
		Consumer<String> f1= s->{
			
			String rev="";
			for(int i=0;i<=s.length()-1;i++)
			{
				char ch=s.charAt(i);
				rev=ch+rev;
			}
			System.out.println(s+" --> "+rev);
		};
		for(int i=0;i<=word.length-1;i++)
		{
			f1.accept(word[i]);
		}
	}
}
