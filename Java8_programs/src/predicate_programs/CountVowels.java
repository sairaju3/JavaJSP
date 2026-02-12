package predicate_programs;

//WAP TO COUNT THE VOWELS PRESENT IN THE EACH WORD OF A GIVEN MULTI WORD STRING 

import java.util.function.Function;
public class CountVowels 
{
	public static void main(String[] args) 
	{
		String st="java is robust";
		String[] word=st.split(" "); 
		Function<String , Integer> f1 = s->{
			int count=0;
			for(int i=0;i<=s.length()-1;i++)
			{
				
				char ch=s.charAt(i);
				if(ch=='A' || ch=='E' || ch=='I'|| ch=='O'|| ch=='U' || ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u')
				{
					count++;
				}
			}
			return count;
		};
		for(int i=0;i<=word.length-1;i++)
		{
			System.out.println(word[i]+"--->"+f1.apply(word[i]));
		}
	}
}
