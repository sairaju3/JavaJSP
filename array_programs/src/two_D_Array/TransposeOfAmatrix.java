package two_D_Array;

public class TransposeOfAmatrix 
{
	public static void main(String[] args) 
	{
		int [][] arr= {
				{1,2,3},{4,5,6},{7,8,9}
		};
		int [][] br=new int[arr[0].length][arr.length];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				br[j][i]=arr[i][j];
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(br[i][j]+" ");
			}
			System.out.println();
		}
	}
}
