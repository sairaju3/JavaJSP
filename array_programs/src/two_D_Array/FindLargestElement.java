package two_D_Array;

public class FindLargestElement 
{
	public static void findLargest(int[][] arr) 
	{
		int larg=arr[0][0];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[0].length-1;j++)
			{
				if(arr[i][j]>larg)
				{
					larg=arr[i][j];
				}
			}
		}
		System.out.println(larg);
	}
	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},{4,3,2}
		};
		findLargest(arr);
	}
}
