import java.util.Scanner;
public class fabinacciseries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int z=0;
        System.out.print(a +" "+b);
        for (int j = 3; j <=n ; j++) {
            z = a + b;
            a = b;
            b = z;
        }
                System.out.print(z+" ");

            }
        }


