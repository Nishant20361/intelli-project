package package1;
/*WAP to enter the first number and second number. Display the prime numbers between the
first and second number.
Sample run:
Enter the first number: 4
Enter the second number: 15
Prime numbers between 4 and 15 are: 5 7 11 13*/
import  java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the first number ");
        int a= sc.nextInt();
        System.out.print("Enter the second number  ");
        int b= sc.nextInt();
        int t, of=-1;

        for ( int i=a;i<b;i++){
             of=-1;
           for (int j= 2;j<i;j++){
               if (i%j==0){
                   of=1;
                   break;
               }

           }if (of==-1)
            System.out.println(i);
        }
    }
}
