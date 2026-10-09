package package1;
/*WAP to calculate and display the factorial of all numbers between m and n (where m < n, m
> 0, n > 0)
Sample run:
Enter the value of m: 2
Enter the value of n: 5
Factorial of 2 is: 2
Factorial of 3 is: 6
Factorial of 4 is: 24
Factorial of 5 is: 120*/

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value m");
        int m = sc.nextInt();
        System.out.println("Enter the value n");
        int n = sc.nextInt();
        if (m <= 0 || n <= 0 || m > n) {
            System.out.println("invalid ");
        } else {
            for (int i = m; i <= n; i++) {
                int p=1;
                for (int j=1;j<=i;j++){
                    p*=j;
                }
                System.out.println("Factorial of "+i+" is "+p);
            }
        }
    }
}