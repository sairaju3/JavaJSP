package two_D_Array;

public class ReverseOrderOfMatrix 
{
	public static int[][] rowReverseOrder(int[][] arr)
	{
		int[][] newArr =new int[arr.length][arr[0].length] ; 
		for(int i=0;i<=arr.length-1;i++)
		{
			int k=0;
			for(int j=arr[0].length-1;j>=0;j--)
			{
				newArr[i][k++]=arr[i][j];
			}
		}
		return newArr;
		
	}
	public static void print2DArray(int[][] arr)
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
	public static void main(String[] args) 
	{
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] rev =rowReverseOrder(arr);
		System.out.println("Reverse Order....");
		print2DArray(rev);
	}
}
