package classwork;
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number of row ");
        int m = sc.nextInt();
        System.out.println("Enter the number of column");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        int sum = 0;
        System.out.println("Enter the element of the array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                sum +=  a[i][j];
            }

        }
        System.out.println("The element of 2d  array are ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" The sum of the array are "+ sum);
    }
}
