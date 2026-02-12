package two_D_Array;

public class SumOfAllElements 
{
	public static void main(String[] args) 
	{
		int [][] arr = {
				{1,2,3},{3,4,8},{7,6,9}
		};
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				int ele=arr[i][j];
				sum=sum+ele;
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum of all the Elements = "+sum);
	}
}
