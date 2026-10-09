package practice;
import java.util.*;

public class a1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter how many numbers you want to add (max 100): ");
            int n = sc.nextInt();

            if (n > 100) {
                System.out.println("The number exceeds 100. Exiting program.");
                sc.close();
                return;
            }

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter number " + i + ": ");
                int num = sc.nextInt();

                if (num < 0) {
                    System.out.println("Only positive numbers are allowed! Skipping " + num);
                    continue;  // skip negative numbers, move to next iteration
                }

                sum += num;
            }

            System.out.println("The sum of the entered positive numbers is: " + sum);
            sc.close();
        }
    }