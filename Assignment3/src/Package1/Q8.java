package Package1;
/*Write a java program that takes the x – y coordinates of a point in the Cartesian plane
and prints a message telling either an axis on which the point lies or the quadrant in
which it is found.
Here is the sample output:
(-1.0, -2.5) is in quadrant III
(0.0, 4.8) is on the y-axis*/
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x digit");
        double x= sc.nextDouble();
        System.out.println(" Enter the y digit");
        double y=sc.nextDouble();
        if (x>0&&y>0)
            System.out.println(x+" , "+y+" quadrant I");
        else if (x>0&&y<0)
            System.out.println(x+" , "+y+" quadrant II");
        else if (x<0&&y<0)
            System.out.println(x+" , "+y+" quadrant III");
        else if (x<0&&y>0)
            System.out.println(x+" , "+y+"  quadrant IV");
        else if (x==0&&y>0||y<0)
            System.out.println("  Is on the y axis");
        else
            System.out.println(" is on the x axix");

    }
}
