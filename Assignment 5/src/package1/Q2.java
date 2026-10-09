package package1;
/*WAP to check whether a number is twisted prime or not. Twisted prime is a number if the
number and its reverse both are prime then it is called twisted prime.
Sample run 1:
Enter a number: 97
97 is twisted prime.
Sample run 2: 43
43 is not a twisted prime*/
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int rev = 0;
        int t = n, of = -1, rf = -1;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        for (int i = 2; i <=t/2; i++) {
            if (t % i == 0) {
                of = 1;
               // break;
            }
        }
        for (int i = 2; i <=rev/2; i++) {
            if (rev % i == 0) {
                rf = 1;
             //   break;
            }
        }
        if (of == -1 && rf == -1) {
            System.out.println(t+" is a twisted prime number");
        }else
            System.out.println(t+" is a  not twisted prime number");

    }
}