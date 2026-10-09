package practice;
import java.util.Random;
import java.util.Scanner;
public class pubg {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int health=100;
        int enemies =5;
        System.out.println(" Enter you name ");
        String n= sc.next();
        while (health>0&&enemies>0) {
            System.out.println("(1) Attack");
            System.out.println("(2) defend");
            System.out.println("(3) run");
            int choose = sc.nextInt();
            if (choose == 1) {
                int damage = (int) (Math.random() * 50) + 10;
                enemies--;
                System.out.println("you attack and get  " + damage +" damage");
            } else if (choose == 2) {
                int damage = (int) (Math.random() * 20);
                health -= damage;
                System.out.println("you defend but  enemy  attack get damage and your health " + health);
            } else if (choose == 3) {
                int damage = (int) (Math.random() * 50) + 20;
                health -= damage;
                System.out.println("you  try to run but enemies attack you so you get damage and your health " + health);
            } else {
                health -= 20;
                System.out.println("invalid input so u get damage ");
            }
        }
            System.out.println("enemies remaining "+ enemies);
            if (health>0){
                System.out.println("you win "+ n);
            }
            else {
                System.out.println("you loose");
            }

        }


}
