package duplicateElements;

public class FrequencyOfPrimeElements 
{
	public static boolean checkPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count==2;
	}
	public static void frequencyOfPrime(int[] arr)
	{
		int visited=Integer.MAX_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=visited && checkPrime(arr[i]))
			{
				int count=1;
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[i]==arr[j] )
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
		int[] arr = {2,5,2,9,5,2,1,7,13};
		frequencyOfPrime(arr);
	}
}
