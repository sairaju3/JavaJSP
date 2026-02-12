package ArraysPP;

public class PeakElement 
{
	public static void peakEle(int[] arr)
	{
		int peak=0;
		int largest=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(peak<largest)
			{
				peak=largest;
				largest=arr[i];
			}	
		}
		System.out.println(peak);
	}
	public static void main(String[] args) {
		
		int[] arr= {3,21,15,12,9,22};
		peakEle(arr);
	}
}
