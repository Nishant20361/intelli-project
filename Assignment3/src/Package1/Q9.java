package Package1;
/*Write a program to input 3 integer number a, b, c. Find the largest number among 3.
Also find the 2nd largest number among 3. Here is the sample output:
Enter the value of a, b, c:10 30 50
Largest number: 50
2nd largest number: 30*/
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a, b, c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a > b && a > c) {
            System.out.println("largest number " + a);
            if (b > c) {
                System.out.println("2nd largest number " + b);
            } else
                System.out.println("2nd largest number" + c);
        }
       else if (a < b && b > c) {


            System.out.println("largest number " + b);
            if (a < c)
                System.out.println("2nd largest number " + c);
            else
                System.out.println("2nd largest number" + a);

        } if (a < c && b < c){
                System.out.println("largest number " + c);
            if (a > b)
                System.out.println("2nd largest number " + a);
            else
                System.out.println("2nd largest number " + b);
        }
       else
            System.out.println("all number are equal");
    }
}