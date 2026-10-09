package practice;
//import java.util.Scanner;
public class Q1 {


    public static void main(String[] args) {
    //    Scanner scanner = new Scanner(System.in);

        int[] arr = {16, 17, 4, 3, 5,2};

        for (int i = 0; i < arr.length; i++) {
            boolean s = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    s = false;
                    break;
                }
            }
            if (s) {
                System.out.println(arr[i]);
            }
        }
    }
}


