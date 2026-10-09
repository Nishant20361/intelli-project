package package1;
/*Question-9:
Write a java program to take an integer input from the user and print the input by removing all
zeros.
Example: Input = 10200 then Output = 12.
Sample run:
Enter an integer number: 10203040
After removing 0 from number 10203040, the new number is 1234.*/
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer number :  ");
        int n = sc.nextInt();
       int t =n;
        int rev=0;
        while (t>0){
            int digit=t%10;
            rev=rev*10+digit;
            t=t/10;
        }
        t=rev;
        rev=0;
            while(t>0){
                int digit=t%10;
                if (digit!=0)
                 rev=rev*10+digit;
                t=t/10;
            }
        System.out.println(rev);
    }

}
