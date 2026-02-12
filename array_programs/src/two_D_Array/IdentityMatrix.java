package two_D_Array;
public class IdentityMatrix 
{
	public static boolean checkIdentityMatrix(int[][] arr)
	{
		boolean cond=true;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				if(i==j && arr[i][j]!=1)
					cond=false;
				else if(i!=j && arr[i][j]!=0)
					cond=false;
			}
		}
		return cond;
	}
//	public static boolean checkLength(int[][] arr)
//	{
//		
//		for(int i=0;i<=arr.length;i++)
//		{
//			if(arr.length!=arr[0].length)
//				return false;
//		}
//		return true;
//		
//	}
	public static void main(String[] args) 
	{
		int[][] arr = {
				{1,0,0},{0,1,0},{0,0,1}	
		};
		if(arr.length==arr[0].length)
		{
			if(checkIdentityMatrix(arr))
				System.out.println("The Given Matrix Is Identity");
			else
				System.out.println("The Given Matrix non an Identity");	
		}
		else
			System.out.println("The given matrix is not Idenetity");

		
	}
}
