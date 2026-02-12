package twoDarray_task;

public class RotationClass 
{
	public  int[][] transpose(int[][] arr)
	{
		int[][] newArr =new int[arr.length][arr[0].length] ;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				newArr[j][i]=arr[i][j];
			}
		}
		return newArr;
	}
	public  int[][] rotateClockWise(int[][] arr)
	{
	
		int[][] newArr =new int[arr.length][arr[0].length] ;
		for(int i=0;i<=arr.length-1;i++)
		{
			int k=0;
			for(int j=arr[i].length-1;j>=0;j--)
			{
				newArr[i][k++]=arr[i][j];
			}
		}
		return newArr;
		
	}
	public void print2DArray(int[][] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void rotate180deg(int[][] arr)
	{
		int [][] rotate =transpose(rotateClockWise(arr));
		print2DArray(transpose(rotateClockWise(rotate)));
	
	}
	public void rotate90deg(int[][] arr)
	{
		print2DArray(rotateClockWise(transpose(arr)));
	}
	public void rotate270deg(int[][] arr)
	{
		print2DArray(transpose(rotateClockWise(arr)));
	}
}
