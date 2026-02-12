package two_D_Array;

public class SumOfEveryRow 
{
	public static void main(String[] args) 
	{
		int [][] arr = {
				{1,2,3},
				{3,4,8},
				{7,6,9}
		};
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int sum=0;
			for(int j=0;j<=arr[i].length-1;j++)
			{
				sum=sum+arr[i][j];
			}
			
			System.out.println(sum);
		}
		
	}
}
