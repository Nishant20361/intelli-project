/* Write the iterative code of “Linear Search”
Constraints:
1. Type of input: Integer
2. No. of inputs: max 100
3. Output: Present/Absent
4. No. of searching input: 1 (at a time) */
package ASSIGNMENT1;
import java.util.*;
public class Q2 {
    public static int linearSearch(int[] arr,int target ){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }

            
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int m= sc.nextInt();
        if (m>100){
            System.out.println("warning: exceed enter the less than 100");
            return;
        }
        if (m<0){
            System.out.println("warning: exceed enter more than zero");
            return;
        }
        int [] arr=new int[m];
        System.out.println("the number are");
        for (int i = 0; i < m; i++) {
            arr[i]= (int)(Math.random()*100);
            System.out.println(arr[i]);
        }
        System.out.println("Enter the number you want to search");
        int target = sc.nextInt();
        int index=linearSearch(arr,target);
        if (index !=-1){
            System.out.println("the number present");
        }
        else {
            System.out.println("the number not present");
        }
    }
}
