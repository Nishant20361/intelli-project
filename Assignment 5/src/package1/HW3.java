package package1;
import java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        double x = sc.nextDouble();
        double  sum = x, n = 1,t=x;
        do {
            sum+=t;

            t=-t*x*x/((2 * n - 1) * (2 * n));
            n++;
        }while (Math.abs(t)>1e-6);

        System.out.println(sum);

    }

}
