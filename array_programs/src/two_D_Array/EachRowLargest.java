package two_D_Array;

public class EachRowLargest 
{
	public static void findLargest(int[][] arr) 
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			int larg=arr[i][0];
			for(int j=0;j<=arr[0].length-1;j++)
			{
				if(arr[i][j]>larg)
				{
					larg=arr[i][j];
				}
			}
			System.out.println("Each Row Largest Element: "+larg);
		}
	}
	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},{4,3,2}
		};
		findLargest(arr);
	}
}
