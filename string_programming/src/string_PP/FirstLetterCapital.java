package string_PP;

import java.util.Scanner;

public class FirstLetterCapital {

    public static void check(String st) {
        char[] ch = st.toCharArray();

        // Capitalize first character
        if (ch[0] >= 'a' && ch[0] <= 'z') 
        {
            ch[0] = (char) (ch[0] - 32);
        }

        // Capitalize character after space
        for (int i = 1; i <=ch.length-1; i++) {
            if (ch[i - 1] == ' ' && ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            }
        }

        // Print result
        for (int i = 0; i <= ch.length-1; i++) {
            System.out.print(ch[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String...");
        String st = sc.nextLine();
        check(st);
    }
}
