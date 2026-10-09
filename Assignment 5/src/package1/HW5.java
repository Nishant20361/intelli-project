package package1;
import java.util.Scanner;
//fibonacci series
public class HW5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
          int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a+" , "+b);


            for (int j = 3; j <= n; j++) {

              int  t = a + b;
                a = b;
                b = t;


                    System.out.print(" , "+t+" ");


            }

        }

    }

