package package1;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter  the length of the array : ");
        int n= sc.nextInt();
        int []arr=new int[n];
        boolean ascending=true;
        boolean descending=true;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <n-1 ; i++) {
            if (arr[i]<arr[i+1] ){
                descending=false;
            }
            else if (arr[i]>arr[i+1]) {
                ascending=false;
            }
        }
        if (ascending){
            System.out.println("yes ascending");
        } else if (descending) {
            System.out.println("yes descending");
        }
        else {
            System.out.println("The array is not sorted");
        }
    }
}
