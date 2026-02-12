package com.streamAPI;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class MaxAndMin 
{
	public static void main(String[] args) 
	{
		int[] arr= {33,45,66,88,33,22,46,46};
		System.out.println(Arrays.toString(arr));
		
//		int	ele=Arrays.stream(arr).max().getAsInt();
//		System.out.println(ele);
		
//		int	ele=Arrays.stream(arr).min().getAsInt();
//		System.out.println(ele);
		
		Predicate<Integer> f1= n->{
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}	
			}
			return count==2;
		};
		int	ele=Arrays.stream(arr).mapToObj(a->a).mapToInt(a->a).max().getAsInt();
		System.out.println(ele);
	}
}
