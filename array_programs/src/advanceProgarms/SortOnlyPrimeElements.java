package advanceProgarms;

import java.util.Arrays;

//WAP to sort only the prime elements present in the given array in descending order.

//i/p :- {9,5,3,6,2,7,1}
//o/p :- {9,7,5,6,3,2,1}

public class SortOnlyPrimeElements {
	public static boolean primeElements(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count == 2;
	}

	public static void decendingPrime(int[] arr) 
	{
		for (int i = 0; i <= arr.length - 1; i++)
		{
			if (primeElements(arr[i]))
			{
				for (int j = i + 1; j <= arr.length - 1; j++) 
				{
					if (primeElements(arr[j]))
					{
						if (arr[i] < arr[j]) 
						{
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}

				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 5, 3, 6, 2, 7, 1 };
		System.out.println(Arrays.toString(arr));
		
		decendingPrime(arr);
		System.out.println(Arrays.toString(arr));
	}
}
