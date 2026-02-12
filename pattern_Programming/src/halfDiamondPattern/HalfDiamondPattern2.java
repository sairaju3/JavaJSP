package halfDiamondPattern;
//	      * 
//	    * * 
// 	  * * * 
//  	* * 
//  	  * 

import java.util.Scanner;

public class HalfDiamondPattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Row Value");
		int row = sc.nextInt();
		if(row%2==0)
			row++;
		int star = 1;
		int space = row/2;

		for (int i = 1; i <= row; i++) {
			
			for(int k=1;k<=space;k++)
			{
				System.out.print(" "+" ");
			}
			for (int j = 1; j <= star; j++) 
			{
				System.out.print("*"+ " ");
			}
			
			if (i <= row / 2) {
				star++;
				space = space - 1;
			} 
			else {
				star--;
				space = space + 1;
			}
			System.out.println();
		}
	}
}
