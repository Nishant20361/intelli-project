package classwork;
import  java.util.*;
public class Q6 {
    public static boolean odd( int n){
        if ((n&1)==0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  odd number");
        int n= sc.nextInt();
        System.out.println(odd(n));
    }
}
