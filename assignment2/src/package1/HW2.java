package package1;
import java.util.Scanner;
public class HW2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of eggs you have");
        int n= sc.nextInt();
        int gross=n/144;
        n=n%144;
        int dozen=n/12;
        n=n/12;
        System.out.println("gross ="+" "+gross);
        System.out.println("dozen"+" "+dozen);
        System.out.println("left over"+" "+n);

    }
}
