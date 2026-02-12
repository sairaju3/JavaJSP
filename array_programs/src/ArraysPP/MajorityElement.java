package ArraysPP;

import java.util.Scanner;

public class MajorityElement {

    public static int findMajority(int[] arr) {

        
        int count = 1;
        int index=arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == index) {
                count++;
            } 
            else {
                count--;
            }

            if (count == 0) 
            {
                index = arr[i];
                count = 1;
            }
        }

        return index;   // majority element always exists
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2};
        System.out.println("Majority Element: " + findMajority(arr));
    }
}

