package package1;
/*WAP to enter the value of n and display find the following sum of the series:
1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n)*/
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
       int n= sc.nextInt();
        int sum=0;
        String s = "1";

        for (int i=1;i<=n;i++) {
            System.out.print("+");
            for (int j = 1; j <= i; j++) {
                sum+=j;


            }
            if(i>1)
                s=s+"+"+i;
            System.out.print("("+s+")");
        }
        System.out.print("="+sum);
    }
}
