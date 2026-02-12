package two_D_Array;
	
	public class SmallesttElement 
	{
		public static void findLargest(int[][] arr) 
		{
			int smal=arr[0][0];
			for(int i=0;i<=arr.length-1;i++)
			{
				for(int j=0;j<=arr[0].length-1;j++)
				{
					if((i==1) )
					{
						if(arr[i][j]<smal)
						{
							smal=arr[i][j];
						}
					}
				}
			}
			System.out.println(smal);
		}
		public static void main(String[] args) {
			int[][] arr= {
					{7,2,3},{4,3,2},{2,4,2}
			};
			findLargest(arr);
		}
	}


