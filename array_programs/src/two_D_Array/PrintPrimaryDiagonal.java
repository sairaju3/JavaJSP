package two_D_Array;

public class PrintPrimaryDiagonal 
{
	public static void main(String[] args) 
	{
		int [][] arr = {
				{1,2,3},{3,4,8},{7,6,9}
		};
		int n=arr.length;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				//if((i+j)==n-1)
				if(i==j)
				{
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
			
			
		}
	}
}
