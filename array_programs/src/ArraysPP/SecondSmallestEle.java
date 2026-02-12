package ArraysPP;

public class SecondSmallestEle 
{
	public static void secondSmallestEle(int[] arr)
	{
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		if(arr.length>=2)
		{
			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]<smallest)
				{
					secondSmallest=smallest;
					smallest=arr[i];
				}
				else if(arr[i]<secondSmallest && arr[i]!=smallest)
				{
					secondSmallest=arr[i];
				}
			}
			if(secondSmallest==Integer.MAX_VALUE)
				System.out.println("No Second Smallest");
			else
				System.out.println("Second Smallest Element :- "+secondSmallest);
		}
		else
			System.out.println("Second Smallest Element not Possible");
	}
	public static void main(String[] args) 
	{
		int[] arr= {33,21,10,9,15,8};
		secondSmallestEle(arr);
	}
}
