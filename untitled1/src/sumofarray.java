import javax.lang.model.element.Element;
import java.util.*;
public class sumofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      /*  int []n={2,3,5,87,99};
        int sum=0;
        for (int element:n){
            sum+=element;
        }
        System.out.println(sum);



      //  practice 2
        int []n={2,3,5,87,99};
        int a= 99;
        boolean ispresent=false;
        for (int element:n){
            if (a==element){
                ispresent=true;
                break;
            }
        }if (ispresent)
        System.out.println(" the number present in the array");
        else
            System.out.println("Nahi h");

        // Practice 3  (Average n)
        int []n={2,3,5,87,99};
        int sum=0;
        for (int element:n){
            sum+=element;
        }
        System.out.println(sum/n.length);

        // sum of two Matrices (practice 4)
         int [][]a={{2,1,4},
                    {3,4,1}};
         int[][]b={{2,2,1},
                   {4,1,1}};
         int[][]sum={{0,0,0},
                     {0,0,0}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
               // System.out.format("setting   value for i=%d  and j=%d  \n",i,j);
                sum[i][j]= a[i][j] + b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("");
        }

        //reverse number practice 5

        int []arr= { 1,2,3,4,5,6};
        int l= arr.length;
         int n=Math.floorDiv(l,2);
        int temp;
        for (int i = 0; i < n; i++) {
            //Swap arr[i] and arr[l-i-1]
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;

        }
        for(int elemnt:arr){
            System.out.print(elemnt+" ");

        }*/

        // find maximum number;
//
//        int []arr= { 1,2,35,4,5,6};
//        int max=Integer.MIN_VALUE;
//        for (int e:arr){
//            if (e>max){
//                max=e;
//            }
//        }
//        System.out.println(max);
//

//        int[] arr = {1, 2, 23, 4, 5, 6};
//        //boolean issorted=false;
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-i-1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                int temp=arr[j];
//                arr[j]=arr[j+1];
//                arr[j+1]=temp;
//            }
//            }
//        }
//        for (int i :arr ) {
//            System.out.println(i);
//
//        }
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for (int i :arr ) {
//            System.out.println(i);
//
//        }
//        int arr[]={1,2,3,4,5,5,2};
//        Arrays.sort(arr);
//        int n = arr.length;
//        for (int i = 0; i <n-1; i++) {
//            if (arr[i]!=arr[i+1]){
//                System.out.println(arr[i]);
//            }
//
//
//        }
//       System.out.println(arr[n-1]);


        int n= sc.nextInt();
        int t=n;
        int rev=0;
        while (n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;

        }
        n=rev;
         rev=0;
        while (n>0){
            int digit=n%10;
            if (digit!=0){
                rev=rev*10+digit;
                n=n/10;
            }

        }
        System.out.println(rev);
    }


}