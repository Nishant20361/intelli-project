package Package1;
import java .util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        int []occ=new int[100];
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter the no ( Pease end with 0");
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            if (n >= 1 && n <= 100) {
                occ[n]++;
            }
        }
            for (int i = 1; i < 100; i++) {
                if (occ[i]>0){
                    System.out.println(i+" occur "+occ[i]+(occ[i]>1?" times ":" time"));
                }
            }
        }
    }

