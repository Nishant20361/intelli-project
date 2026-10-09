package Package1;

import java.util.*;

public class Q5 {
    public  static int second(int []arr) {
        int max1 = arr[0], max2 = arr[0];
        int s = arr.length;
        if (s < 2) {
            System.out.println("invalid inpt");

        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && max2 != max1) {
                max2 = arr[i];

            }
        }
        return max2;
//        else {
//           Arrays.sort(arr);
//            }
//
//
//     return arr[arr.length-2];

    }

    public static void main(String[] args) {
       int[]arr={ 12,12,12,34,6,7,3,7,6,90,-2};
      second(arr);
        System.out.println(second(arr));
    }
}
