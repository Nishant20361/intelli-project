package Package1;

import java.util.Scanner;

public class Q3 {
    public  static int reverse( int n){
    int rev=0;
        while(n>0) {
            int digit = n % 10;
            rev =rev* 10 + digit;
            n = n / 10;
        }
        return rev;
    }
    public static boolean isPalindrome(int n){
    return n==reverse(n);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        if (isPalindrome(n)){
            System.out.println(n+"  is palindrome");
        }
        else {
            System.out.println(n+"  is not palindrome");
        }
    }
}
