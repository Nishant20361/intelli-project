import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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
