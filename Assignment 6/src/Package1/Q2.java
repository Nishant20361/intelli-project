package Package1;
import java .util.Scanner;
public class Q2 {
    public static int pentagonal(int n){
        return n*(3*n-1)/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the number");
        int n= sc.nextInt();
        int x=pentagonal(n);
        System.out.println(x);


    }
}
