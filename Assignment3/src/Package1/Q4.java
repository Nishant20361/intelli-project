package Package1;
/*Make a simple game involving a computer and a user. The computer first guesses a
        number between 1 and 9 inclusive, then ask the user to enter a number between 1 and
        9 inclusive. If the user guess is correct then display “You got it right”, if the guess is
        close (+1,
        -1) “Almost got it “, Otherwise “You got it wrong”.
        Here are some sample runs.
        Enter user number: 2
        Computer guesses: 3
        “Almost got it”
        Enter user number: 4
        Computer guesses: 4
        “You got it right”
        Enter user number: 1
        Computer guesses: 5
        “You got it wrong”*/
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        int b;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the user number");
        b=sc.nextInt();
        int a=(int)((Math.random())*9)+1;
        System.out.println(" computer guesses "+a);
        if(a==b){
            System.out.println("you got it right");
        }
        else if(a-b==1||b-a==1){
            System.out.println("almost close ");

        }
        else
        {
            System.out.println("you got it wrong ");
        }


    }
}
