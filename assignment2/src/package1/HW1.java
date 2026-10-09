package package1;
import java.util.Scanner;
public class HW1 {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number of minutes: ");
                int min=sc.nextInt();
                int yearmin=365*24*60;
                int daymin=24*60;
                int noyears=min/yearmin;
                int nodays=(min%yearmin)/daymin;
                System.out.println(min+" is approximately "+noyears+" years and "+nodays+" days");
            }

        }

