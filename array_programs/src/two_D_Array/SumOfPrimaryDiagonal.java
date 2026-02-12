package two_D_Array;

public class SumOfPrimaryDiagonal 
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
				if(i==j)
				{
					sum=sum+arr[i][j];
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		
//			int ele=arr[i][i]; //simple apparoch
//			sum=sum+ele;
			}
			
		System.out.println("Sum of Primary Diagonal = "+sum);
	}
}

