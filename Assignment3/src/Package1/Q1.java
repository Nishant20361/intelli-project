package Package1;
///Write a program to input the age of a person and check if the age of the person is
/// greater than or equal to 18 then print the message:
/// “You are eligible to cast your vote”.
import java .util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int n= sc.nextInt();
        if (n>18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not eligible for voting");
        }
    }
}
