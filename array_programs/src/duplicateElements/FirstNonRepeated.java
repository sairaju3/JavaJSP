package duplicateElements;


public class FirstNonRepeated 
{
    // Method to count duplicates of a specific element
//    public static int countFrequency(int[] arr, int ele)
//    {
//        int visited = Integer.MIN_VALUE;
//        int count = 0;
//
//        for(int i = 0; i <= arr.length - 1; i++)
//        {
//            if(arr[i] == ele && arr[i] != visited)
//            {
//                count++;
//            }
//        }
//        return count;
//    }

    // Method to find the first non-repeated element
    public static void firstNonRepeatedElement(int[] arr)
    {
    	boolean condn=true;
        int visited = Integer.MIN_VALUE;
        
        for(int i = 0; i <= arr.length - 1; i++)
        {
            if(arr[i] != visited)        // check only valid elements
            {
            	int count=1;
                for(int j=i+1;j<=arr.length-1;j++)
                {
                	if(arr[i]==arr[j])
                	{
                		count++;
                		arr[j]=visited;
                	}
                }
                if(count == 1)            // if frequency is 1 → non-repeated
                {
                    System.out.println("First Non-Repeated Element: "+arr[i]);
                    condn=false;
                    return;
                }
            }
        }
        if(condn)
        	System.out.println("no non-repeated element found");
          // no non-repeated element found
    }

    public static void main(String[] args)
    {
        int[] arr = { 5, 2, 3, 5, 2, 7, 8, 8, 6};

        firstNonRepeatedElement(arr);
       
//
//        if(nonRepeated != Integer.MIN_VALUE)
//            System.out.println("First Non-Repeated Element: " + nonRepeated);
//        else
//            System.out.println("No non-repeated element found");
    }
}

