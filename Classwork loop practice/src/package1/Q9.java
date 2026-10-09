package package1;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int x=1;
        for (int i=1;i<=n;i++)
        {
            x=x*i;

        }
        System.out.println(x);
    }

}
