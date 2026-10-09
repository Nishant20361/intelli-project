package package1;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int i=1;
        int p;
        while (i<=n)
        {
            p=n*i;
            i++;

        }
        System.out.println("factorial of "+n+" is "+i);
    }

}
