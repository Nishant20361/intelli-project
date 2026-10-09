package Package1;
/*estion-4:
Write a java program that prompts the user to enter an integer and determines whether
it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible
by 5 or 6, but not both.
Here is a sample run of this program:
Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? True*/
import java.util.Scanner;
public class HW4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Integer ");
        int n=sc.nextInt();
        boolean a=n%5==0;
        boolean b=n%6==0;
        System.out.println("Is the number divisible by 5 and 6? " + (a && b));
        System.out.println("Is the number divisible by 5 or 6? " + (a || b));
        if ( a^b)
          System.out.println("Is the number divisible by 5 or 6, but not both? " + (a ^ b));


        }

    }



