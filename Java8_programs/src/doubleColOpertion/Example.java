package doubleColOpertion;

import java.util.Arrays;

public class Example 
{
	public static void main(String[] args) 
	{
		
		Integer[] arr= {33,46,56,58,23};
		
		Arrays.stream(arr).
		filter(a->a%2==0).
		forEach(System.out :: println); 
			
	}
}
