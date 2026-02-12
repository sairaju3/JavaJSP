package duplicateElements;

import java.util.Arrays;

public class FrequencyOfElements
{
	public static void frequencyofElements(int[] arr)
	{
		int visited=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=visited)
			{
				int count=1;
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[i]==arr[j])
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
		int[] arr = {2,5,2,5,9,2,3,3,3,1};
		System.out.println(Arrays.toString(arr));
		frequencyofElements(arr);
	}
}
