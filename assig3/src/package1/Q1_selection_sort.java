package package1;

public class Q1_selection_sort {
    public static void main(String[] args) {
        int[] n = {6,3,2,7,9,1,4};
        int size = n.length;
        int temp ;
        int minIndex ;
        System.out.print("the array are : ");
        for (int num : n) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < size-1; i++) {
            minIndex = i;
            for (int j = i+1; j < size; j++) {
                if(n[minIndex] > n[j])
                  minIndex = j;
            }
            temp = n[minIndex];
            n[minIndex] = n[i];
            n[i] = temp;
            System.out.println();
            for (int num : n) {
                System.out.print(num + " ");

            }
        }
            System.out.println();
            System.out.println("After sorting");
            for (int num : n) {
                System.out.print(num + " ");
            }

        }
    }

