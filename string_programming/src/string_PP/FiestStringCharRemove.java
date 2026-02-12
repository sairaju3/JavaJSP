package string_PP;

import java.util.Scanner;

public class FiestStringCharRemove {

    public static char[] toCharArray(String st) {
        char[] ch = new char[st.length()];
        for (int i = 0; i < st.length(); i++) {
            ch[i] = st.charAt(i);
        }
        return ch;
    }

    public static void check(String st1, String st2) {
        char[] ch1 = toCharArray(st1); // FIRST string
        char[] ch2 = toCharArray(st2); // SECOND string

        String res = "";

        for (int i = 0; i < ch1.length; i++) 
        {
            boolean found = true;

            for (int j = 0; j < ch2.length; j++)
            {
                if (ch1[i] == ch2[j]) 
                {
                    found = false;
                    break;
                }
            }

            if (found) {
            res = res + ch1[i];
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String");
        String st1 = sc.next();

        System.out.println("Enter Second String");
        String st2 = sc.next();

        check(st1, st2);
    }
}
