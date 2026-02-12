package duplicateElements;

public class RemoveCount {

    public static int countRemovals(int[] arr) {
        int visited = Integer.MIN_VALUE;
        int removeCount = 0;
        int index=0;
        for (int i = 0; i <= arr.length - 1; i++) 
        {
            if (arr[i] != visited && arr[i]%2==0)        // only check valid elements
            {
                for (int j = i + 1; j <= arr.length - 1; j++) {
                    if (arr[i] == arr[j] && arr[j]%2==0) // found duplicate
                    {
                        removeCount++;    // must remove this duplicate
                        arr[j] = visited; // mark it visited
                        index=arr[i];
                    }
                }
            }
        }
        System.out.println(index+" is most repetated element  :-> "+removeCount);
        return removeCount;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 3, 2, 3,3,3};

        int result = countRemovals(arr);

        System.out.println("Number of elements to remove for unique array: " + result);
    }
}

