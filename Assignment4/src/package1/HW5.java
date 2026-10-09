package package1;
/*Write a java program to print the following output using loop. Where, input is the number of
rows in output pattern.
For input, N = 4.
1
121
1213121
121312141213121*/
import java.util.Scanner;
public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no  ");
        int n = sc.nextInt();
        String s = " ";
        for (int i = 1; i <= n; i++) {

            s = s + i + s;
            System.out.println(s);
        }
    }
}