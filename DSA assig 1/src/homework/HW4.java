package homework;
import java.util.*;
public class HW4 {
    public static double[][] addMatrix(double[][] a, double[][] b){
      if (a.length!= b.length){
          System.out.println("invalid");
      }
        int r=a.length;
        double [][]result =new double[r][r];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < r; j++) {
                result[i][j]=a[i][j]+b[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of the rows");
        int m= sc.nextInt();
        System.out.println("Enter the no of the column");
        int n = sc.nextInt();
        double [][]a1=new double[m][n];
        double [][]a2=new double[m][n];
        System.out.println(" enter the first array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a1[i][j]= sc.nextDouble();
            }
        }
        System.out.println(" enter the second array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a2[i][j] = sc.nextDouble();
            }
        }
        double [][]sum=addMatrix(a1,a2);
     for (double[]row:sum){
         for (double col:row){

                System.out.print(col+" ");
            }
         System.out.println();
            }
        }
    }

