package package1;
/*Write a java program that takes an integer N from user, uses
Math. Random () to print N random integer numbers between 1 to N, and then prints their
average value. Use do while loop.
Sample run:
Enter a number: 6
Random numbers generated are: 6 4 5 2 2 5
Average of 6 random numbers are 4*/
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        int sum=0;
        int a=1;
        System.out.print("random no are generated are ");
        do {
            int ran=(int)(Math.random()*n)+1;
            System.out.print(ran+" ");
            sum+=ran;
            a++;
        }while (a<=n);
            double average=sum/n;
        System.out.println(" ");
        System.out.println("the average is "+ average);

    }
}
