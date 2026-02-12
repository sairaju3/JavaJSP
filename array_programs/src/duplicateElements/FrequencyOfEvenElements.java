package duplicateElements;

public class FrequencyOfEvenElements 
{
	public static void frequencyofEven(int[] arr)
	{
		int visited=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=visited && arr[i]%2==0)
			{
				int count=1;
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[i]%2==0 && arr[i]==arr[j] )
					{
						count++;
						arr[j]=visited;
					}
				}
				System.out.println("Element "+arr[i]+" -> frequency "+count);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {2,5,2,3,3,1,4,8,4,8};
		frequencyofEven(arr);
	}
}
