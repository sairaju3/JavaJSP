package hollow_pattern_Pyramid;

/*
A         1
A B     1 2
A B C 1 2 3
A B     1 2
A         1
 */
import java.util.Scanner;

public class ButterFlyNumberAndAlphabeticPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Row Value");
		int row = sc.nextInt();
		int star = 1;
		int space = row - 1;

		for (int i = 1; i <= row; i++) {
			char ch = 'A';
			int num = 1;
			for (int j = 1; j <= star; j++) {
				System.out.print(ch++ + " ");
			}
			for (int k = 1; k <= space; k++) {
				System.out.print(" " + " ");
			}
			for (int l = 1; l <= star; l++) {

				System.out.print(num++ + " ");
			}
			if (i <= row / 2) {
				star++;
				space = space - 2;
			} else {
				star--;
				space = space + 2;
			}

			System.out.println();
		}
	}
}
