package duplicateElements;

public class RemoveToMakeUnique {
	
	public static void check(int[] arr)
	{
		int removeCount = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                removeCount++;
            }
        }

        System.out.println("Elements to remove: " + removeCount);
	}

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        check(arr);
    }
        
}

