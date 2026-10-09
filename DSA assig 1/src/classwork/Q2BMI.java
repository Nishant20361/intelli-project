package classwork;
import java.util.*;
public class Q2BMI {
    public static void main (String [] args){
        Scanner sc = new Scanner ( System.in);
        System.out.println("enter the body weight");
        double w=sc.nextDouble();
        System.out.println("enter the height");
        double h= sc.nextDouble();
        double bmi=w/(h*h);
        if(bmi<18.5) {
            System.out.println("Underweight");
        }
        else if(bmi>=18.5&& bmi<24.9){
            System.out.println("normal weight");
        }
        else if (bmi>=25.0&&bmi<29.9) {
            System.out.println("over weight");
        }
        else {
            System.out.println("obese");
        }
    }
}
