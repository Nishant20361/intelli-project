package package1;
/*Write a program that will read the value of n from the user and calculate sum of the following
series:
1
12 + 1
22 + 1
32 + 1
42+ ... + 1
𝑛2.*/
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the integer");
        double n= sc.nextDouble();
        double p,sum=0;
        for (int i=1;i<=n;i++){
            p=i*i;
            sum+=1.0/(i*i);
            System.out.print("1/"+p+" + ");

        }
        System.out.println(" = "+sum);
    }
}
