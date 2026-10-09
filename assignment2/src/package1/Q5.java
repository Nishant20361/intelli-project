package package1;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        //double Pi = 3.14;
        //SA= surface area
        double radius, SA, volume;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius= sc.nextDouble();
        SA=3*Math.PI*radius*radius;
        System.out.println("Surface Area of the hemisphere is"+" "+SA);
volume=(2.0/3)*Math.PI*radius*radius*radius;
        System.out.println("volume of the hemisphere is"+" "+volume);

    }


}
