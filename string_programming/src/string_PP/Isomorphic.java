package string_PP;

import java.util.Scanner;

public class Isomorphic {

    public static void checkIsomorphic(String st1, String st2) {

        if (st1.length() != st2.length()) {
            System.out.println("Not Isomorphic");
            return;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < st1.length(); i++) {
            char c1 = st1.charAt(i);
            char c2 = st2.charAt(i);

            if (map1[c1] == 0 && map2[c2] == 0) {
                map1[c1] = c2;
                map2[c2] = c1;
            } else {
                if (map1[c1] != c2 || map2[c2] != c1) {
                    System.out.println("Not Isomorphic");
                    return;
                }
            }
        }

        System.out.println("Isomorphic");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String");
        String st1 = sc.next();

        System.out.println("Enter Second String");
        String st2 = sc.next();

        checkIsomorphic(st1, st2);
        sc.close();
    }
}
