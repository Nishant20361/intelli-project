import java.util.*;
public class hh{
    public static int gcd(int a, int b) {

        while (b != 0) {
            int n=b;
            b = a % b;
            a = n;


        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println(lcm(a,b));

    }

}




