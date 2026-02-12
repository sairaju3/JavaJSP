package ArraysPP;

import java.util.Arrays;
import java.util.Scanner;

public class Count 
{
	public static int[] countElemets(int[] arr)
	{
		int[] rev=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			rev[j++]=arr[i];
		}
		return rev;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int[] arr= {1,2,5,4,9};
	
		int[] rev=countElemets(arr);
		System.out.println(Arrays.toString(rev));
		
	}
}
