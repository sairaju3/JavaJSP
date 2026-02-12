package reverseRightAngleTriangle;
/*
d d d d 
3 3 3 
b b 
1
 */
import java.util.Scanner;

public class PatternDand1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row Value");
		int row = sc.nextInt();
		
		char ch = (char)(96+row);
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0)
					System.out.print(ch + " ");
				else
					System.out.print(i + " ");
				
			}
			ch--;
			System.out.println();
		}
	}
}
