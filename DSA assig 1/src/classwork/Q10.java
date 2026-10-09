package classwork;
import java.util.*;
public class Q10 {
    public static double sumColumn(double[][] m, int columnIndex){
     int sum=0;
        for (int j = 0; j < m.length; j++) {
           sum+=m[j][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  number of row ");
        int m = sc.nextInt();
        System.out.println("Enter the number of column");
        int n = sc.nextInt();
        double[][] a = new double[m][n];
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
        for (int i = 0; i < m; i++) {
            double sum =sumColumn(a,i);
            System.out.println("Sum of the elements at column "+i+" is "+sum);
        }
    }
}
