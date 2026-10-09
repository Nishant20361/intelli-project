package package1;
/*Write a java program to print largest power of three less than or equal to N.
Sample run:
Enter a number: 100
The largest power of 3 less than or equal to 100 is 81*/
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int ans=1;
        while (ans*3<=n){
        ans*=3;
        }
        System.out.println(ans);
    }
}
