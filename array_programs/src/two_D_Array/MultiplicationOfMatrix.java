package two_D_Array;

public class MultiplicationOfMatrix 
{
	public static void main(String[] args) 
	{
		int[][] arr= {
				{1,2,3},{4,5,6},{2,4,6}
		};
		int[][] brr= {
				{2,4,6},{3,4,1}
		};
		
		int[][] crr=new int[arr.length][brr[0].length];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=brr[0].length-1;j++)
			{
				for(int k=0;k<=brr.length-1;k++)
				{
					crr[i][j]=crr[i][j]+(arr[i][k]*brr[k][j]);
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=brr[0].length-1;j++)
			{
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
