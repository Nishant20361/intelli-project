//import java.util.Arrays;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter the number ");
//        int n = sc.nextInt();
//        int count = 0;
//        for (int i = 2; i <=n; i++) {
//            while (n % i == 0) {
//                count++;
//                n /= i;
//            }
//                if (count > 2) {
//                    break;
//                }
//                }
//            if (count == 2) {
//                System.out.println(" is is semiprime");
//            } else {
//                System.out.println(" not");
//            }

        //  System.out.println("enter ");

//        int sum = 0;
//        while (true) {
//            int n = sc.nextInt();
//            if (n <0) {
//
//                break;
//            }
//
//            sum+=n;
//        }
//        System.out.println(sum);

//        System.out.println(" Enter the size");
//        int a= sc.nextInt();
//        System.out.println( " input array");
//        int []arr1= new int[a];
//        for (int i = 0; i <a ; i++) {
//            arr1[i]= sc.nextInt();
//        }
//        System.out.println("enter the size ");
//        int b= sc.nextInt();
//        System.out.println( " input array");
//         int []arr2=new int[b];
//        for (int j = 0; j <b ; j++) {
//            arr2[j]= sc.nextInt();
//        }
//        for (int i = 0; i<a ; i++) {
//            for (int j = 0; j < b; j++) {
//                if (arr1[i]==arr2[j]){
//                    System.out.println(arr1[i]);
//                    break;
//                }
//            }
//
//        }
//        System.out.println("Enter the number ");
//        int n= sc.nextInt();
//        int[] arr= new int[n];
//        int[] s= new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i]= sc.nextInt();
//             s [i]=arr[i];
//        }
//        int temp;
//        for (int i = 0; i < n/2; i++) {
//           if (arr[i]==arr[n-i-1]){
//               System.out.println(" palindrome");
//               break;
//           }
//           else {
//               System.out.println(" is not palindorme");
//               break;
//           }
//
//        }
//        System.out.println(" size of the array");
//        int a= sc.nextInt();
//        int[] arr = {1, 4, 2, 2, 3, 9};
//        int l = arr.length;
//
//        for (int i = 0; i < l; i++) {
//            for (int j = 0; j < l - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//
//                }
//
//            }
//        }
//        int temp[] = new int[l];
//        int j = 0;
//        for (int i = 0; i < l - 1; i++) {
//            if (arr[i] != arr[i + 1]) {
//                temp[j]=arr[i];
//                j++;
//            }
//
//        }
//        temp[j] = arr[l - 1];
//        j++;
//        for (int i = 0; i < j; i++) {
//
//
//            System.out.println(temp[i]);
//        }

        for (int i = 65; i <= 69; i++) {
            for (int j = i; j <= 69; j++) {
                System.out.print("\t");

            }

            for (int j = 65; j <= i; j++) {
                System.out.print("\t"+"\t"+(char) (i) + " ");
            }
            System.out.println(" ");
        }
    }
}