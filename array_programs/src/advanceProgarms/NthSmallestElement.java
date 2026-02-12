package advanceProgarms;
import java.util.Arrays;
import java.util.Scanner;

public class NthSmallestElement 
{	
	public static void ascendingOrder(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
		public static int[] removeDuplicate(int[] arr)
		{
			int count=0;
			int visited = Integer.MIN_VALUE;
			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]!=visited)
				{
					for(int j=i+1;j<=arr.length-1;j++)
					{
						if(arr[i]==arr[j])
						{
							arr[j]=visited;
							count++;
						}
					}
				}
			}
			if(count>0)
			{
				int[] newArray = new int[arr.length-count];
				int index = 0;
				for(int i=0;i<=arr.length-1;i++)
				{
					if(arr[i]!=visited)
						newArray[index++]=arr[i];
				}
				return newArray;
			}
			else
				return  null;
		}
		public static int smallestElement(int[] arr,int n)
		{
			int smallest=Integer.MAX_VALUE;
		
			int[] newArray=removeDuplicate(arr);
			if(newArray!=null)
			{
				if(n<=newArray.length)
				{
					ascendingOrder(newArray);
					smallest=newArray[n-1];
				}
			}
			
			return smallest;
		}
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			
			int arr[] = {2,5,3,3,7,9,0,1,-6,-3,-5};
			System.out.println(Arrays.toString(arr));
			System.out.println("Enter the n Value");
			int n= sc.nextInt();
			int smallest=smallestElement(arr, n);
			
			if(smallest==Integer.MAX_VALUE)
				System.out.println("No Smallest Element found  for the given n Value "+n);
			else
				System.out.println("The "+n+" Smallest Element is "+smallest);
					
		}
}
