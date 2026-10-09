package Package1;
import java.util.Random;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the number of the arrarys");
        int n= sc.nextInt();
        int []arr=new int[n];
        int sum=0;
        for (int i = 0; i<n ; i++) {
            arr[i]=(int) (Math.random()*100);
            sum+=arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        double average=(double) sum/n;
        System.out.println(sum);
        System.out.println(average);
    }
}
