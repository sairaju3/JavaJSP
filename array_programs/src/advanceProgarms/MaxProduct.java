package advanceProgarms;

public class MaxProduct 
{
	public static void maxProduct(int[] arr)
	{
		int prod=arr[0]*arr[1];
		for(int i=1;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				int product=arr[i]*arr[j];
				if(product>prod)
				{
					prod=product;
				}
			}
		}
		System.out.println("Maximum Product :- "+prod);
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,4,7,5,1,6,3};
		maxProduct(arr);
	}
}
