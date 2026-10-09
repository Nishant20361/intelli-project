import java.util.Scanner;
public class assignmenthw2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the min");
        int min= sc.nextInt();
        int year=365*24*60;
        int day=24*60;
        int year1=min/year;
      int day1=(min%year)/day;
        System.out.println(min+" "+"minute is apoximately"+" "+year1+" "+"year"+" "+day1+" "+"day");
    }
}