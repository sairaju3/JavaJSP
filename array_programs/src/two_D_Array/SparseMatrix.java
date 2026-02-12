package two_D_Array;

// A MATRIX IS KNOWN AS SPARSE MATRIX,IF THE NUMBER OF ZEROS IS GRETHER THEN THE NON ZEROS.

public class SparseMatrix 
{
	public static void main(String[] args) 
	{
		int[][] arr = {
				{1,0,0},{0,2,3},{0,0,5}	
		};
		int count=0;
		int nonCount=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				if(arr[i][j]==0)
				{
					count++;
				}
				else 
				{
					nonCount++;
				}
			}
		}
		if(count>nonCount)
			System.out.println("Sparse Matrix :- "+count);
		else
			System.out.println("Not a Sparse Matrix "+nonCount);
	}
}
