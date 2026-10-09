package Package1;
/*Write a java program that plays the popular scissor-rock-paper game. (A scissor can cut
a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program
randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The
program prompts the user to enter a number 0, 1, or 2 and displays a message indicating
whether the user or the computer wins, loses, or draws.
Here are sample runs:
scissor (0), rock (1), paper (2): 1
The computer is scissor. You are rock. You won
scissor (0), rock (1), paper (2): 2
The computer is paper. You are paper too. It is a draw*/
import java.util.Scanner;
public class HW1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("choose (0)Scissor, (1)rock, (2)paper");
        int n= sc.nextInt();
        System.out.println("you choose ");
      if (n==0)
            System.out.println("Scissor");
        else if (n==1)
            System.out.println("rock");
            else if (n==2)
            System.out.println("paper");
        int a=(int)(Math.random()*3);
        System.out.println("Computer guess ");
        if (a==0)
            System.out.println("Scissor");
        else if (a == 1)
                System.out.println("rock");
            else if (a == 2)
                System.out.println("paper");
        System.out.println(" ");
        if (a==n)
            System.out.println("it is draw");
        else if (a<n)
            System.out.println(" you win");
            else
            System.out.println("computer win");

        }
    }






