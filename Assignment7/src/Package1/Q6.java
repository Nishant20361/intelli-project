package Package1;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter ");
        int n = sc.nextInt();
        String octal = " ";
        while (n > 0) {
            octal = (n % 8) + octal;
            n /= 8;
        }
        System.out.println(octal);
    }


    }
