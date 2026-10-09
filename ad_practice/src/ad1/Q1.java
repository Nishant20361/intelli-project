package ad1;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if (n>100){
            System.out.println("The number is greater than 100 is not allowed " );
            return;
        }
        int sum = 0;
        for (int i = 1; i<=n;) {
            int m=sc.nextInt();
            if (m<0){
                System.out.println("The number is less than 0 is   not allowed ");
                continue;
            }
            i++;
            sum+=m;

        }
        System.out.println("The sum is "+sum);
    }
}
