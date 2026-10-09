package package1;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        double salary;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic salary");
        salary =sc.nextDouble();
        double DA= 40.00/100*salary;
        double HRA=20.00/100*salary;
        double GS=DA+HRA+salary;
        System.out.println("DA  = "+DA);
        System.out.println("HRA  = "+HRA);
        System.out.println("Gross salary = "+GS );

    }

}
