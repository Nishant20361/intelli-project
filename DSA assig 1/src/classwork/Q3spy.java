package classwork;
import java.util.*;
public class Q3spy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int n =sc.nextInt();
        int t=n;
        int sum=0;
        int product=1;
        while (n>0){
            int digit =n%10;
            sum+=digit;
            product*=digit;
            n/=10;

        }
        if (sum==product) {
            System.out.println("It is spy number");
        }
        else {
            System.out.println("It is not spy number");
        }
    }
}
