package com.streamAPI;

import java.util.Arrays;

public class Example 
{
	public static void main(String[] args) 
	{
		Integer[] i = {3 , 6 ,19  , 15 ,13 , 20, 33 , 46};
		
		Arrays.stream(i).
		filter(a->a%2!=0).
		map(e->e*e).
		forEach(s->System.out.println(s));
		
	}
}
