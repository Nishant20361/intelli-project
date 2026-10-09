package package1;
/*Write a java program to print the sum of all even numbers and the product of all odd numbers
from 1 to N. Where, N is the input to the program.
For input, N = 10
Sum of all even numbers = 2 + 4 + 6 + 8 + 10 = 30
Product of all odd numbers = 1 * 3 * 5 * 7 * 9 = 945*/
import java.util.Scanner;
public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input number  ");
        int n = sc.nextInt();
        int even = 0;long odd=1;
        for (int i = 1; i <= n; i ++) {
            if (i % 2 == 0) {
                even+=i;
            } else {
                odd *= i;
            }

            }
            System.out.println(even);

            System.out.println(odd);

    }
}