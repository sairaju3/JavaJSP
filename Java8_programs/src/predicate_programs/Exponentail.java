package predicate_programs;

import java.util.function.Function;


 
/* WAP TO FIND THE EXPONENTAIL VALUE OF EACH ELEMENT PRESENT IN THE GIVEN ARRAY TO
THE POWER TOTAL NUMBER OF ELEMENTS PRENENT IN THE GIVEN ARRAY */

public class Exponentail 
{
	public static void main(String[] args) 
	{
		int[] arr= {2,4,6,8,9};
	  Function<Integer,Integer>	p1 = a->{
			
		 int expo=1;
		
		for(int i=1; i<=arr.length;i++)
		{
			expo=expo*a;
		}
		return expo;
		  
		};
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+"-->"+p1.apply(arr[i]));
		}
	}
}
