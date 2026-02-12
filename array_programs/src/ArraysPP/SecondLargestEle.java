package ArraysPP;

public class SecondLargestEle
{
	public static void SecondLargestElement(int[] arr)
	{
		if(arr.length>=2)
		{
			int largest=Integer.MIN_VALUE;
			int secondLargest=Integer.MIN_VALUE;
			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]>largest)
				{
					secondLargest=largest;
					largest=arr[i];
				}
				else if(arr[i]>secondLargest && arr[i]!=largest)
				{
					secondLargest=arr[i];
				}
			}
			if(secondLargest==Integer.MIN_VALUE)
			{
				System.out.println("No Second Largest Element");
			}
			else 
			{
				System.out.println("Second Largest Element :- "+secondLargest);
			}
		}
		else
		{
			System.out.println("Second Largest Not Possible");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {33,21};
		SecondLargestElement(arr);
	}
}
