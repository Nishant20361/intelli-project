//Q) Write the iterative code of “Sum of n numbers”
//Constraints:
//        1. Type of input: Integer
//2. No. of inputs: max 100
//        3. Duplicate numbers allowed
//4. Positive number only
package ASSIGNMENT1;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        if (n>100){
            System.out.println("the number is exceed");
            return;
        }
        System.out.println(" Enter the number  "+n+" times");
        int sum=0;
        for (int i = 1; i <= n;) {

            int num= sc.nextInt();
            if (num<0){
                System.out.println("only positive number are allowed skipping input "+ num);
                    continue;
            }
            sum+=num;
            i++;
        }
        System.out.println("the sum of the number are "+ sum);
        sc.close();
    }
}
