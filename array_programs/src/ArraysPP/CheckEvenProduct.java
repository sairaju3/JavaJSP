package ArraysPP;

public class CheckEvenProduct {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8};

        if (arr.length < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }

        int last = arr[arr.length - 1];
        int secondLast = arr[arr.length - 2];

//        boolean isEvenProduct = (last % 2 == 0) || (secondLast % 2 == 0);
        boolean isEvenProduct = ((arr[arr.length - 1] * arr[arr.length - 2]) % 2 == 0);


        System.out.println("Is the product even? " + isEvenProduct);
    }
}

