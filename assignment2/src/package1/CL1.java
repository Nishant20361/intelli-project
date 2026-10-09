package package1;
import java.util.Scanner;
public class CL1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dividend,divisor;
        System.out.println("Enter the dividend");
        dividend=sc.nextInt();
        System.out.println("Enter the divisor");
        divisor= sc.nextInt();
        int quotient=(dividend/divisor);
        int reminder=(dividend%divisor);
        System.out.println("Quotient is"+" "+quotient);
        System.out.println("Reminder is"+" "+reminder);
    }
}
