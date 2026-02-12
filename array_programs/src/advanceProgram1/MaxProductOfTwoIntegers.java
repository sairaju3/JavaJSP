package advanceProgram1;

import java.util.Arrays;

public class MaxProductOfTwoIntegers 
{
	public static void findMaxProduct(int[] arr)
	{
		int product=0;
		int index1=0;
		int index2=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				int	prod = arr[i]*arr[j];
				if(prod>product)
				{
					product=prod;
					index1=i;
					index2=j;
				}	
			}	
		}
		System.out.println("Pair : ("+arr[index1]+ ","+arr[index2]+")");
		System.out.println("Max Product : "+product);
	
	}
	public static void main(String[] args) 
	{
		int[] arr = {2,4,7,5,1,6,3};
		System.out.println(Arrays.toString(arr));
		findMaxProduct(arr);
		
	}
}
