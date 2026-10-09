package practice;

import java.util.Scanner;

public class Dragontiger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("WELCOME TO THE DRAGON [ 🐉 ] || TIGER GAME [ 🐯 ]");
        System.out.println("ADD BALANCE 😋💵");
        double balance = sc.nextDouble();
        double winning ;
        double tax;
        while(balance>0) {

            System.out.println("bet price");
            int m = sc.nextInt();

            if (m>=balance){
                System.out.println("you don't have sufficient balance  please bet your less or equal amount of your balance and play again");
                continue;
            }
            balance-=m;
            System.out.println("remaining balance "+balance);
            System.out.println("CHOOSE YOUR OPTION");
            System.out.println("(1) dragon [ 🐉 ]\n(2) tiger [ 🐯 ]");
            int n = sc.nextInt();
            int r = (int) (Math.random() * 2) + 1;
            System.out.println(r);
            if (r == 1) {
                System.out.println("RESULT👀");
                System.out.println("Dragon [ 🐉 ]");
            } else if (r==2){
                System.out.println("RESULT👀");
                System.out.println("tiger [ 🐯 ]");
            }
            else {
                System.out.println("Invalid choice! Please play again and choose the right option.");
                continue;
            }
            if (r == n) {
                tax = 2 * m * 0.05;
                winning=2*m-tax;
                balance+=winning;
                System.out.println("you win 🏆 " + winning+" rupees and your balance [💵] "+balance);
            } else {
                System.out.println("you loose 😭 🤪");
                System.out.println("your balance is  " + balance);
            }
        }
    }
}
