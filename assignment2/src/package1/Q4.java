package package1;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=(int) sc.nextDouble();
        int temp=n;
        int digit1=temp%10;
        temp=temp/10;
        int digit2=temp%10;
        temp=temp/10;
        int digit3=temp%10;
        temp=temp/10;
        int sum=digit1+digit2+digit3;
        System.out.println("Sum of the digit in"+" "+n+" "+"is"+" "+sum);

    }
}
