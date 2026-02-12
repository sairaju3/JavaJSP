
package pyramidPattern;

/*
      a 
    a b a 
  a b c b a 
a b c d c b a 

 */
import java.util.Scanner;

public class PalindromeAlphabetPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Row Value");
		int row = sc.nextInt();
		int star = 1;
		int space = row - 1;

		int num = 1;
		char ch='a';
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print(" " + " ");
			}
			for (int k = 1; k <= star; k++) {
				if (k <= star / 2)
					System.out.print(ch++ + " ");
				else
					System.out.print(ch-- + " ");
			}
			star = star + 2;
			space--;
			ch++;
			System.out.println();
		}
	}
}
