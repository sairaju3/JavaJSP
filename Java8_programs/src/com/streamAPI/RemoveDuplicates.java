package com.streamAPI;
//WAP TO REMOVE ALL THE DUPLICTES 
import java.util.Arrays;

public class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		
		int [] arr= {33,45,66,88,33,22,46,46};
		System.out.println(Arrays.toString(arr));
		
		int[] dup =Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(dup));
		
	}
}
