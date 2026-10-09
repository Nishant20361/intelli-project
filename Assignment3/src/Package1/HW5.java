package Package1;
import com.sun.source.tree.IfTree;

import java.util.Scanner;
public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your gender (M or F)  ");
        // String gender= sc.next();
        char gender = sc.next().charAt(0);
        if (gender == 'f' || gender == 'F') {
            System.out.print("First name :  ");
            String fname = sc.next();
            System.out.print("Last name :  ");
            String lname = sc.next();
            System.out.print("Age :  ");
            int age = sc.nextInt();
            if (age < 20) {
                System.out.println(fname + lname);
            } else {
                System.out.println("Are you married (y or n) ");
                char married = sc.next().charAt(0);
                if (married == 'Y' || married == 'y') {
                    System.out.println("Then I shall call you Mrs. " + fname + " " + lname);
                }  else if (married == 'n' || married == 'N')
                    System.out.println("Then I shall call you Ms. " + fname + " " + lname);
            }
        }
                if (gender == 'M' || gender == 'm') {
                    System.out.print("First name :  ");
                    String fsname = sc.next();
                    System.out.print("Last name :  ");
                    String lsname = sc.next();
                    System.out.print("Age :  ");
                    int ages = sc.nextInt();
                    if (ages < 20)
                        System.out.println("Then I shall call you " + fsname + " " + lsname);
                    else {
                        System.out.println("Then I shall call you Mr. " + fsname + " " + lsname);

                    }


                }

            }
        }