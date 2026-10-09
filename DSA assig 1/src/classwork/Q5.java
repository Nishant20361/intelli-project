package classwork;
import java.util.*;
public class Q5 {
    public static int summ(int n){

        while (n>=10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();
        System.out.println(summ(n));
    }
}
