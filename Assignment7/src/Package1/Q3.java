package Package1;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a={12,23,1,5,6,2,2,7,9,19};
        System.out.println(" Enter the number want to find  in the array");
        int n= sc.nextInt();
        boolean present=false;

           for(int i = 0; i <a.length ; i++) {
            if (n==a[i]) {
                System.out.println(" The array is present "+n+" posi"+  i+ " tion "+a[i]+(a[i]>1?" times ":" time") );
                present = true;
                break;
            }
        }
        if (!present)
            System.out.println(" the array is not found");
    }
}






