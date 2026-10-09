package classwork;
import java.util.*;
public class Q9 {
    public static int sumMajorDiagonal(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j){
                    sum += m[i][j];
            }
        }
    }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  number of row ");
        int m = sc.nextInt();
        System.out.println("Enter the number of column");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Enter the eleement of the array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(" the array are ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("the sum of the array "+sumMajorDiagonal(a));
    }
}