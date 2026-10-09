package package1;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 1, 2, 3, 5};
        System.out.print("the array are : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        while (true) {
            int smallest = Integer.MAX_VALUE;
            int countPositive = 0;
            for (int num : arr) {
                if (num > 0 && num < smallest) {
                    smallest = num;
                }
                if (num > 0) {
                    countPositive++;
                }
            }
            if (countPositive == 0) {
                break;
            }
            System.out.println(countPositive + " elements before reduction");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    arr[i] -= smallest;
                }
            }
            System.out.print("After subtracting " + smallest + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println(" ");
        }
    }
}
