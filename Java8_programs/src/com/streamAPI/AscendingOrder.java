package com.streamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;

//WAP TO SORT THE GIVEN ARRAY ELEMEMTS INTO ASCENDING ORDER
public class AscendingOrder 
{
	public static void main(String[] args) 
	{
		int[] arr = {3,4,5,7,9,3,2,1};
		System.out.println(Arrays.toString(arr));
		
//		Arrays.stream(i).sorted().forEach(s->System.out.print(s+" "));
//		Arrays.stream(arr).sorted().mapToObj(a->a).collect(Collectors.toList());
		int sum=Arrays.stream(arr).sorted().filter(s->s%2==0).sum();
		System.out.println("Sum of Even Elements :- "+sum);
		
		
		
	}
}
