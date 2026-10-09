package student;
import java.util.Scanner;
 public class student{

    String name;
    int roll;
     protected void inputDetail() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the name");
         name = sc.next();
         System.out.println("enter the roll ");
         roll = sc.nextInt();
     }
    }


