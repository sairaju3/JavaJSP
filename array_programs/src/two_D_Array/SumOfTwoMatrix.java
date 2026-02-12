package two_D_Array;

public class SumOfTwoMatrix 
{
	public static void main(String[] args) 
	{
		int[][] arr= {
				{1,2,3},{4,5,6}
		};
		int[][] brr= {
				{2,4,6},{3,4,1}
		};
		
		int[][] crr=new int[arr.length][arr[0].length];
	
		for(int i=0;i<=crr.length-1;i++)
		{
			for(int j=0;j<=crr[i].length-1;j++)
			{
				crr[i][j]=arr[i][j]+brr[i][j];
			}
			
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
