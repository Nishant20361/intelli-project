package package1;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter he distance in km=");
        double distance=sc.nextDouble();
        double metre=distance*1000;
        double feet=distance*3280.8399;
        double inch=distance*39370.06895;
        double centimetre=distance*10000;
        System.out.println(distance+" "+"km is\n"+metre+" "+"metre\n"+feet+" "+"feet\n"+" "+inch+" "+"inch\n"+centimetre+" "+"cm");









    }
}
