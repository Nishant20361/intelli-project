package Package1;
/*From the above question no. (6) write a java program with a choice if the consumer
wants to pay bill online. Consumer who pays their electricity bill online will get a
discount of 3%.
Here is the sample output:
No. of units consumed: 867
Do you want to pay online(y/n): y
Total amount: 4925.4
Discount: 147.762
Amount payable: 4777.638*/
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit");
        double u = sc.nextDouble();
        double bill = 0;
        if (u <= 50)
            bill = u * 3;
        else if (u > 50 && u <= 200)
            bill = 50 * 3 + (u - 50) * 4.80;
        else if (u > 200 && u <= 400)
            bill = 50 * 3 + 150 * 4.80 + (u - 200) * 5.80;
        else
            bill = 50 * 3 + 150 * 4.80 + 200 * 5.80 + (u - 400) * 6.20;
        System.out.println("do you want to pay your bill online?(y/n)");
        char choice = sc.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {

            System.out.println("your total amount of bill is :" + bill);
            double dis = bill * 0.03;
            System.out.println("discount:" + dis);
            System.out.println("amount payable:" + (bill - dis));

        } else{

        System.out.println("amount payable:" + bill);
    }




    }
}
