package two_D_Array;

public class SumOfSecondaryDiagonal 
{
	public static void main(String[] args) 
	{
		int [][] arr= {
				{1,2,3},{3,4,5},{6,7,8}
		};
		int sum=0;
		int n=arr.length;
		for(int i=0;i<=n-1;i++)
		{
			int ele=arr[i][n-1-i];
			sum=sum+ele;
		}
		System.out.println("Sum of Secondary Diagonal = "+sum);
	}
}
