public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] arr1 = new int[arr.length];
        for(int i = 0; i<arr.length; i++)
        {
            arr1[i]=arr[(arr.length - i-1)];
        }
        return arr1;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
          if(arr[i] > max)
           {
             max = arr[i];
           }
        }
        int newMax = max;
        max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
          if(arr[i] > max && arr[i] < newMax)
           {
             max = arr[i];
           }
        }
        return max;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        boolean var = true;
        for(int i = 1; i<arr.length-1; i++)
        {
            double doub1 = (double)(arr[i-1]);
            double doub2 = (double)(arr[i]);
            double doub3 = (double)(arr[i+1]);
            if((doub1/doub2) == (doub2/doub3))
            {
                var = true;
            }
            else
            {
                var = false;
                break;
            }
        }
        return var;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(reverse(arr));
        System.out.println(isGeometric(arr));
        System.out.println(secondLargest(arr));
    }
}
