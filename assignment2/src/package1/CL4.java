package package1;
import java.util.Scanner;
import java.lang.Math;
public class CL4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value t");
        double t=sc.nextDouble();
        double result= Math.cos(5*t)+Math.sin(7*t);
        System.out.println("Result    "+result);
    }
}
