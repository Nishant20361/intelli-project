package package1;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 9, 7};
        int[] arr2 = {4, 5, 6};
        int[] merge = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merge[arr1.length + i] = arr2[i];
        }
        System.out.print("merged array : ");
        for (int num : merge) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("sorting array");
        Arrays.sort(merge);
        for (int num : merge) {
            System.out.print(num + " ");
        }
    }
}