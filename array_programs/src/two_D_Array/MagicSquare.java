package two_D_Array;

//import java.util.Scanner;

public class MagicSquare 
{
	public static boolean sumOfRows(int[][] arr)
	{
		int magic=0;
		
		for(int j=0;j<=arr.length-1;j++)
		{
			magic=magic+arr[0][j];
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int rowSum=0;
			for(int j=0;j<=arr[i].length-1;j++)
			{
				rowSum=rowSum+arr[i][j];
			}
			if(magic!=rowSum)
				return false;
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int colSum=0;
			for(int j=0;j<=arr[i].length-1;j++)
			{
				colSum=colSum+arr[j][i];
			}
			if(magic!=colSum)
				return false;
		}
		
		int digSum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				if(i==j)
					digSum=digSum+arr[i][j];
			}
			
		}
		if(magic!=digSum)
			return false;
		
		int secSum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				if((i+j)==arr.length-1)
					secSum=secSum+arr[i][j];
			}
			
		}
		if(magic!=secSum)
			return false;
		
		return true;
		
	}
	
	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		int [][] arr = {
				{8, 1, 6},
				{3, 5, 7},
				{4, 9, 2}
		};
		if(sumOfRows(arr))
		{
			System.out.println("Magic square");
		}
		else
		{
			System.out.println("Not a Magic square");
		}
	}
}
