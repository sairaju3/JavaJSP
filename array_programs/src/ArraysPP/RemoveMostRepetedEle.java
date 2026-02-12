package ArraysPP;

public class RemoveMostRepetedEle 
{
	public static void remove(int[] arr)
	{
		int visited=Integer.MIN_VALUE;
		int maxCount=0;
		int mostRepArr=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=visited && arr[i]%2==0)
			{
				int count=1;
				for(int j=i+1;j<=arr.length-1;j++)	
				{
					if(arr[i]==arr[j] && arr[j]%2==0)
					{
						count++;
						arr[j]=visited;
					}
				}
				if(count>maxCount)
				{
					maxCount=count;
					mostRepArr=arr[i];
				}
			}
			
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=mostRepArr && arr[i]!=visited)
			{
				System.out.print(arr[i]+" ");
			}
		}
		//System.out.println(" "+maxCount);
	}
	public static void main(String[] args) 
	{
		
		int[] arr= {1,2,3,4,5,2,3,4,4,4,8,8,8,8,8};
		remove(arr);
	}
}
