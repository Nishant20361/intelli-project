package Package1;
/*Write a java program to calculate the monthly electricity bill. The tariff is given as
follows:
Price per unit Unit range
Rs. 3/- First 50 units
Rs. 4.80/- 50-200 units
Rs. 5.80/- 200-400 units
Rs. 6.20/- Above 400 units*/
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the units ");
        double u= sc.nextDouble();
        double bill=0;
        if (u<=50)
            bill=u*3;
        else if (u>50&&u<=200)
        bill=50*3+(u-50)*4.80;
        else if (u>200&&u<=400)
        bill=50*3+150*4.80+(u-200)*5.80;
        else
            bill=50*3+150*4.80+200*5.80+(u-400)*6.20;
        System.out.println("bill "+bill);


    }
}
