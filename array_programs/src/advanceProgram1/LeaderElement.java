package advanceProgram1;

import java.util.Arrays;

public class LeaderElement
{
	public static void findLeader(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			boolean condn=true;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]<arr[j])
				{
					condn=false;
					break;	
				}
			}
			if(condn)
				System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {8,4,7,5,1,6,3,2}; 
		System.out.println(Arrays.toString(arr));
		findLeader(arr);
	}
}
