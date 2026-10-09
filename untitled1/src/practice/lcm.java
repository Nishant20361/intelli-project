package practice;
import java.util.*;
public class lcm {
    public static int gcd(int a, int b) {

        while (b > 0) {
            int n=b;
            b = a % b;
            a = n;


        }
        return a;
    }

    public static int lcm1(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(lcm1(a,b));

    }

}
