package ad1;
import java.util.Scanner;
public class Q2 {
    public static  int linearSearch(int []arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int target = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Enter the number");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum is "+linearSearch(arr,target));
    }

}
