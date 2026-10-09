package Package1;
/*Write a Java program that takes a year from user and print true if that year is a leap year
otherwise print false.
Here is a sample run:
Input the year: 2016
2016 is a leap year: true
Input the year: 2008
2008 is a leap0 year: false
Input the year: 1900
1900 is a leap year: false*/
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int n= sc.nextInt();
        boolean x=(n%4)==0;
        boolean y=(n%100)!=0;
        boolean z=(n%100==0)&&(n%400==0);
        if (x && (y || z)){
            System.out.println(n+" leap year");
        }
        else {
            System.out.println("not leap year");
        }
    }
}
