package Package1;
import java.util.Scanner;
public class Q5 {
    public static double area(int n, double s){
      double are=(n*s*s)/(2*Math.sin(Math.PI/n));
      return are;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" no of sided");
        int n= sc.nextInt();
        System.out.println("length of the side ");
        double s= sc.nextInt();
        System.out.println("the area is "+area(n,s));
    }
}
