package package1;
/*An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your
program to determine whether or not the number is divisible by 9. Test it on the following
numbers: Use while loop.
n = 123456
n = 154368
n = 621594
Hint: Use the % operator to get each digit; then use / operator to remove the digit.*/
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the no.");
        int n = sc.nextInt();
        int t = n;
        while (n > 0) {
            int a = n % 10;
            sum = sum + a;
            n = n / 10;

        }
        if (sum % 9 == 0) {
            System.out.println("yes " + t + " is divisible by 9");
        } else {
            System.out.println("no " + t + " is not divisible by 9");
        }
    }
}
