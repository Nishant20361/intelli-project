package homework;
import  java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("no of element");
        int n= sc.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        int []c=new int[n];
        System.out.println(" enter the product of a array");
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        System.out.println(" enter the product of B array");
        for (int i = 0; i <n; i++) {
            b[i]= sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }
        System.out.println(" the dot product are");
        for (int i = 0; i < n; i++) {

            System.out.println(c[i]);
        }
    }
}
