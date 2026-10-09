import  java .util.Scanner;
public class Circle {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter your lucky number");
        int a = sc.nextInt();
        try {
            if (a<0)
                throw new Exception("lucky number cannot be zero");
            else
                System.out.println("your lucky number "+a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("try again");
    }

    }