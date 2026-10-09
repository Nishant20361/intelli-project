package homework;
import java .util.*;
public class HW1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbeer");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a + b == c){
            System.out.println("correct");
        } else if (a == b-c) {
            System.out.println("correct");
        } else if (a*b==c) {
            System.out.println("correct");
        }
        else {
            System.out.println("your arithmatic is 😑🤪");
        }
    }
}
